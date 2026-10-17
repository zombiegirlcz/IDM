package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.Duration;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240073c;
    public final String d;
    public final Duration e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f240074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f240075h;
    public final jo3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jo3.b f240076j;

    public a0(iwg.a analyticsProductType, eel.c timeSpan, String currency, String portfolioId, Duration interval, DateTime pointStart, DateTime pointEnd, jo3.b netSell, jo3.b bVar, jo3.b cumulative) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(pointStart, "pointStart");
        Intrinsics.checkNotNullParameter(pointEnd, "pointEnd");
        Intrinsics.checkNotNullParameter(netSell, "netSell");
        Intrinsics.checkNotNullParameter(cumulative, "cumulative");
        this.f240071a = analyticsProductType;
        this.f240072b = timeSpan;
        this.f240073c = currency;
        this.d = portfolioId;
        this.e = interval;
        this.f = pointStart;
        this.f240074g = pointEnd;
        this.f240075h = netSell;
        this.i = bVar;
        this.f240076j = cumulative;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f240071a == a0Var.f240071a && this.f240072b == a0Var.f240072b && Intrinsics.f(this.f240073c, a0Var.f240073c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f) && Intrinsics.f(this.f240074g, a0Var.f240074g) && Intrinsics.f(this.f240075h, a0Var.f240075h) && Intrinsics.f(this.i, a0Var.i) && Intrinsics.f(this.f240076j, a0Var.f240076j);
    }

    public final int hashCode() {
        int iE = wp5.y.e(this.f240075h, m72.b.f(this.f240074g, m72.b.f(this.f, (this.e.hashCode() + p.a.c(p.a.c(prk.o.c(this.f240072b, this.f240071a.hashCode() * 31, 31), 31, this.f240073c), 31, this.d)) * 31, 31), 31), 31);
        jo3.b bVar = this.i;
        return this.f240076j.hashCode() + ((iE + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
