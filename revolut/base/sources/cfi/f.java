package cfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f23705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f23706b;

    public f(double d, dj0.d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23705a = value;
        this.f23706b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f23705a, fVar.f23705a) && Double.compare(this.f23706b, fVar.f23706b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f23706b) + (this.f23705a.hashCode() * 31);
    }
}
