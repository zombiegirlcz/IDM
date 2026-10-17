package n1;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f211144b;

    public /* synthetic */ p(TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.f211143a = i;
        this.f211144b = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f211143a) {
            case 0:
                return CoreTextFieldKt.CoreTextField$lambda$21$0(this.f211144b, (DisposableEffectScope) obj2);
            default:
                return TextFieldSelectionManager._get_contextMenuAreaModifier_$lambda$0(this.f211144b, (LayoutCoordinates) obj2);
        }
    }
}
