package tof;

import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f273052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f273053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f273054c;

    public t2(Set relatedTransactionsGroupIds, LinkedHashSet pocketIds, CompositeClause detailsSubtitleClause) {
        Intrinsics.checkNotNullParameter(relatedTransactionsGroupIds, "relatedTransactionsGroupIds");
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        Intrinsics.checkNotNullParameter(detailsSubtitleClause, "detailsSubtitleClause");
        this.f273052a = relatedTransactionsGroupIds;
        this.f273053b = pocketIds;
        this.f273054c = detailsSubtitleClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj2;
        return Intrinsics.f(this.f273052a, t2Var.f273052a) && this.f273053b.equals(t2Var.f273053b) && this.f273054c.equals(t2Var.f273054c);
    }

    public final int hashCode() {
        return this.f273054c.hashCode() + ((this.f273053b.hashCode() + (this.f273052a.hashCode() * 31)) * 31);
    }
}
