package ijj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f161812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f161813b;

    public k(Clause clause, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f161812a = title;
        this.f161813b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f161812a.equals(kVar.f161812a) && Intrinsics.f(this.f161813b, kVar.f161813b);
    }

    public final int hashCode() {
        int iHashCode = this.f161812a.hashCode() * 31;
        Clause clause = this.f161813b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
