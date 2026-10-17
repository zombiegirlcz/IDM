package w7b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f295500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f295501b;

    public l(TextLocalisedClause title, TextClause textClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f295500a = title;
        this.f295501b = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f295500a.equals(lVar.f295500a) && Intrinsics.f(this.f295501b, lVar.f295501b);
    }

    public final int hashCode() {
        int iHashCode = this.f295500a.hashCode() * 31;
        Clause clause = this.f295501b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
