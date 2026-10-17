package v1;

import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f284939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f284940c;
    public final /* synthetic */ int d;

    public /* synthetic */ b0(Function2 function2, Function2 function22, int i, int i2) {
        this.f284938a = i2;
        this.f284939b = function2;
        this.f284940c = function22;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f284938a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return SnackbarKt.OneRowSnackbar$lambda$2(this.f284939b, this.f284940c, this.d, composer, iIntValue);
            default:
                return SnackbarKt.NewLineButtonSnackbar$lambda$1(this.f284939b, this.f284940c, this.d, composer, iIntValue);
        }
    }
}
