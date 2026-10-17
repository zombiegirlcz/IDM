package k4l;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f180977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f180979c;
    public final ArrayList d;
    public final List e;

    public h0(List allowedInvestValueTypes, int i, Instant instant, ArrayList availablePeriods, List exitStrategies) {
        Intrinsics.checkNotNullParameter(allowedInvestValueTypes, "allowedInvestValueTypes");
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        Intrinsics.checkNotNullParameter(exitStrategies, "exitStrategies");
        this.f180977a = allowedInvestValueTypes;
        this.f180978b = i;
        this.f180979c = instant;
        this.d = availablePeriods;
        this.e = exitStrategies;
    }

    @Override // k4l.j0
    public final int I4() {
        return this.f180978b;
    }

    @Override // k4l.j0
    public final List N2() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f180977a, h0Var.f180977a) && this.f180978b == h0Var.f180978b && Intrinsics.f(this.f180979c, h0Var.f180979c) && this.d.equals(h0Var.d) && Intrinsics.f(this.e, h0Var.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f180978b, this.f180977a.hashCode() * 31, 31);
        Instant instant = this.f180979c;
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iB + (instant == null ? 0 : instant.hashCode())) * 31, 31);
    }

    @Override // k4l.j0
    public final Instant j0() {
        return this.f180979c;
    }

    @Override // k4l.j0
    public final List z9() {
        return this.f180977a;
    }
}
