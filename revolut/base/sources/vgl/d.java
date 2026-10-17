package vgl;

import eel.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f289214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f289215b;

    public d(e chart, Integer num) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.f289214a = chart;
        this.f289215b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f289214a, dVar.f289214a) && Intrinsics.f(this.f289215b, dVar.f289215b);
    }

    public final int hashCode() {
        int iHashCode = this.f289214a.hashCode() * 31;
        Integer num = this.f289215b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
