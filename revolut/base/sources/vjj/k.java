package vjj;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f289769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f289770b;

    public k(Clause clause, Clause clause2) {
        this.f289769a = clause;
        this.f289770b = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f289769a, kVar.f289769a) && Intrinsics.f(this.f289770b, kVar.f289770b);
    }

    public final int hashCode() {
        Clause clause = this.f289769a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f289770b;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
