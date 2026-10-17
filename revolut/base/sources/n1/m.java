package n1;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f211125b;

    public /* synthetic */ m(LegacyTextFieldState legacyTextFieldState, int i) {
        this.f211124a = i;
        this.f211125b = legacyTextFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f211124a) {
            case 0:
                return CoreTextFieldKt.CoreTextField$lambda$16$0(this.f211125b, ((Boolean) obj2).booleanValue());
            case 1:
                return CoreTextFieldKt.CoreTextField$lambda$25(this.f211125b, (LayoutCoordinates) obj2);
            case 2:
                return LegacyTextFieldState.onValueChange$lambda$0(this.f211125b, (TextFieldValue) obj2);
            case 3:
                return LegacyTextFieldState.onImeActionPerformed$lambda$0(this.f211125b, (ImeAction) obj2);
            default:
                return Boolean.valueOf(LegacyTextFieldState.onImeActionPerformedWithResult$lambda$0(this.f211125b, (ImeAction) obj2));
        }
    }
}
