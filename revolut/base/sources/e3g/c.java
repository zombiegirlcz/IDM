package e3g;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntRange f122263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntRange f122264b;

    public c(IntRange weightRangeKg, IntRange heightRangeCm) {
        Intrinsics.checkNotNullParameter(weightRangeKg, "weightRangeKg");
        Intrinsics.checkNotNullParameter(heightRangeCm, "heightRangeCm");
        this.f122263a = weightRangeKg;
        this.f122264b = heightRangeCm;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f122263a, cVar.f122263a) && Intrinsics.f(this.f122264b, cVar.f122264b);
    }

    public final int hashCode() {
        return Integer.hashCode(174) + ((this.f122264b.hashCode() + j6.a.b(70, this.f122263a.hashCode() * 31, 31)) * 31);
    }
}
