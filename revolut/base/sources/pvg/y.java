package pvg;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.Duration;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240250c;
    public final String d;
    public final Duration e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f240251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ZonedDateTime f240252h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DateTime f240253j;
    public final jo3.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jo3.b f240254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jo3.b f240255m;

    public y(iwg.a analyticsProductType, eel.c timeSpan, String currency, String portfolioId, Duration interval, DateTime start, DateTime end2, ZonedDateTime zonedDateTime, DateTime pointStart, DateTime pointEnd, jo3.b netSell, jo3.b bVar, jo3.b cumulative) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(pointStart, "pointStart");
        Intrinsics.checkNotNullParameter(pointEnd, "pointEnd");
        Intrinsics.checkNotNullParameter(netSell, "netSell");
        Intrinsics.checkNotNullParameter(cumulative, "cumulative");
        this.f240248a = analyticsProductType;
        this.f240249b = timeSpan;
        this.f240250c = currency;
        this.d = portfolioId;
        this.e = interval;
        this.f = start;
        this.f240251g = end2;
        this.f240252h = zonedDateTime;
        this.i = pointStart;
        this.f240253j = pointEnd;
        this.k = netSell;
        this.f240254l = bVar;
        this.f240255m = cumulative;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f240248a == yVar.f240248a && this.f240249b == yVar.f240249b && Intrinsics.f(this.f240250c, yVar.f240250c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f240251g, yVar.f240251g) && Intrinsics.f(this.f240252h, yVar.f240252h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f240253j, yVar.f240253j) && Intrinsics.f(this.k, yVar.k) && Intrinsics.f(this.f240254l, yVar.f240254l) && Intrinsics.f(this.f240255m, yVar.f240255m);
    }

    public final int hashCode() {
        int iF = m72.b.f(this.f240251g, m72.b.f(this.f, (this.e.hashCode() + p.a.c(p.a.c(prk.o.c(this.f240249b, this.f240248a.hashCode() * 31, 31), 31, this.f240250c), 31, this.d)) * 31, 31), 31);
        ZonedDateTime zonedDateTime = this.f240252h;
        int iE = wp5.y.e(this.k, m72.b.f(this.f240253j, m72.b.f(this.i, (iF + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31), 31), 31);
        jo3.b bVar = this.f240254l;
        return this.f240255m.hashCode() + ((iE + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }
}
