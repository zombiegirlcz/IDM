package nii;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w1 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216240b;

    public w1(Clause primaryButtonText, Clause clause) {
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        this.f216239a = primaryButtonText;
        this.f216240b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f216239a, w1Var.f216239a) && Intrinsics.f(this.f216240b, w1Var.f216240b);
    }

    public final int hashCode() {
        int iHashCode = this.f216239a.hashCode() * 961;
        Clause clause = this.f216240b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    public /* synthetic */ w1(int i, Clause clause, Clause clause2) {
        this(clause, (i & 4) != 0 ? null : clause2);
    }
}
