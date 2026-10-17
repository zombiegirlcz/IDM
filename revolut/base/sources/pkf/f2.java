package pkf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f237050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f237051b;

    public f2(Clause primaryEndText, MoneyClause moneyClause) {
        Intrinsics.checkNotNullParameter(primaryEndText, "primaryEndText");
        this.f237050a = primaryEndText;
        this.f237051b = moneyClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj2;
        return Intrinsics.f(this.f237050a, f2Var.f237050a) && Intrinsics.f(this.f237051b, f2Var.f237051b);
    }

    public final int hashCode() {
        int iHashCode = this.f237050a.hashCode() * 31;
        Clause clause = this.f237051b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
