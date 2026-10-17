package era;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f128617a;

    public e(CompositeClause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f128617a = clause;
    }

    @Override // era.f
    public final Clause a() {
        return this.f128617a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f128617a.equals(((e) obj2).f128617a);
    }

    public final int hashCode() {
        return this.f128617a.hashCode();
    }
}
