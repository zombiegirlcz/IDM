package knd;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yld.d f186090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f186091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f186092c;
    public final Priority d;

    public i(yld.d screenType, List exclusions, Collection collection, Priority.HIGH high, int i) {
        exclusions = (i & 2) != 0 ? zhm.v.k(CategorisationFilter.Exclusion.Investments.f65749a, CategorisationFilter.Exclusion.InternalCredits.f65748a, CategorisationFilter.Exclusion.StakingTransactions.f65750a) : exclusions;
        collection = (i & 4) != 0 ? null : collection;
        Priority transactionPriority = high;
        transactionPriority = (i & 8) != 0 ? Priority.STANDARD.f60263b : transactionPriority;
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(exclusions, "exclusions");
        Intrinsics.checkNotNullParameter(transactionPriority, "transactionPriority");
        this.f186090a = screenType;
        this.f186091b = exclusions;
        this.f186092c = collection;
        this.d = transactionPriority;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f186090a == iVar.f186090a && Intrinsics.f(this.f186091b, iVar.f186091b) && Intrinsics.f(this.f186092c, iVar.f186092c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f186090a.hashCode() * 31, 31, this.f186091b);
        Collection collection = this.f186092c;
        return this.d.hashCode() + ((iD + (collection == null ? 0 : collection.hashCode())) * 31);
    }
}
