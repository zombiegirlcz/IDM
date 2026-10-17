package lxb;

import kotlin.jvm.internal.Intrinsics;
import m1c.o0;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f200545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f200546b;

    public e(hha.d plan, o0 o0Var) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f200545a = plan;
        this.f200546b = o0Var;
    }

    public final String a() {
        String str = this.f200545a.f152287a;
        o0 o0Var = this.f200546b;
        return a0.d.s("REV_POINTS_PRODUCT_ELIGIBILITIES_KEY-", str, "-", o0Var != null ? o0Var.name() : null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f200545a, eVar.f200545a) && this.f200546b == eVar.f200546b;
    }

    public final int hashCode() {
        int iHashCode = this.f200545a.hashCode() * 31;
        o0 o0Var = this.f200546b;
        return iHashCode + (o0Var == null ? 0 : o0Var.hashCode());
    }
}
