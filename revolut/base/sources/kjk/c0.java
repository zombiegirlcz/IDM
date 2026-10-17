package kjk;

import ggk.g0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f184425b;

    public c0(String currentPlanId, g0 entryPoint) {
        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f184424a = currentPlanId;
        this.f184425b = entryPoint;
    }

    public final String a() {
        return a0.d.s("plans_dashboard_layout_", this.f184425b.a(), "_", this.f184424a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f184424a, c0Var.f184424a) && this.f184425b == c0Var.f184425b;
    }

    public final int hashCode() {
        return this.f184425b.hashCode() + (this.f184424a.hashCode() * 31);
    }
}
