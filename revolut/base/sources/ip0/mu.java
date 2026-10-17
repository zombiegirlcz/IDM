package ip0;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f165419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f165420b;

    public mu(CompositeClause compositeClause, MoneyClause priceClause) {
        Intrinsics.checkNotNullParameter(priceClause, "priceClause");
        this.f165419a = priceClause;
        this.f165420b = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mu)) {
            return false;
        }
        mu muVar = (mu) obj2;
        return this.f165419a.equals(muVar.f165419a) && this.f165420b.equals(muVar.f165420b);
    }

    public final int hashCode() {
        return this.f165420b.hashCode() + (this.f165419a.hashCode() * 31);
    }
}
