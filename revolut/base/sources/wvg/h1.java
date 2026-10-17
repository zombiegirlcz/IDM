package wvg;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f300386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f300387c;
    public final xi0.b d;
    public final iwg.c e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f300388g;

    public h1(eel.c chartPeriod, iwg.c method, String userId, String str, List analyticsProductTypes, xi0.b currency) throws IOException {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        this.f300385a = userId;
        this.f300386b = analyticsProductTypes;
        this.f300387c = chartPeriod;
        this.d = currency;
        this.e = method;
        this.f = str;
        StringBuilder sb6 = new StringBuilder("realtime_performance_combined");
        String strT = nz8.d.t(chartPeriod, null);
        String str2 = currency.f306286a;
        String strR = kotlin.jvm.internal.s.R(method);
        StringBuilder sbM = v0.a.m("_", strT, "_", str2, "_");
        sbM.append(strR);
        sb6.append(sbM.toString());
        str = str == null ? "" : str;
        sb6.append("_" + str + "_" + zhm.d0.k0(analyticsProductTypes, "_", null, null, 0, null, 62));
        this.f300388g = sb6.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f300385a, h1Var.f300385a) && Intrinsics.f(this.f300386b, h1Var.f300386b) && this.f300387c == h1Var.f300387c && Intrinsics.f(this.d, h1Var.d) && this.e == h1Var.e && Intrinsics.f(this.f, h1Var.f);
    }

    @Override // wvg.a1
    public final String getKey() {
        return this.f300388g;
    }

    public final int hashCode() {
        int iD = prk.o.d(this.e, h30.l.j(this.d, prk.o.c(this.f300387c, p.a.d(this.f300385a.hashCode() * 31, 31, this.f300386b), 31), 31), 31);
        String str = this.f;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
