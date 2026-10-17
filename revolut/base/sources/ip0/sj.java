package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f166362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f166363b;

    public sj(dj0.d upperBound, dj0.d lowerBound) {
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        this.f166362a = upperBound;
        this.f166363b = lowerBound;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sj)) {
            return false;
        }
        sj sjVar = (sj) obj2;
        return this.f166362a.equals(sjVar.f166362a) && Intrinsics.f(this.f166363b, sjVar.f166363b);
    }

    public final int hashCode() {
        return Integer.hashCode(6) + v7.c(this.f166362a.hashCode() * 31, 31, this.f166363b);
    }
}
