package ukk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f280776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f280777b;

    public j(Clause clause, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f280776a = title;
        this.f280777b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f280776a.equals(jVar.f280776a) && Intrinsics.f(this.f280777b, jVar.f280777b);
    }

    public final int hashCode() {
        int iHashCode = this.f280776a.hashCode() * 31;
        Clause clause = this.f280777b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
