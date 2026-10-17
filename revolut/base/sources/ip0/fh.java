package ip0;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fh implements gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f164265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f164266b;

    public fh(TextClause topClause, MoneyClause bottomClause) {
        Intrinsics.checkNotNullParameter(topClause, "topClause");
        Intrinsics.checkNotNullParameter(bottomClause, "bottomClause");
        this.f164265a = topClause;
        this.f164266b = bottomClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fh)) {
            return false;
        }
        fh fhVar = (fh) obj2;
        return this.f164265a.equals(fhVar.f164265a) && this.f164266b.equals(fhVar.f164266b);
    }

    public final int hashCode() {
        return this.f164266b.hashCode() + (this.f164265a.hashCode() * 31);
    }
}
