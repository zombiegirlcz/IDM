package sul;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f265797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f265798b;

    public g(Clause titleClause, TextLocalisedClause secondDescriptionClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(secondDescriptionClause, "secondDescriptionClause");
        this.f265797a = titleClause;
        this.f265798b = secondDescriptionClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f265797a, gVar.f265797a) && this.f265798b.equals(gVar.f265798b);
    }

    public final int hashCode() {
        return this.f265798b.hashCode() + (this.f265797a.hashCode() * 31);
    }
}
