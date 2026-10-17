package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f166170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tf f166171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f166172c;
    public final Object d;

    public rf(Float f, tf tfVar, Clause xAxisLegend, Pair pair) {
        Intrinsics.checkNotNullParameter(xAxisLegend, "xAxisLegend");
        this.f166170a = f;
        this.f166171b = tfVar;
        this.f166172c = xAxisLegend;
        this.d = pair;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rf)) {
            return false;
        }
        rf rfVar = (rf) obj2;
        return Intrinsics.f(this.f166170a, rfVar.f166170a) && Intrinsics.f(this.f166171b, rfVar.f166171b) && this.f166172c.equals(rfVar.f166172c) && Intrinsics.f(this.d, rfVar.d);
    }

    public final int hashCode() {
        Float f = this.f166170a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        tf tfVar = this.f166171b;
        int iB = p.a.b((iHashCode + (tfVar == null ? 0 : tfVar.hashCode())) * 31, 31, this.f166172c);
        Object obj2 = this.d;
        return iB + (obj2 != null ? obj2.hashCode() : 0);
    }
}
