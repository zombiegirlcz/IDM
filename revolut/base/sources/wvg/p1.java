package wvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.a f300447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300448c;
    public final eel.c d;
    public final xi0.b e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f300449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f300450h;

    public p1(String userId, iwg.a analyticsProductType, String str, eel.c chartPeriod, xi0.b currency, String chartDetailsType) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(chartDetailsType, "chartDetailsType");
        this.f300446a = userId;
        this.f300447b = analyticsProductType;
        this.f300448c = str;
        this.d = chartPeriod;
        this.e = currency;
        this.f = chartDetailsType;
        StringBuilder sb6 = new StringBuilder("realtime_total_value_");
        sb6.append(kotlin.jvm.internal.s.Q(analyticsProductType));
        StringBuilder sbM = v0.a.m("_", nz8.d.t(chartPeriod, null), "_", currency.f306286a, "_");
        sbM.append(chartDetailsType);
        sb6.append(sbM.toString());
        sb6.append("_".concat(str == null ? "LOCAL_PORTFOLIO_ID" : str));
        this.f300449g = sb6.toString();
        StringBuilder sb9 = new StringBuilder("realtime_total_value_live_point_");
        sb9.append(kotlin.jvm.internal.s.Q(analyticsProductType));
        sb9.append("_" + currency.f306286a + "_" + chartDetailsType);
        sb9.append("_".concat(str == null ? "LOCAL_PORTFOLIO_ID" : str));
        this.f300450h = sb9.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f300446a, p1Var.f300446a) && this.f300447b == p1Var.f300447b && Intrinsics.f(this.f300448c, p1Var.f300448c) && this.d == p1Var.d && Intrinsics.f(this.e, p1Var.e) && Intrinsics.f(this.f, p1Var.f);
    }

    @Override // wvg.a1
    public final String getKey() {
        return this.f300449g;
    }

    public final int hashCode() {
        int iHashCode = (this.f300447b.hashCode() + (this.f300446a.hashCode() * 31)) * 31;
        String str = this.f300448c;
        return this.f.hashCode() + h30.l.j(this.e, prk.o.c(this.d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }
}
