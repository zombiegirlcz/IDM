package gch;

import java.util.Set;
import k4l.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f142477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f142478b;

    public g(c0 selectedPeriod) {
        Set availablePeriods = kotlin.collections.d.y0(c0.values());
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        this.f142477a = selectedPeriod;
        this.f142478b = availablePeriods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f142477a == gVar.f142477a && Intrinsics.f(this.f142478b, gVar.f142478b);
    }

    public final int hashCode() {
        return this.f142478b.hashCode() + (this.f142477a.hashCode() * 31);
    }
}
