package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240136c;
    public final String d;
    public final DateTime e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f240138h;

    public g0(iwg.a analyticsProductType, eel.c timeSpan, String currency, String portfolioId, DateTime timestamp, jo3.b amount, jo3.b bVar, String chartDetailsType) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(chartDetailsType, "chartDetailsType");
        this.f240134a = analyticsProductType;
        this.f240135b = timeSpan;
        this.f240136c = currency;
        this.d = portfolioId;
        this.e = timestamp;
        this.f = amount;
        this.f240137g = bVar;
        this.f240138h = chartDetailsType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f240134a == g0Var.f240134a && this.f240135b == g0Var.f240135b && Intrinsics.f(this.f240136c, g0Var.f240136c) && Intrinsics.f(this.d, g0Var.d) && Intrinsics.f(this.e, g0Var.e) && Intrinsics.f(this.f, g0Var.f) && Intrinsics.f(this.f240137g, g0Var.f240137g) && Intrinsics.f(this.f240138h, g0Var.f240138h);
    }

    public final int hashCode() {
        int iE = wp5.y.e(this.f, m72.b.f(this.e, p.a.c(p.a.c(prk.o.c(this.f240135b, this.f240134a.hashCode() * 31, 31), 31, this.f240136c), 31, this.d), 31), 31);
        jo3.b bVar = this.f240137g;
        return this.f240138h.hashCode() + ((iE + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
