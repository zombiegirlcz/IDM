package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240239c;
    public final iwg.c d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f240240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f240241h;
    public final DateTime i;

    public w(iwg.a analyticsProductType, eel.c timeSpan, String currency, iwg.c method, String benchmark, String portfolioId, DateTime start, DateTime end2, DateTime lastModified) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(benchmark, "benchmark");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        this.f240237a = analyticsProductType;
        this.f240238b = timeSpan;
        this.f240239c = currency;
        this.d = method;
        this.e = benchmark;
        this.f = portfolioId;
        this.f240240g = start;
        this.f240241h = end2;
        this.i = lastModified;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f240237a == wVar.f240237a && this.f240238b == wVar.f240238b && Intrinsics.f(this.f240239c, wVar.f240239c) && this.d == wVar.d && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f) && Intrinsics.f(this.f240240g, wVar.f240240g) && Intrinsics.f(this.f240241h, wVar.f240241h) && Intrinsics.f(this.i, wVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + m72.b.f(this.f240241h, m72.b.f(this.f240240g, p.a.c(p.a.c(prk.o.d(this.d, p.a.c(prk.o.c(this.f240238b, this.f240237a.hashCode() * 31, 31), 31, this.f240239c), 31), 31, this.e), 31, this.f), 31), 31);
    }
}
