package b1c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f11789b;

    public n(CompositeClause compositeClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f11788a = items;
        this.f11789b = compositeClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f11788a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f11788a, nVar.f11788a) && Intrinsics.f(this.f11789b, nVar.f11789b);
    }

    public final int hashCode() {
        int iHashCode = this.f11788a.hashCode() * 31;
        Clause clause = this.f11789b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
