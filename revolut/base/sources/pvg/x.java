package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240244c;
    public final iwg.c d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f240245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f240246h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Float f240247j;
    public final jo3.b k;

    public x(iwg.a analyticsProductType, eel.c timeSpan, String currency, iwg.c method, String benchmarkRef, String portfolioId, DateTime timestamp, float f, float f4, Float f5, jo3.b pnl2) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(benchmarkRef, "benchmarkRef");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f240242a = analyticsProductType;
        this.f240243b = timeSpan;
        this.f240244c = currency;
        this.d = method;
        this.e = benchmarkRef;
        this.f = portfolioId;
        this.f240245g = timestamp;
        this.f240246h = f;
        this.i = f4;
        this.f240247j = f5;
        this.k = pnl2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f240242a == xVar.f240242a && this.f240243b == xVar.f240243b && Intrinsics.f(this.f240244c, xVar.f240244c) && this.d == xVar.d && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f240245g, xVar.f240245g) && Float.compare(this.f240246h, xVar.f240246h) == 0 && Float.compare(this.i, xVar.i) == 0 && Intrinsics.f(this.f240247j, xVar.f240247j) && Intrinsics.f(this.k, xVar.k);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.i, m72.b.b(this.f240246h, m72.b.f(this.f240245g, p.a.c(p.a.c(prk.o.d(this.d, p.a.c(prk.o.c(this.f240243b, this.f240242a.hashCode() * 31, 31), 31, this.f240244c), 31), 31, this.e), 31, this.f), 31), 31), 31);
        Float f = this.f240247j;
        return this.k.hashCode() + ((iB + (f == null ? 0 : f.hashCode())) * 31);
    }
}
