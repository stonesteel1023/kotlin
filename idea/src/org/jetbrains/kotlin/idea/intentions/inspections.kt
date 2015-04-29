/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.intentions

import com.intellij.codeInspection.ProblemHighlightType
import org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection
import org.jetbrains.kotlin.idea.intentions.attributeCallReplacements.ReplaceGetIntention
import org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention
import org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention
import org.jetbrains.kotlin.psi.*

public class ExplicitGetInspection : IntentionBasedInspection<JetDotQualifiedExpression>(ReplaceGetIntention())

public class IfThenToElvisInspection : IntentionBasedInspection<JetIfExpression>(IfThenToElvisIntention())

public class IfThenToSafeAccessInspection : IntentionBasedInspection<JetIfExpression>(IfThenToSafeAccessIntention())

public class IfNullToElvisInspection : IntentionBasedInspection<JetIfExpression>(IfNullToElvisIntention())

public class RemoveExplicitTypeArgsInspection : IntentionBasedInspection<JetTypeArgumentList>(RemoveExplicitTypeArguments()) {
    override val problemHighlightType: ProblemHighlightType
        get() = ProblemHighlightType.LIKE_UNUSED_SYMBOL
}

public class SimplifyBinaryNegationInspection : IntentionBasedInspection<JetPrefixExpression>(SimplifyNegatedBinaryExpressionIntention())

public class ReplaceWithOperatorAssignInspection : IntentionBasedInspection<JetBinaryExpression>(ReplaceWithOperatorAssignIntention())

