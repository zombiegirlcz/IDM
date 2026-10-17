package wvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class d1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.a f300354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f300355c;
    public final DateTime d;
    public final xi0.b e;
    public final iwg.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f300356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f300357h;
    public final String i;

    public d1(String userId, iwg.a analyticsProductType, eel.c timeSpan, DateTime to6, xi0.b currency, iwg.c method, String str, String str2) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        this.f300353a = userId;
        this.f300354b = analyticsProductType;
        this.f300355c = timeSpan;
        this.d = to6;
        this.e = currency;
        this.f = method;
        this.f300356g = str;
        this.f300357h = str2;
        String strQ = kotlin.jvm.internal.s.Q(analyticsProductType);
        String strT = nz8.d.t(timeSpan, null);
        String str3 = currency.f306286a;
        String strR = kotlin.jvm.internal.s.R(method);
        StringBuilder sbM = v0.a.m("complex_analytics_performance_", strQ, "_", strT, "_");
        j6.a.D(sbM, str3, "_", strR, "_");
        this.i = a0.d.u(sbM, str, "_", str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f300353a, d1Var.f300353a) && this.f300354b == d1Var.f300354b && this.f300355c == d1Var.f300355c && Intrinsics.f(this.d, d1Var.d) && Intrinsics.f(this.e, d1Var.e) && this.f == d1Var.f && Intrinsics.f(this.f300356g, d1Var.f300356g) && Intrinsics.f(this.f300357h, d1Var.f300357h);
    }

    @Override // wvg.a1
    public final String getKey() {
        return this.i;
    }

    public final int hashCode() {
        int iD = prk.o.d(this.f, h30.l.j(this.e, m72.b.f(this.d, prk.o.c(this.f300355c, (this.f300354b.hashCode() + (this.f300353a.hashCode() * 31)) * 31, 31), 31), 31), 31);
        String str = this.f300356g;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f300357h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
