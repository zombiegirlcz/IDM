package m01;

import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f201038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f201039c;

    public /* synthetic */ a(Function2 function2, int i, int i2) {
        this.f201037a = i2;
        this.f201038b = function2;
        this.f201039c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        Integer num = (Integer) obj3;
        switch (this.f201037a) {
            case 0:
                num.intValue();
                b.a(this.f201038b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f201039c | 1));
                return Unit.f186387a;
            default:
                return SnackbarKt.TextOnlySnackbar$lambda$2(this.f201038b, this.f201039c, composer, num.intValue());
        }
    }
}
