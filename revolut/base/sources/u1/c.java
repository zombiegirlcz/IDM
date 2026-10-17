package u1;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276217a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f276218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f276219c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Modifier modifier, Function0 function0, boolean z, int i) {
        this.d = modifier;
        this.e = function0;
        this.f276218b = z;
        this.f276219c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f276217a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AndroidSelectionHandles_androidKt.SelectionHandleIcon$lambda$0((Modifier) this.d, (Function0) this.e, this.f276218b, this.f276219c, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return TextFieldSelectionManagerKt.TextFieldSelectionHandle$lambda$3(this.f276218b, (ResolvedTextDirection) this.d, (TextFieldSelectionManager) this.e, this.f276219c, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ c(boolean z, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.f276218b = z;
        this.d = resolvedTextDirection;
        this.e = textFieldSelectionManager;
        this.f276219c = i;
    }
}
