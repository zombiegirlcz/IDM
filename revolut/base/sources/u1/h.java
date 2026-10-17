package u1;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Density f276232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableState f276233c;

    public /* synthetic */ h(Density density, MutableState mutableState, int i) {
        this.f276231a = i;
        this.f276232b = density;
        this.f276233c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f276231a) {
            case 0:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0(this.f276232b, this.f276233c, (Function0) obj2);
            default:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0$1(this.f276232b, this.f276233c, (DpSize) obj2);
        }
    }
}
