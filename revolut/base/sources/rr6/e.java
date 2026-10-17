package rr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f256701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f256702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f256703c;

    public e(i tierConfig, double d, dj0.d remainingVolume) {
        Intrinsics.checkNotNullParameter(tierConfig, "tierConfig");
        Intrinsics.checkNotNullParameter(remainingVolume, "remainingVolume");
        this.f256701a = tierConfig;
        this.f256702b = d;
        this.f256703c = remainingVolume;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f256701a, eVar.f256701a) && Double.compare(this.f256702b, eVar.f256702b) == 0 && Intrinsics.f(this.f256703c, eVar.f256703c);
    }

    public final int hashCode() {
        return this.f256703c.hashCode() + m72.b.c(this.f256701a.hashCode() * 31, this.f256702b, 31);
    }
}
