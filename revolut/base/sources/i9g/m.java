package i9g;

import com.revolut.feature_travel_hotels_models.booking.details.HotelsPropertyBookingDetailsParams;
import fag.t0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f159818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f159819c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ m(n nVar, String str, boolean z, int i) {
        this.f159817a = i;
        this.f159818b = nVar;
        this.f159819c = str;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b baseCurrency = (xi0.b) obj2;
        switch (this.f159817a) {
            case 0:
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                t0 t0Var = this.f159818b.f159820a;
                HotelsPropertyBookingDetailsParams hotelsPropertyBookingDetailsParams = new HotelsPropertyBookingDetailsParams(this.f159819c, baseCurrency);
                t0Var.getClass();
                Intrinsics.checkNotNullParameter(hotelsPropertyBookingDetailsParams, "hotelsPropertyBookingDetailsParams");
                return t0Var.L.f(hotelsPropertyBookingDetailsParams, this.d);
            default:
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                t0 t0Var2 = this.f159818b.f159820a;
                String str = this.f159819c;
                HotelsPropertyBookingDetailsParams params = new HotelsPropertyBookingDetailsParams(str, baseCurrency);
                t0Var2.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                return t0Var2.L.g(new HotelsPropertyBookingDetailsParams(str, baseCurrency), this.d);
        }
    }
}
