package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f4594c;
    public final e d;
    public final d e;

    public f(String ref2, b price, c primaryStats, e yieldStats, d riskStats) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(primaryStats, "primaryStats");
        Intrinsics.checkNotNullParameter(yieldStats, "yieldStats");
        Intrinsics.checkNotNullParameter(riskStats, "riskStats");
        this.f4592a = ref2;
        this.f4593b = price;
        this.f4594c = primaryStats;
        this.d = yieldStats;
        this.e = riskStats;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f4592a, fVar.f4592a) && Intrinsics.f(this.f4593b, fVar.f4593b) && Intrinsics.f(this.f4594c, fVar.f4594c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f4594c.hashCode() + ((this.f4593b.hashCode() + (this.f4592a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // afl.a
    public final String i() {
        return this.f4592a;
    }
}
