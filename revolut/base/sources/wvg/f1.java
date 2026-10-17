package wvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.Duration;

/* JADX INFO: loaded from: classes9.dex */
public final class f1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iwg.a f300370c;
    public final eel.c d;
    public final DateTime e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Duration f300371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f300372h;

    public f1(String userId, String str, iwg.a analyticsProductType, eel.c timeSpan, DateTime to6, xi0.b currency, Duration interval) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f300368a = userId;
        this.f300369b = str;
        this.f300370c = analyticsProductType;
        this.d = timeSpan;
        this.e = to6;
        this.f = currency;
        this.f300371g = interval;
        String strQ = kotlin.jvm.internal.s.Q(analyticsProductType);
        String strT = nz8.d.t(timeSpan, null);
        this.f300372h = a0.d.u(v0.a.m("complex_analytics_pnl_chart_", strQ, "_", strT, "_"), currency.f306286a, "_", str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.f300368a, f1Var.f300368a) && Intrinsics.f(this.f300369b, f1Var.f300369b) && this.f300370c == f1Var.f300370c && this.d == f1Var.d && Intrinsics.f(this.e, f1Var.e) && Intrinsics.f(this.f, f1Var.f) && Intrinsics.f(this.f300371g, f1Var.f300371g);
    }

    @Override // wvg.a1
    public final String getKey() {
        return this.f300372h;
    }

    public final int hashCode() {
        int iHashCode = this.f300368a.hashCode() * 31;
        String str = this.f300369b;
        return this.f300371g.hashCode() + h30.l.j(this.f, m72.b.f(this.e, prk.o.c(this.d, (this.f300370c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31), 31);
    }
}
