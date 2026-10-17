package lr6;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f199420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f199421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f199422c;
    public final dj0.d d;

    public x(int i, int i2, dj0.d volumeCurrent, dj0.d volumeTarget) {
        Intrinsics.checkNotNullParameter(volumeCurrent, "volumeCurrent");
        Intrinsics.checkNotNullParameter(volumeTarget, "volumeTarget");
        this.f199420a = i;
        this.f199421b = i2;
        this.f199422c = volumeCurrent;
        this.d = volumeTarget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f199420a == xVar.f199420a && this.f199421b == xVar.f199421b && Intrinsics.f(this.f199422c, xVar.f199422c) && Intrinsics.f(this.d, xVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(j6.a.b(this.f199421b, Integer.hashCode(this.f199420a) * 31, 31), 31, this.f199422c);
    }
}
