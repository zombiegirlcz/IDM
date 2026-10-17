package wvg;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f300394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f300395c;
    public final xi0.b d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f300396g;

    public i1(String userId, List analyticsProductTypes, eel.c chartPeriod, xi0.b currency, String chartDetailsType) throws IOException {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(chartDetailsType, "chartDetailsType");
        this.f300393a = userId;
        this.f300394b = analyticsProductTypes;
        this.f300395c = chartPeriod;
        this.d = currency;
        this.e = chartDetailsType;
        StringBuilder sb6 = new StringBuilder("realtime_total_value_combined");
        StringBuilder sbM = v0.a.m("_", nz8.d.t(chartPeriod, null), "_", currency.f306286a, "_");
        sbM.append(chartDetailsType);
        sb6.append(sbM.toString());
        List list = analyticsProductTypes;
        sb6.append("_" + zhm.d0.k0(list, "_", null, null, 0, null, 62));
        this.f = sb6.toString();
        StringBuilder sb9 = new StringBuilder("realtime_total_value_combined_live_point");
        sb9.append("_" + currency.f306286a + "_" + chartDetailsType);
        String strK0 = zhm.d0.k0(list, "_", null, null, 0, null, 62);
        StringBuilder sb10 = new StringBuilder("_");
        sb10.append(strK0);
        sb9.append(sb10.toString());
        this.f300396g = sb9.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.f300393a, i1Var.f300393a) && Intrinsics.f(this.f300394b, i1Var.f300394b) && this.f300395c == i1Var.f300395c && Intrinsics.f(this.d, i1Var.d) && Intrinsics.f(this.e, i1Var.e);
    }

    @Override // wvg.a1
    public final String getKey() {
        return this.f;
    }

    public final int hashCode() {
        return this.e.hashCode() + h30.l.j(this.d, prk.o.c(this.f300395c, p.a.d(this.f300393a.hashCode() * 31, 31, this.f300394b), 31), 31);
    }
}
