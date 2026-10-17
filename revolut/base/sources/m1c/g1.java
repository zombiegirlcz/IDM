package m1c;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f201366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f201367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f201368c;

    public g1(ArrayList productEligibilities, p0 pointsEligibilityState, boolean z) {
        Intrinsics.checkNotNullParameter(productEligibilities, "productEligibilities");
        Intrinsics.checkNotNullParameter(pointsEligibilityState, "pointsEligibilityState");
        this.f201366a = productEligibilities;
        this.f201367b = pointsEligibilityState;
        this.f201368c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return this.f201366a.equals(g1Var.f201366a) && this.f201367b == g1Var.f201367b && this.f201368c == g1Var.f201368c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201368c) + ((this.f201367b.hashCode() + (this.f201366a.hashCode() * 31)) * 31);
    }
}
