package v1;

import androidx.compose.material.DrawerKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function3 f285033b;

    public /* synthetic */ l(Function3 function3, int i) {
        this.f285032a = i;
        this.f285033b = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f285032a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$1$6(this.f285033b, composer, iIntValue);
            case 1:
                return ScaffoldKt.Scaffold_u4IkXBM$lambda$2(this.f285033b, composer, iIntValue);
            default:
                return SnackbarHostKt.FadeInFadeOutWithScale$lambda$3$0$0(this.f285033b, null, composer, iIntValue);
        }
    }
}
