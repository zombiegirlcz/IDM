package lt0;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f199737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f199738b;

    public f(dj0.d upperBound, dj0.d lowerBound) {
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        this.f199737a = upperBound;
        this.f199738b = lowerBound;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f199737a.equals(fVar.f199737a) && Intrinsics.f(this.f199738b, fVar.f199738b);
    }

    public final int hashCode() {
        return Integer.hashCode(6) + v7.c(this.f199737a.hashCode() * 31, 31, this.f199738b);
    }
}
