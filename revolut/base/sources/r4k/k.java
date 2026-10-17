package r4k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f251476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f251477b;

    public k(Clause clause, TextLocalisedClause submitButtonClause) {
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f251476a = submitButtonClause;
        this.f251477b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f251476a.equals(kVar.f251476a) && Intrinsics.f(this.f251477b, kVar.f251477b);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f251476a.hashCode() * 31, 31, true);
        Clause clause = this.f251477b;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
