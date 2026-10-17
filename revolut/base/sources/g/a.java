package g;

import androidx.compose.runtime.Composer;
import androidx.content.compose.internal.NavComposeUtils_androidKt;
import androidx.view.compose.BackHandlerKt;
import androidx.view.compose.PredictiveBackHandlerKt;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f139242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f139243c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ a(boolean z, Function function, int i, int i2, int i3) {
        this.f139241a = i3;
        this.f139242b = z;
        this.f139243c = function;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f139241a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$7(this.f139242b, (Function2) this.f139243c, this.d, this.e, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return NavComposeUtils_androidKt.PredictiveBackHandler$lambda$0(this.f139242b, (Function2) this.f139243c, this.d, this.e, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return BackHandlerKt.BackHandler$lambda$7(this.f139242b, (Function0) this.f139243c, this.d, this.e, (Composer) obj2, iIntValue3);
        }
    }
}
