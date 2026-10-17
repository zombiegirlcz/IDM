package rp0;

import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressStyle f256177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f256178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f256179c;

    public t0(ProgressStyle progressStyle, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(progressStyle, "progressStyle");
        this.f256177a = progressStyle;
        this.f256178b = clause;
        this.f256179c = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f256177a, t0Var.f256177a) && Intrinsics.f(this.f256178b, t0Var.f256178b) && Intrinsics.f(this.f256179c, t0Var.f256179c);
    }

    public final int hashCode() {
        int iHashCode = this.f256177a.hashCode() * 31;
        Clause clause = this.f256178b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f256179c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
