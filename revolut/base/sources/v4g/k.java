package v4g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f286082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f286083b;

    public k(CompositeClause compositeClause, MoneyClause fiat) {
        Intrinsics.checkNotNullParameter(fiat, "fiat");
        this.f286082a = compositeClause;
        this.f286083b = fiat;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f286082a, kVar.f286082a) && this.f286083b.equals(kVar.f286083b);
    }

    public final int hashCode() {
        Clause clause = this.f286082a;
        return this.f286083b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
