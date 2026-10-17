package ovk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f230247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f230248b;

    public g(Clause clause, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f230247a = title;
        this.f230248b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f230247a.equals(gVar.f230247a) && Intrinsics.f(this.f230248b, gVar.f230248b);
    }

    public final int hashCode() {
        int iHashCode = this.f230247a.hashCode() * 31;
        Clause clause = this.f230248b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
