package kq2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f188298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f188299b;

    public d(double d, dj0.d fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f188298a = d;
        this.f188299b = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Double.compare(this.f188298a, dVar.f188298a) == 0 && Intrinsics.f(this.f188299b, dVar.f188299b);
    }

    public final int hashCode() {
        return this.f188299b.hashCode() + (Double.hashCode(this.f188298a) * 31);
    }
}
