package rr6;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f256711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f256712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f256713c;
    public final int d;

    public i(int i, double d, dj0.d saleVolumeTarget, int i2) {
        Intrinsics.checkNotNullParameter(saleVolumeTarget, "saleVolumeTarget");
        this.f256711a = i;
        this.f256712b = d;
        this.f256713c = saleVolumeTarget;
        this.d = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f256711a == iVar.f256711a && Double.compare(this.f256712b, iVar.f256712b) == 0 && Intrinsics.f(this.f256713c, iVar.f256713c) && this.d == iVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + v7.c(m72.b.c(Integer.hashCode(this.f256711a) * 31, this.f256712b, 31), 31, this.f256713c);
    }
}
