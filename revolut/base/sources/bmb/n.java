package bmb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f16796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f16797b;

    public n(TextLocalisedClause title, HtmlClause htmlClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f16796a = title;
        this.f16797b = htmlClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f16796a.equals(nVar.f16796a) && Intrinsics.f(this.f16797b, nVar.f16797b);
    }

    public final int hashCode() {
        int iHashCode = this.f16796a.hashCode() * 31;
        Clause clause = this.f16797b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
