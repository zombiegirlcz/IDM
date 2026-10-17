package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f325822a;

    public o0(g1 promotionalBanner) {
        Intrinsics.checkNotNullParameter(promotionalBanner, "promotionalBanner");
        this.f325822a = promotionalBanner;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o0) && Intrinsics.f(this.f325822a, ((o0) obj2).f325822a);
    }

    public final int hashCode() {
        return this.f325822a.hashCode();
    }
}
