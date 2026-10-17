package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240150c;
    public final String d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f240152h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jo3.b f240153j;
    public final jo3.b k;

    public h0(iwg.a analyticsProductType, eel.c timeSpan, String currency, String portfolioId, DateTime start, DateTime end2, jo3.b bVar, jo3.b bVar2, DateTime timestamp, jo3.b amount, jo3.b bVar3) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f240148a = analyticsProductType;
        this.f240149b = timeSpan;
        this.f240150c = currency;
        this.d = portfolioId;
        this.e = start;
        this.f = end2;
        this.f240151g = bVar;
        this.f240152h = bVar2;
        this.i = timestamp;
        this.f240153j = amount;
        this.k = bVar3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return this.f240148a == h0Var.f240148a && this.f240149b == h0Var.f240149b && Intrinsics.f(this.f240150c, h0Var.f240150c) && Intrinsics.f(this.d, h0Var.d) && Intrinsics.f(this.e, h0Var.e) && Intrinsics.f(this.f, h0Var.f) && Intrinsics.f(this.f240151g, h0Var.f240151g) && Intrinsics.f(this.f240152h, h0Var.f240152h) && Intrinsics.f(this.i, h0Var.i) && Intrinsics.f(this.f240153j, h0Var.f240153j) && Intrinsics.f(this.k, h0Var.k);
    }

    public final int hashCode() {
        int iF = m72.b.f(this.f, m72.b.f(this.e, p.a.c(p.a.c(prk.o.c(this.f240149b, this.f240148a.hashCode() * 31, 31), 31, this.f240150c), 31, this.d), 31), 31);
        jo3.b bVar = this.f240151g;
        int iHashCode = (iF + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.f240152h;
        int iE = wp5.y.e(this.f240153j, m72.b.f(this.i, (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31), 31);
        jo3.b bVar3 = this.k;
        return iE + (bVar3 != null ? bVar3.hashCode() : 0);
    }
}
