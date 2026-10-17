package au0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n0 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f9278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9279b;

    public n0(TextLocalisedClause clause, boolean z) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f9278a = clause;
        this.f9279b = z;
    }

    @Override // au0.p0
    public final Clause a() {
        return this.f9278a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return this.f9278a.equals(n0Var.f9278a) && this.f9279b == n0Var.f9279b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9279b) + (this.f9278a.hashCode() * 31);
    }
}
