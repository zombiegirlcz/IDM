package k4l;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f180971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f180973c;
    public final List d;

    public g0(ArrayList allowedInvestValueTypes, int i, Instant instant, List exitStrategies) {
        Intrinsics.checkNotNullParameter(allowedInvestValueTypes, "allowedInvestValueTypes");
        Intrinsics.checkNotNullParameter(exitStrategies, "exitStrategies");
        this.f180971a = allowedInvestValueTypes;
        this.f180972b = i;
        this.f180973c = instant;
        this.d = exitStrategies;
    }

    @Override // k4l.j0
    public final int I4() {
        return this.f180972b;
    }

    @Override // k4l.j0
    public final List N2() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f180971a.equals(g0Var.f180971a) && this.f180972b == g0Var.f180972b && Intrinsics.f(this.f180973c, g0Var.f180973c) && Intrinsics.f(this.d, g0Var.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f180972b, this.f180971a.hashCode() * 31, 31);
        Instant instant = this.f180973c;
        return this.d.hashCode() + ((iB + (instant == null ? 0 : instant.hashCode())) * 31);
    }

    @Override // k4l.j0
    public final Instant j0() {
        return this.f180973c;
    }

    @Override // k4l.j0
    public final List z9() {
        return this.f180971a;
    }
}
