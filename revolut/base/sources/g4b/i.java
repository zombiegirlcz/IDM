package g4b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y49.h f140436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f140437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f140438c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nel.n f140439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ej0.b f140440h;
    public final ej0.b i;

    public i(y49.h positionsPerformance) {
        Intrinsics.checkNotNullParameter(positionsPerformance, "positionsPerformance");
        this.f140436a = positionsPerformance;
        this.f140437b = positionsPerformance.f310848b;
        this.f140438c = positionsPerformance.k;
        this.d = positionsPerformance.f310850g;
        this.e = positionsPerformance.e;
        this.f = positionsPerformance.f310849c;
        this.f140439g = positionsPerformance.f310847a;
        this.f140440h = positionsPerformance.f310852j;
        this.i = positionsPerformance.i;
    }

    @Override // g4b.k
    public final dj0.d a() {
        return this.d;
    }

    @Override // g4b.k
    public final BigDecimal b() {
        return this.f140438c;
    }

    @Override // g4b.k
    public final dj0.d c() {
        return this.e;
    }

    @Override // g4b.k
    public final dj0.d d() {
        return this.f;
    }

    @Override // g4b.k
    public final ej0.b e() {
        return this.f140440h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f140436a, ((i) obj2).f140436a);
    }

    @Override // g4b.k
    public final ej0.b f() {
        return this.i;
    }

    public final int hashCode() {
        return this.f140436a.hashCode();
    }

    @Override // g4b.k
    public final nel.n n() {
        return this.f140439g;
    }

    @Override // g4b.k
    public final BigDecimal u() {
        return this.f140437b;
    }
}
