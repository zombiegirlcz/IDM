package bhj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f15301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f15302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f15303c;

    public /* synthetic */ a(int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        this((i & 2) != 0 ? null : textLocalisedClause2, textLocalisedClause, (TextLocalisedClause) null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f15301a, aVar.f15301a) && Intrinsics.f(this.f15302b, aVar.f15302b) && Intrinsics.f(this.f15303c, aVar.f15303c);
    }

    public final int hashCode() {
        int iHashCode = this.f15301a.hashCode() * 31;
        Clause clause = this.f15302b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f15303c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }

    public a(Clause clause, TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f15301a = title;
        this.f15302b = clause;
        this.f15303c = textLocalisedClause;
    }
}
