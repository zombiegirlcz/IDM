package androidx.compose.ui.window;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1 extends u implements Function1<SemanticsPropertyReceiver, Unit> {
    public static final AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1 INSTANCE = new AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1();

    public AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((SemanticsPropertyReceiver) obj2);
        return Unit.f186387a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
    }
}
