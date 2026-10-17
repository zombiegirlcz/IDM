package nii;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v1 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216235b;

    public v1(Clause primaryButtonText, Clause clause) {
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        this.f216234a = primaryButtonText;
        this.f216235b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj2;
        return Intrinsics.f(this.f216234a, v1Var.f216234a) && Intrinsics.f(this.f216235b, v1Var.f216235b);
    }

    public final int hashCode() {
        int iHashCode = this.f216234a.hashCode() * 31;
        Clause clause = this.f216235b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
