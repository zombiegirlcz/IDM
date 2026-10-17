package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240230c;
    public final iwg.c d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f240231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f240232h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DateTime f240233j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f240234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Float f240235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jo3.b f240236n;

    public v(iwg.a analyticsProductType, eel.c timeSpan, String currency, iwg.c method, String benchmarkRef, String portfolioId, DateTime start, DateTime end2, DateTime lastModified, DateTime timestamp, float f, float f4, Float f5, jo3.b pnl2) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(benchmarkRef, "benchmarkRef");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f240228a = analyticsProductType;
        this.f240229b = timeSpan;
        this.f240230c = currency;
        this.d = method;
        this.e = benchmarkRef;
        this.f = portfolioId;
        this.f240231g = start;
        this.f240232h = end2;
        this.i = lastModified;
        this.f240233j = timestamp;
        this.k = f;
        this.f240234l = f4;
        this.f240235m = f5;
        this.f240236n = pnl2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f240228a == vVar.f240228a && this.f240229b == vVar.f240229b && Intrinsics.f(this.f240230c, vVar.f240230c) && this.d == vVar.d && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f240231g, vVar.f240231g) && Intrinsics.f(this.f240232h, vVar.f240232h) && Intrinsics.f(this.i, vVar.i) && Intrinsics.f(this.f240233j, vVar.f240233j) && Float.compare(this.k, vVar.k) == 0 && Float.compare(this.f240234l, vVar.f240234l) == 0 && Intrinsics.f(this.f240235m, vVar.f240235m) && Intrinsics.f(this.f240236n, vVar.f240236n);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f240234l, m72.b.b(this.k, m72.b.f(this.f240233j, m72.b.f(this.i, m72.b.f(this.f240232h, m72.b.f(this.f240231g, p.a.c(p.a.c(prk.o.d(this.d, p.a.c(prk.o.c(this.f240229b, this.f240228a.hashCode() * 31, 31), 31, this.f240230c), 31), 31, this.e), 31, this.f), 31), 31), 31), 31), 31), 31);
        Float f = this.f240235m;
        return this.f240236n.hashCode() + ((iB + (f == null ? 0 : f.hashCode())) * 31);
    }
}
