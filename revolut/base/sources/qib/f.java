package qib;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f246682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f246683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f246684c;
    public final int d;

    public f(e status, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f246682a = status;
        this.f246683b = i;
        this.f246684c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f246682a == fVar.f246682a && this.f246683b == fVar.f246683b && this.f246684c == fVar.f246684c && this.d == fVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f246684c, j6.a.b(this.f246683b, this.f246682a.hashCode() * 31, 31), 31);
    }
}
