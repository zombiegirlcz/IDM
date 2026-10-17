package k4l;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f180983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f180985c;
    public final List d;

    public i0(ArrayList allowedInvestValueTypes, int i, Instant instant, List exitStrategies) {
        Intrinsics.checkNotNullParameter(allowedInvestValueTypes, "allowedInvestValueTypes");
        Intrinsics.checkNotNullParameter(exitStrategies, "exitStrategies");
        this.f180983a = allowedInvestValueTypes;
        this.f180984b = i;
        this.f180985c = instant;
        this.d = exitStrategies;
    }

    @Override // k4l.j0
    public final int I4() {
        return this.f180984b;
    }

    @Override // k4l.j0
    public final List N2() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return this.f180983a.equals(i0Var.f180983a) && this.f180984b == i0Var.f180984b && Intrinsics.f(this.f180985c, i0Var.f180985c) && Intrinsics.f(this.d, i0Var.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f180984b, this.f180983a.hashCode() * 31, 31);
        Instant instant = this.f180985c;
        return this.d.hashCode() + ((iB + (instant == null ? 0 : instant.hashCode())) * 31);
    }

    @Override // k4l.j0
    public final Instant j0() {
        return this.f180985c;
    }

    @Override // k4l.j0
    public final List z9() {
        return this.f180983a;
    }
}
