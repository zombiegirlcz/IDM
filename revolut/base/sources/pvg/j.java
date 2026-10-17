package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eel.c f240167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f240168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f240169c;
    public final DateTime d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final iwg.c f240170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f240171h;

    public j(eel.c timeSpan, DateTime start, DateTime end2, DateTime lastModified, String assetTypesId, String currency, iwg.c method, String benchmark) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        Intrinsics.checkNotNullParameter(assetTypesId, "assetTypesId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(benchmark, "benchmark");
        this.f240167a = timeSpan;
        this.f240168b = start;
        this.f240169c = end2;
        this.d = lastModified;
        this.e = assetTypesId;
        this.f = currency;
        this.f240170g = method;
        this.f240171h = benchmark;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f240167a == jVar.f240167a && Intrinsics.f(this.f240168b, jVar.f240168b) && Intrinsics.f(this.f240169c, jVar.f240169c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && this.f240170g == jVar.f240170g && Intrinsics.f(this.f240171h, jVar.f240171h);
    }

    public final int hashCode() {
        return this.f240171h.hashCode() + prk.o.d(this.f240170g, p.a.c(p.a.c(m72.b.f(this.d, m72.b.f(this.f240169c, m72.b.f(this.f240168b, this.f240167a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31);
    }
}
