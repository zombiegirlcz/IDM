package n1j;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f211394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f211395b;

    public n(Clause clause, boolean z) {
        this.f211394a = z;
        this.f211395b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f211394a == nVar.f211394a && Intrinsics.f(this.f211395b, nVar.f211395b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f211394a) * 31;
        Clause clause = this.f211395b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
