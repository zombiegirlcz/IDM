package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eel.c f240172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f240173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f240174c;
    public final float d;
    public final Float e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f240175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f240176h;
    public final iwg.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f240177j;

    public k(eel.c timeSpan, DateTime timestamp, float f, float f4, Float f5, jo3.b pnl2, String assetTypesId, String currency, iwg.c method, String benchmarkRef) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        Intrinsics.checkNotNullParameter(assetTypesId, "assetTypesId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(benchmarkRef, "benchmarkRef");
        this.f240172a = timeSpan;
        this.f240173b = timestamp;
        this.f240174c = f;
        this.d = f4;
        this.e = f5;
        this.f = pnl2;
        this.f240175g = assetTypesId;
        this.f240176h = currency;
        this.i = method;
        this.f240177j = benchmarkRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f240172a == kVar.f240172a && Intrinsics.f(this.f240173b, kVar.f240173b) && Float.compare(this.f240174c, kVar.f240174c) == 0 && Float.compare(this.d, kVar.d) == 0 && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f240175g, kVar.f240175g) && Intrinsics.f(this.f240176h, kVar.f240176h) && this.i == kVar.i && Intrinsics.f(this.f240177j, kVar.f240177j);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.d, m72.b.b(this.f240174c, m72.b.f(this.f240173b, this.f240172a.hashCode() * 31, 31), 31), 31);
        Float f = this.e;
        return this.f240177j.hashCode() + prk.o.d(this.i, p.a.c(p.a.c(wp5.y.e(this.f, (iB + (f == null ? 0 : f.hashCode())) * 31, 31), 31, this.f240175g), 31, this.f240176h), 31);
    }
}
