package androidx.compose.material3;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b2\b\u0007\u0018\u00002\u00020\u0001Bß\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J½\u0003\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u0002¢\u0006\u0004\b1\u00102J#\u00108\u001a\u00020\r*\u0004\u0018\u00010\r2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\r04H\u0000¢\u0006\u0004\b6\u00107J'\u0010?\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001¢\u0006\u0004\b=\u0010>J'\u0010A\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001¢\u0006\u0004\b@\u0010>J'\u0010C\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001¢\u0006\u0004\bB\u0010>J'\u0010E\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001¢\u0006\u0004\bD\u0010>J'\u0010G\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001¢\u0006\u0004\bF\u0010>J'\u0010I\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001¢\u0006\u0004\bH\u0010>J'\u0010K\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001¢\u0006\u0004\bJ\u0010>J'\u0010M\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001¢\u0006\u0004\bL\u0010>J'\u0010O\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001¢\u0006\u0004\bN\u0010>J'\u0010Q\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001¢\u0006\u0004\bP\u0010>J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010;\u001a\u000209H\u0001¢\u0006\u0004\bR\u0010SJ\u001a\u0010U\u001a\u0002092\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bX\u0010YR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010Z\u001a\u0004\b]\u0010\\R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010Z\u001a\u0004\b^\u0010\\R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010Z\u001a\u0004\b_\u0010\\R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010Z\u001a\u0004\b`\u0010\\R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010Z\u001a\u0004\ba\u0010\\R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010Z\u001a\u0004\bb\u0010\\R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010Z\u001a\u0004\bc\u0010\\R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\bd\u0010\\R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010Z\u001a\u0004\be\u0010\\R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010f\u001a\u0004\bg\u0010hR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\bi\u0010\\R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\bj\u0010\\R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010Z\u001a\u0004\bk\u0010\\R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010Z\u001a\u0004\bl\u0010\\R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010Z\u001a\u0004\bm\u0010\\R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010Z\u001a\u0004\bn\u0010\\R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010Z\u001a\u0004\bo\u0010\\R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010Z\u001a\u0004\bp\u0010\\R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010Z\u001a\u0004\bq\u0010\\R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010Z\u001a\u0004\br\u0010\\R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010Z\u001a\u0004\bs\u0010\\R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010Z\u001a\u0004\bt\u0010\\R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010Z\u001a\u0004\bu\u0010\\R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010Z\u001a\u0004\bv\u0010\\R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010Z\u001a\u0004\bw\u0010\\R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010Z\u001a\u0004\bx\u0010\\R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010Z\u001a\u0004\by\u0010\\R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010Z\u001a\u0004\bz\u0010\\R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010Z\u001a\u0004\b{\u0010\\R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010Z\u001a\u0004\b|\u0010\\R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010Z\u001a\u0004\b}\u0010\\R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010Z\u001a\u0004\b~\u0010\\R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010Z\u001a\u0004\b\u007f\u0010\\R\u0018\u0010&\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b&\u0010Z\u001a\u0005\b\u0080\u0001\u0010\\R\u0018\u0010'\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b'\u0010Z\u001a\u0005\b\u0081\u0001\u0010\\R\u0018\u0010(\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b(\u0010Z\u001a\u0005\b\u0082\u0001\u0010\\R\u0018\u0010)\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b)\u0010Z\u001a\u0005\b\u0083\u0001\u0010\\R\u0018\u0010*\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b*\u0010Z\u001a\u0005\b\u0084\u0001\u0010\\R\u0018\u0010+\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b+\u0010Z\u001a\u0005\b\u0085\u0001\u0010\\R\u0018\u0010,\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b,\u0010Z\u001a\u0005\b\u0086\u0001\u0010\\R\u0018\u0010-\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b-\u0010Z\u001a\u0005\b\u0087\u0001\u0010\\R\u0018\u0010.\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b.\u0010Z\u001a\u0005\b\u0088\u0001\u0010\\¨\u0006\u0089\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldColors;", "", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "<init>", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-ejIjP34", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/TextFieldColors;", "copy", "Lkotlin/Function0;", "block", "takeOrElse$material3", "(Landroidx/compose/foundation/text/selection/TextSelectionColors;Lkotlin/jvm/functions/Function0;)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "takeOrElse", "", "enabled", "isError", "focused", "leadingIconColor-XeAY9LY$material3", "(ZZZ)J", "leadingIconColor", "trailingIconColor-XeAY9LY$material3", "trailingIconColor", "indicatorColor-XeAY9LY$material3", "indicatorColor", "containerColor-XeAY9LY$material3", "containerColor", "placeholderColor-XeAY9LY$material3", "placeholderColor", "labelColor-XeAY9LY$material3", "labelColor", "textColor-XeAY9LY$material3", "textColor", "supportingTextColor-XeAY9LY$material3", "supportingTextColor", "prefixColor-XeAY9LY$material3", "prefixColor", "suffixColor-XeAY9LY$material3", "suffixColor", "cursorColor-vNxB06k$material3", "(Z)J", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getFocusedTextColor-0d7_KjU", "()J", "getUnfocusedTextColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getErrorTextColor-0d7_KjU", "getFocusedContainerColor-0d7_KjU", "getUnfocusedContainerColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getErrorContainerColor-0d7_KjU", "getCursorColor-0d7_KjU", "getErrorCursorColor-0d7_KjU", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getTextSelectionColors", "()Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getFocusedIndicatorColor-0d7_KjU", "getUnfocusedIndicatorColor-0d7_KjU", "getDisabledIndicatorColor-0d7_KjU", "getErrorIndicatorColor-0d7_KjU", "getFocusedLeadingIconColor-0d7_KjU", "getUnfocusedLeadingIconColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "getErrorLeadingIconColor-0d7_KjU", "getFocusedTrailingIconColor-0d7_KjU", "getUnfocusedTrailingIconColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "getErrorTrailingIconColor-0d7_KjU", "getFocusedLabelColor-0d7_KjU", "getUnfocusedLabelColor-0d7_KjU", "getDisabledLabelColor-0d7_KjU", "getErrorLabelColor-0d7_KjU", "getFocusedPlaceholderColor-0d7_KjU", "getUnfocusedPlaceholderColor-0d7_KjU", "getDisabledPlaceholderColor-0d7_KjU", "getErrorPlaceholderColor-0d7_KjU", "getFocusedSupportingTextColor-0d7_KjU", "getUnfocusedSupportingTextColor-0d7_KjU", "getDisabledSupportingTextColor-0d7_KjU", "getErrorSupportingTextColor-0d7_KjU", "getFocusedPrefixColor-0d7_KjU", "getUnfocusedPrefixColor-0d7_KjU", "getDisabledPrefixColor-0d7_KjU", "getErrorPrefixColor-0d7_KjU", "getFocusedSuffixColor-0d7_KjU", "getUnfocusedSuffixColor-0d7_KjU", "getDisabledSuffixColor-0d7_KjU", "getErrorSuffixColor-0d7_KjU", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextFieldColors {
    private final long cursorColor;
    private final long disabledContainerColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledPrefixColor;
    private final long disabledSuffixColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorContainerColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorPlaceholderColor;
    private final long errorPrefixColor;
    private final long errorSuffixColor;
    private final long errorSupportingTextColor;
    private final long errorTextColor;
    private final long errorTrailingIconColor;
    private final long focusedContainerColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedPlaceholderColor;
    private final long focusedPrefixColor;
    private final long focusedSuffixColor;
    private final long focusedSupportingTextColor;
    private final long focusedTextColor;
    private final long focusedTrailingIconColor;

    @NotNull
    private final TextSelectionColors textSelectionColors;
    private final long unfocusedContainerColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedPlaceholderColor;
    private final long unfocusedPrefixColor;
    private final long unfocusedSuffixColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTextColor;
    private final long unfocusedTrailingIconColor;

    public /* synthetic */ TextFieldColors(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, TextSelectionColors textSelectionColors, long j65, long j69, long j76, long j85, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, long j122, long j123, long j124, long j125, long j126, long j127, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5, j16, j22, j42, j46, j47, j57, j58, textSelectionColors, j65, j69, j76, j85, j100, j101, j102, j103, j104, j105, j106, j107, j108, j109, j110, j111, j112, j113, j114, j115, j116, j117, j118, j119, j120, j121, j122, j123, j124, j125, j126, j127);
    }

    /* JADX INFO: renamed from: copy-ejIjP34$default, reason: not valid java name */
    public static /* synthetic */ TextFieldColors m1402copyejIjP34$default(TextFieldColors textFieldColors, long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, TextSelectionColors textSelectionColors, long j65, long j69, long j76, long j85, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, long j122, long j123, long j124, long j125, long j126, long j127, int i, int i2, Object obj2) {
        long j128;
        long j129;
        long j130 = (i & 1) != 0 ? textFieldColors.focusedTextColor : j2;
        long j131 = (i & 2) != 0 ? textFieldColors.unfocusedTextColor : j3;
        long j132 = (i & 4) != 0 ? textFieldColors.disabledTextColor : j5;
        long j133 = (i & 8) != 0 ? textFieldColors.errorTextColor : j16;
        long j134 = (i & 16) != 0 ? textFieldColors.focusedContainerColor : j22;
        long j135 = (i & 32) != 0 ? textFieldColors.unfocusedContainerColor : j42;
        if ((i & 64) != 0) {
            j128 = j130;
            j129 = textFieldColors.disabledContainerColor;
        } else {
            j128 = j130;
            j129 = j46;
        }
        return textFieldColors.m1404copyejIjP34(j128, j131, j132, j133, j134, j135, j129, (i & 128) != 0 ? textFieldColors.errorContainerColor : j47, (i & 256) != 0 ? textFieldColors.cursorColor : j57, (i & 512) != 0 ? textFieldColors.errorCursorColor : j58, (i & 1024) != 0 ? textFieldColors.textSelectionColors : textSelectionColors, (i & 2048) != 0 ? textFieldColors.focusedIndicatorColor : j65, (i & 4096) != 0 ? textFieldColors.unfocusedIndicatorColor : j69, (i & 8192) != 0 ? textFieldColors.disabledIndicatorColor : j76, (i & 16384) != 0 ? textFieldColors.errorIndicatorColor : j85, (i & 32768) != 0 ? textFieldColors.focusedLeadingIconColor : j100, (i & 65536) != 0 ? textFieldColors.unfocusedLeadingIconColor : j101, (i & 131072) != 0 ? textFieldColors.disabledLeadingIconColor : j102, (i & 262144) != 0 ? textFieldColors.errorLeadingIconColor : j103, (i & 524288) != 0 ? textFieldColors.focusedTrailingIconColor : j104, (i & PKIFailureInfo.badCertTemplate) != 0 ? textFieldColors.unfocusedTrailingIconColor : j105, (i & PKIFailureInfo.badSenderNonce) != 0 ? textFieldColors.disabledTrailingIconColor : j106, (i & 4194304) != 0 ? textFieldColors.errorTrailingIconColor : j107, (i & 8388608) != 0 ? textFieldColors.focusedLabelColor : j108, (i & 16777216) != 0 ? textFieldColors.unfocusedLabelColor : j109, (i & 33554432) != 0 ? textFieldColors.disabledLabelColor : j110, (i & 67108864) != 0 ? textFieldColors.errorLabelColor : j111, (i & 134217728) != 0 ? textFieldColors.focusedPlaceholderColor : j112, (i & 268435456) != 0 ? textFieldColors.unfocusedPlaceholderColor : j113, (i & PKIFailureInfo.duplicateCertReq) != 0 ? textFieldColors.disabledPlaceholderColor : j114, (i & 1073741824) != 0 ? textFieldColors.errorPlaceholderColor : j115, (i & Integer.MIN_VALUE) != 0 ? textFieldColors.focusedSupportingTextColor : j116, (i2 & 1) != 0 ? textFieldColors.unfocusedSupportingTextColor : j117, (i2 & 2) != 0 ? textFieldColors.disabledSupportingTextColor : j118, (i2 & 4) != 0 ? textFieldColors.errorSupportingTextColor : j119, (i2 & 8) != 0 ? textFieldColors.focusedPrefixColor : j120, (i2 & 16) != 0 ? textFieldColors.unfocusedPrefixColor : j121, (i2 & 32) != 0 ? textFieldColors.disabledPrefixColor : j122, (i2 & 64) != 0 ? textFieldColors.errorPrefixColor : j123, (i2 & 128) != 0 ? textFieldColors.focusedSuffixColor : j124, (i2 & 256) != 0 ? textFieldColors.unfocusedSuffixColor : j125, (i2 & 512) != 0 ? textFieldColors.disabledSuffixColor : j126, (i2 & 1024) != 0 ? textFieldColors.errorSuffixColor : j127);
    }

    /* JADX INFO: renamed from: containerColor-XeAY9LY$material3, reason: not valid java name */
    public final long m1403containerColorXeAY9LY$material3(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledContainerColor : isError ? this.errorContainerColor : focused ? this.focusedContainerColor : this.unfocusedContainerColor;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ejIjP34, reason: not valid java name */
    public final TextFieldColors m1404copyejIjP34(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, TextSelectionColors textSelectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor) {
        return new TextFieldColors(focusedTextColor != 16 ? focusedTextColor : this.focusedTextColor, unfocusedTextColor != 16 ? unfocusedTextColor : this.unfocusedTextColor, disabledTextColor != 16 ? disabledTextColor : this.disabledTextColor, errorTextColor != 16 ? errorTextColor : this.errorTextColor, focusedContainerColor != 16 ? focusedContainerColor : this.focusedContainerColor, unfocusedContainerColor != 16 ? unfocusedContainerColor : this.unfocusedContainerColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, errorContainerColor != 16 ? errorContainerColor : this.errorContainerColor, cursorColor != 16 ? cursorColor : this.cursorColor, errorCursorColor != 16 ? errorCursorColor : this.errorCursorColor, takeOrElse$material3(textSelectionColors, new wp0.b(this, 15)), focusedIndicatorColor != 16 ? focusedIndicatorColor : this.focusedIndicatorColor, unfocusedIndicatorColor != 16 ? unfocusedIndicatorColor : this.unfocusedIndicatorColor, disabledIndicatorColor != 16 ? disabledIndicatorColor : this.disabledIndicatorColor, errorIndicatorColor != 16 ? errorIndicatorColor : this.errorIndicatorColor, focusedLeadingIconColor != 16 ? focusedLeadingIconColor : this.focusedLeadingIconColor, unfocusedLeadingIconColor != 16 ? unfocusedLeadingIconColor : this.unfocusedLeadingIconColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, errorLeadingIconColor != 16 ? errorLeadingIconColor : this.errorLeadingIconColor, focusedTrailingIconColor != 16 ? focusedTrailingIconColor : this.focusedTrailingIconColor, unfocusedTrailingIconColor != 16 ? unfocusedTrailingIconColor : this.unfocusedTrailingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, errorTrailingIconColor != 16 ? errorTrailingIconColor : this.errorTrailingIconColor, focusedLabelColor != 16 ? focusedLabelColor : this.focusedLabelColor, unfocusedLabelColor != 16 ? unfocusedLabelColor : this.unfocusedLabelColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, errorLabelColor != 16 ? errorLabelColor : this.errorLabelColor, focusedPlaceholderColor != 16 ? focusedPlaceholderColor : this.focusedPlaceholderColor, unfocusedPlaceholderColor != 16 ? unfocusedPlaceholderColor : this.unfocusedPlaceholderColor, disabledPlaceholderColor != 16 ? disabledPlaceholderColor : this.disabledPlaceholderColor, errorPlaceholderColor != 16 ? errorPlaceholderColor : this.errorPlaceholderColor, focusedSupportingTextColor != 16 ? focusedSupportingTextColor : this.focusedSupportingTextColor, unfocusedSupportingTextColor != 16 ? unfocusedSupportingTextColor : this.unfocusedSupportingTextColor, disabledSupportingTextColor != 16 ? disabledSupportingTextColor : this.disabledSupportingTextColor, errorSupportingTextColor != 16 ? errorSupportingTextColor : this.errorSupportingTextColor, focusedPrefixColor != 16 ? focusedPrefixColor : this.focusedPrefixColor, unfocusedPrefixColor != 16 ? unfocusedPrefixColor : this.unfocusedPrefixColor, disabledPrefixColor != 16 ? disabledPrefixColor : this.disabledPrefixColor, errorPrefixColor != 16 ? errorPrefixColor : this.errorPrefixColor, focusedSuffixColor != 16 ? focusedSuffixColor : this.focusedSuffixColor, unfocusedSuffixColor != 16 ? unfocusedSuffixColor : this.unfocusedSuffixColor, disabledSuffixColor != 16 ? disabledSuffixColor : this.disabledSuffixColor, errorSuffixColor != 16 ? errorSuffixColor : this.errorSuffixColor, null);
    }

    /* JADX INFO: renamed from: cursorColor-vNxB06k$material3, reason: not valid java name */
    public final long m1405cursorColorvNxB06k$material3(boolean isError) {
        return isError ? this.errorCursorColor : this.cursorColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) other;
        return Color.m1978equalsimpl0(this.focusedTextColor, textFieldColors.focusedTextColor) && Color.m1978equalsimpl0(this.unfocusedTextColor, textFieldColors.unfocusedTextColor) && Color.m1978equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m1978equalsimpl0(this.errorTextColor, textFieldColors.errorTextColor) && Color.m1978equalsimpl0(this.focusedContainerColor, textFieldColors.focusedContainerColor) && Color.m1978equalsimpl0(this.unfocusedContainerColor, textFieldColors.unfocusedContainerColor) && Color.m1978equalsimpl0(this.disabledContainerColor, textFieldColors.disabledContainerColor) && Color.m1978equalsimpl0(this.errorContainerColor, textFieldColors.errorContainerColor) && Color.m1978equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m1978equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && Intrinsics.f(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m1978equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m1978equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m1978equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m1978equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m1978equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m1978equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m1978equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m1978equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m1978equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m1978equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m1978equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m1978equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m1978equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m1978equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m1978equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m1978equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m1978equalsimpl0(this.focusedPlaceholderColor, textFieldColors.focusedPlaceholderColor) && Color.m1978equalsimpl0(this.unfocusedPlaceholderColor, textFieldColors.unfocusedPlaceholderColor) && Color.m1978equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m1978equalsimpl0(this.errorPlaceholderColor, textFieldColors.errorPlaceholderColor) && Color.m1978equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m1978equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m1978equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m1978equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor) && Color.m1978equalsimpl0(this.focusedPrefixColor, textFieldColors.focusedPrefixColor) && Color.m1978equalsimpl0(this.unfocusedPrefixColor, textFieldColors.unfocusedPrefixColor) && Color.m1978equalsimpl0(this.disabledPrefixColor, textFieldColors.disabledPrefixColor) && Color.m1978equalsimpl0(this.errorPrefixColor, textFieldColors.errorPrefixColor) && Color.m1978equalsimpl0(this.focusedSuffixColor, textFieldColors.focusedSuffixColor) && Color.m1978equalsimpl0(this.unfocusedSuffixColor, textFieldColors.unfocusedSuffixColor) && Color.m1978equalsimpl0(this.disabledSuffixColor, textFieldColors.disabledSuffixColor) && Color.m1978equalsimpl0(this.errorSuffixColor, textFieldColors.errorSuffixColor);
    }

    @NotNull
    public final TextSelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    public int hashCode() {
        return Color.m1984hashCodeimpl(this.errorSuffixColor) + com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b((this.textSelectionColors.hashCode() + com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(Color.m1984hashCodeimpl(this.focusedTextColor) * 31, 31, this.unfocusedTextColor), 31, this.disabledTextColor), 31, this.errorTextColor), 31, this.focusedContainerColor), 31, this.unfocusedContainerColor), 31, this.disabledContainerColor), 31, this.errorContainerColor), 31, this.cursorColor), 31, this.errorCursorColor)) * 31, 31, this.focusedIndicatorColor), 31, this.unfocusedIndicatorColor), 31, this.disabledIndicatorColor), 31, this.errorIndicatorColor), 31, this.focusedLeadingIconColor), 31, this.unfocusedLeadingIconColor), 31, this.disabledLeadingIconColor), 31, this.errorLeadingIconColor), 31, this.focusedTrailingIconColor), 31, this.unfocusedTrailingIconColor), 31, this.disabledTrailingIconColor), 31, this.errorTrailingIconColor), 31, this.focusedLabelColor), 31, this.unfocusedLabelColor), 31, this.disabledLabelColor), 31, this.errorLabelColor), 31, this.focusedPlaceholderColor), 31, this.unfocusedPlaceholderColor), 31, this.disabledPlaceholderColor), 31, this.errorPlaceholderColor), 31, this.focusedSupportingTextColor), 31, this.unfocusedSupportingTextColor), 31, this.disabledSupportingTextColor), 31, this.errorSupportingTextColor), 31, this.focusedPrefixColor), 31, this.unfocusedPrefixColor), 31, this.disabledPrefixColor), 31, this.errorPrefixColor), 31, this.focusedSuffixColor), 31, this.unfocusedSuffixColor), 31, this.disabledSuffixColor);
    }

    /* JADX INFO: renamed from: indicatorColor-XeAY9LY$material3, reason: not valid java name */
    public final long m1406indicatorColorXeAY9LY$material3(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledIndicatorColor : isError ? this.errorIndicatorColor : focused ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
    }

    /* JADX INFO: renamed from: labelColor-XeAY9LY$material3, reason: not valid java name */
    public final long m1407labelColorXeAY9LY$material3(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledLabelColor : isError ? this.errorLabelColor : focused ? this.focusedLabelColor : this.unfocusedLabelColor;
    }

    /* JADX INFO: renamed from: leadingIconColor-XeAY9LY$material3, reason: not valid java name */
    public final long m1408leadingIconColorXeAY9LY$material3(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledLeadingIconColor : isError ? this.errorLeadingIconColor : focused ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor;
    }

    /* JADX INFO: renamed from: placeholderColor-XeAY9LY$material3, reason: not valid java name */
    public final long m1409placeholderColorXeAY9LY$material3(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledPlaceholderColor : isError ? this.errorPlaceholderColor : focused ? this.focusedPlaceholderColor : this.unfocusedPlaceholderColor;
    }

    /* JADX INFO: renamed from: prefixColor-XeAY9LY$material3, reason: not valid java name */
    public final long m1410prefixColorXeAY9LY$material3(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledPrefixColor : isError ? this.errorPrefixColor : focused ? this.focusedPrefixColor : this.unfocusedPrefixColor;
    }

    /* JADX INFO: renamed from: suffixColor-XeAY9LY$material3, reason: not valid java name */
    public final long m1411suffixColorXeAY9LY$material3(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledSuffixColor : isError ? this.errorSuffixColor : focused ? this.focusedSuffixColor : this.unfocusedSuffixColor;
    }

    /* JADX INFO: renamed from: supportingTextColor-XeAY9LY$material3, reason: not valid java name */
    public final long m1412supportingTextColorXeAY9LY$material3(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledSupportingTextColor : isError ? this.errorSupportingTextColor : focused ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor;
    }

    @NotNull
    public final TextSelectionColors takeOrElse$material3(TextSelectionColors textSelectionColors, @NotNull Function0<TextSelectionColors> function0) {
        return textSelectionColors == null ? (TextSelectionColors) function0.invoke() : textSelectionColors;
    }

    /* JADX INFO: renamed from: textColor-XeAY9LY$material3, reason: not valid java name */
    public final long m1413textColorXeAY9LY$material3(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledTextColor : isError ? this.errorTextColor : focused ? this.focusedTextColor : this.unfocusedTextColor;
    }

    /* JADX INFO: renamed from: trailingIconColor-XeAY9LY$material3, reason: not valid java name */
    public final long m1414trailingIconColorXeAY9LY$material3(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledTrailingIconColor : isError ? this.errorTrailingIconColor : focused ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor;
    }

    private TextFieldColors(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, TextSelectionColors textSelectionColors, long j65, long j69, long j76, long j85, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, long j122, long j123, long j124, long j125, long j126, long j127) {
        this.focusedTextColor = j2;
        this.unfocusedTextColor = j3;
        this.disabledTextColor = j5;
        this.errorTextColor = j16;
        this.focusedContainerColor = j22;
        this.unfocusedContainerColor = j42;
        this.disabledContainerColor = j46;
        this.errorContainerColor = j47;
        this.cursorColor = j57;
        this.errorCursorColor = j58;
        this.textSelectionColors = textSelectionColors;
        this.focusedIndicatorColor = j65;
        this.unfocusedIndicatorColor = j69;
        this.disabledIndicatorColor = j76;
        this.errorIndicatorColor = j85;
        this.focusedLeadingIconColor = j100;
        this.unfocusedLeadingIconColor = j101;
        this.disabledLeadingIconColor = j102;
        this.errorLeadingIconColor = j103;
        this.focusedTrailingIconColor = j104;
        this.unfocusedTrailingIconColor = j105;
        this.disabledTrailingIconColor = j106;
        this.errorTrailingIconColor = j107;
        this.focusedLabelColor = j108;
        this.unfocusedLabelColor = j109;
        this.disabledLabelColor = j110;
        this.errorLabelColor = j111;
        this.focusedPlaceholderColor = j112;
        this.unfocusedPlaceholderColor = j113;
        this.disabledPlaceholderColor = j114;
        this.errorPlaceholderColor = j115;
        this.focusedSupportingTextColor = j116;
        this.unfocusedSupportingTextColor = j117;
        this.disabledSupportingTextColor = j118;
        this.errorSupportingTextColor = j119;
        this.focusedPrefixColor = j120;
        this.unfocusedPrefixColor = j121;
        this.disabledPrefixColor = j122;
        this.errorPrefixColor = j123;
        this.focusedSuffixColor = j124;
        this.unfocusedSuffixColor = j125;
        this.disabledSuffixColor = j126;
        this.errorSuffixColor = j127;
    }
}
