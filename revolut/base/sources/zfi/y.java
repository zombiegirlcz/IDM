package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f322006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f322007b;

    public y(dj0.d min, dj0.d max) {
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        this.f322006a = min;
        this.f322007b = max;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f322006a, yVar.f322006a) && Intrinsics.f(this.f322007b, yVar.f322007b);
    }

    public final int hashCode() {
        return this.f322007b.hashCode() + (this.f322006a.hashCode() * 31);
    }
}
