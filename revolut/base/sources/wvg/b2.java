package wvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class b2 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.a f300333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f300334c;
    public final DateTime d;
    public final xi0.b e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f300335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f300336h;

    public b2(String userId, iwg.a analyticsProductType, eel.c timeSpan, DateTime to6, xi0.b currency, String str, String chartDetailsType) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(chartDetailsType, "chartDetailsType");
        this.f300332a = userId;
        this.f300333b = analyticsProductType;
        this.f300334c = timeSpan;
        this.d = to6;
        this.e = currency;
        this.f = str;
        this.f300335g = chartDetailsType;
        String strQ = kotlin.jvm.internal.s.Q(analyticsProductType);
        String strT = nz8.d.t(timeSpan, null);
        String str2 = currency.f306286a;
        StringBuilder sbM = v0.a.m("complex_analytics_value_chart_", strQ, "_", strT, "_");
        j6.a.D(sbM, str2, "_", str, "_");
        sbM.append(chartDetailsType);
        this.f300336h = sbM.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.f300332a, b2Var.f300332a) && this.f300333b == b2Var.f300333b && this.f300334c == b2Var.f300334c && Intrinsics.f(this.d, b2Var.d) && Intrinsics.f(this.e, b2Var.e) && Intrinsics.f(this.f, b2Var.f) && Intrinsics.f(this.f300335g, b2Var.f300335g);
    }

    @Override // wvg.a1
    public final String getKey() {
        return this.f300336h;
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.e, m72.b.f(this.d, prk.o.c(this.f300334c, (this.f300333b.hashCode() + (this.f300332a.hashCode() * 31)) * 31, 31), 31), 31);
        String str = this.f;
        return this.f300335g.hashCode() + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
    }
}
