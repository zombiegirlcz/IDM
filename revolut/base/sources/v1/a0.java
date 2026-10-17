package v1;

import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f284933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f284934c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ a0(Function2 function2, Function2 function22, boolean z, int i) {
        this.f284932a = i;
        this.f284933b = function2;
        this.f284934c = function22;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f284932a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return SnackbarKt.Snackbar_7zSek6w$lambda$0$0(this.f284933b, this.f284934c, this.d, composer, iIntValue);
            case 1:
                return SnackbarKt.Snackbar_7zSek6w$lambda$0$0$0(this.f284933b, this.f284934c, this.d, composer, iIntValue);
            default:
                return SnackbarKt.Snackbar_7zSek6w$lambda$0(this.f284933b, this.f284934c, this.d, composer, iIntValue);
        }
    }
}
