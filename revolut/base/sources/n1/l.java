package n1;

import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f211122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f211123c;
    public final /* synthetic */ int d;

    public /* synthetic */ l(TextFieldSelectionManager textFieldSelectionManager, Function2 function2, int i, int i2) {
        this.f211121a = i2;
        this.f211122b = textFieldSelectionManager;
        this.f211123c = function2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f211121a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$4(this.f211122b, this.f211123c, this.d, composer, iIntValue);
            default:
                return ContextMenu_androidKt.ContextMenuArea$lambda$0(this.f211122b, this.f211123c, this.d, composer, iIntValue);
        }
    }
}
