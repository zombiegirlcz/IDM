package k4l;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f180965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f180967c;
    public final boolean d;
    public final List e;

    public f0(ArrayList allowedInvestValueTypes, int i, Instant instant, boolean z, List exitStrategies) {
        Intrinsics.checkNotNullParameter(allowedInvestValueTypes, "allowedInvestValueTypes");
        Intrinsics.checkNotNullParameter(exitStrategies, "exitStrategies");
        this.f180965a = allowedInvestValueTypes;
        this.f180966b = i;
        this.f180967c = instant;
        this.d = z;
        this.e = exitStrategies;
    }

    @Override // k4l.j0
    public final int I4() {
        return this.f180966b;
    }

    @Override // k4l.j0
    public final List N2() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f180965a.equals(f0Var.f180965a) && this.f180966b == f0Var.f180966b && Intrinsics.f(this.f180967c, f0Var.f180967c) && this.d == f0Var.d && Intrinsics.f(this.e, f0Var.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f180966b, this.f180965a.hashCode() * 31, 31);
        Instant instant = this.f180967c;
        return this.e.hashCode() + j6.a.c((iB + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.d);
    }

    @Override // k4l.j0
    public final Instant j0() {
        return this.f180967c;
    }

    @Override // k4l.j0
    public final List z9() {
        return this.f180965a;
    }
}
