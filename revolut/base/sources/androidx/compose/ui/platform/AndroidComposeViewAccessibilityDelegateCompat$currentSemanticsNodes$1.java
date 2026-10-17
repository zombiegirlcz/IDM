package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNode_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/semantics/SemanticsNode;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1 extends u implements Function1<SemanticsNode, Boolean> {
    public static final AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1 INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1();

    public AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(SemanticsNode semanticsNode) {
        return Boolean.valueOf(SemanticsNode_androidKt.isAccessibilityIgnoredLink(semanticsNode));
    }
}
