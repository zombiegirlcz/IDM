package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eel.c f240154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f240155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f240156c;
    public final DateTime d;
    public final DateTime e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f240157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Float f240158h;
    public final jo3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f240159j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final iwg.c f240160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f240161m;

    public i(eel.c timeSpan, DateTime start, DateTime end2, DateTime lastModified, DateTime timestamp, float f, float f4, Float f5, jo3.b pnl2, String assetTypesId, String currency, iwg.c method, String benchmarkRef) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        Intrinsics.checkNotNullParameter(assetTypesId, "assetTypesId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(benchmarkRef, "benchmarkRef");
        this.f240154a = timeSpan;
        this.f240155b = start;
        this.f240156c = end2;
        this.d = lastModified;
        this.e = timestamp;
        this.f = f;
        this.f240157g = f4;
        this.f240158h = f5;
        this.i = pnl2;
        this.f240159j = assetTypesId;
        this.k = currency;
        this.f240160l = method;
        this.f240161m = benchmarkRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f240154a == iVar.f240154a && Intrinsics.f(this.f240155b, iVar.f240155b) && Intrinsics.f(this.f240156c, iVar.f240156c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Float.compare(this.f, iVar.f) == 0 && Float.compare(this.f240157g, iVar.f240157g) == 0 && Intrinsics.f(this.f240158h, iVar.f240158h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f240159j, iVar.f240159j) && Intrinsics.f(this.k, iVar.k) && this.f240160l == iVar.f240160l && Intrinsics.f(this.f240161m, iVar.f240161m);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f240157g, m72.b.b(this.f, m72.b.f(this.e, m72.b.f(this.d, m72.b.f(this.f240156c, m72.b.f(this.f240155b, this.f240154a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        Float f = this.f240158h;
        return this.f240161m.hashCode() + prk.o.d(this.f240160l, p.a.c(p.a.c(wp5.y.e(this.i, (iB + (f == null ? 0 : f.hashCode())) * 31, 31), 31, this.f240159j), 31, this.k), 31);
    }
}
