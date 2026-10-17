package ax9;

import kotlin.jvm.internal.Intrinsics;
import mx0.qb;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements jki.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qb f10901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10902c;
    public final int d;

    public g(boolean z, qb scanState, int i, int i2) {
        Intrinsics.checkNotNullParameter(scanState, "scanState");
        this.f10900a = z;
        this.f10901b = scanState;
        this.f10902c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f10900a == gVar.f10900a && this.f10901b == gVar.f10901b && this.f10902c == gVar.f10902c && this.d == gVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f10902c, (this.f10901b.hashCode() + (Boolean.hashCode(this.f10900a) * 31)) * 31, 31);
    }
}
