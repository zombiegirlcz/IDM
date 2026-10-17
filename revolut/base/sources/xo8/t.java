package xo8;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_settings.api.JuniorSettingsApi$Toggles$YouthAccountDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xo8.h;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f307729b;

    public /* synthetic */ t(h0 h0Var, int i) {
        this.f307728a = i;
        this.f307729b = h0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f307728a) {
            case 0:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j.a(update, null, null, false, null, null, null, null, false, false, false, ((jte.d) this.f307729b.f307704x).c(JuniorSettingsApi$Toggles$YouthAccountDetails.f77253c), null, null, null, 15359);
            case 1:
                Boolean featureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(featureEnabled, "featureEnabled");
                if (!featureEnabled.booleanValue()) {
                    return efm.r.just(h.a.f307697a);
                }
                h0 h0Var = this.f307729b;
                return h0Var.u.m(h0Var.o.f77340a, false).map(new xg6.k(new xlj.h(29), 29));
            default:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b.Companion.getClass();
                return te0.w.S(user, wi0.b.f297770q3) ? rd0.e.n(nim.a.v(rd0.e.b(this.f307729b.f307703w.H()), new xlj.h(28)), zhm.h0.f322473a) : new go.g(new Data(null, null, false, 7, null), 2);
        }
    }
}
