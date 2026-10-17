package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r2 extends s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10508b;

    public r2(Clause value, Clause clause) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10507a = value;
        this.f10508b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.f10507a, r2Var.f10507a) && Intrinsics.f(this.f10508b, r2Var.f10508b);
    }

    public final int hashCode() {
        int iHashCode = this.f10507a.hashCode() * 31;
        Clause clause = this.f10508b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
