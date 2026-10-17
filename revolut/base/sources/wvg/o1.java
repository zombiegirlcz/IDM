package wvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.a f300437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300438c;
    public final eel.c d;
    public final xi0.b e;
    public final iwg.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f300439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f300440h;

    public o1(String userId, iwg.a analyticsProductType, String str, eel.c chartPeriod, xi0.b currency, iwg.c method, String str2) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        this.f300436a = userId;
        this.f300437b = analyticsProductType;
        this.f300438c = str;
        this.d = chartPeriod;
        this.e = currency;
        this.f = method;
        this.f300439g = str2;
        StringBuilder sb6 = new StringBuilder("realtime_performance_");
        sb6.append(kotlin.jvm.internal.s.Q(analyticsProductType));
        String strT = nz8.d.t(chartPeriod, null);
        String str3 = currency.f306286a;
        String strR = kotlin.jvm.internal.s.R(method);
        StringBuilder sbM = v0.a.m("_", strT, "_", str3, "_");
        sbM.append(strR);
        sb6.append(sbM.toString());
        sb6.append("_" + (str2 == null ? "" : str2) + "_" + (str == null ? "LOCAL_PORTFOLIO_ID" : str));
        this.f300440h = sb6.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.f300436a, o1Var.f300436a) && this.f300437b == o1Var.f300437b && Intrinsics.f(this.f300438c, o1Var.f300438c) && this.d == o1Var.d && Intrinsics.f(this.e, o1Var.e) && this.f == o1Var.f && Intrinsics.f(this.f300439g, o1Var.f300439g);
    }

    @Override // wvg.a1
    public final String getKey() {
        return this.f300440h;
    }

    public final int hashCode() {
        int iHashCode = (this.f300437b.hashCode() + (this.f300436a.hashCode() * 31)) * 31;
        String str = this.f300438c;
        int iD = prk.o.d(this.f, h30.l.j(this.e, prk.o.c(this.d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        String str2 = this.f300439g;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
