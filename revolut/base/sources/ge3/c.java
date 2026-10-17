package ge3;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CategorisationFilter f143218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsAccountsSelection f143219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f143220c;
    public final Priority d;

    public c(CategorisationFilter filter, AnalyticsAccountsSelection analyticsAccountsSelection, Collection collection, Priority transactionPriority) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "analyticsAccountsSelection");
        Intrinsics.checkNotNullParameter(transactionPriority, "transactionPriority");
        this.f143218a = filter;
        this.f143219b = analyticsAccountsSelection;
        this.f143220c = collection;
        this.d = transactionPriority;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f143218a, cVar.f143218a) && Intrinsics.f(this.f143219b, cVar.f143219b) && Intrinsics.f(this.f143220c, cVar.f143220c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f143219b.hashCode() + (this.f143218a.hashCode() * 31)) * 31;
        Collection collection = this.f143220c;
        return this.d.hashCode() + ((iHashCode + (collection == null ? 0 : collection.hashCode())) * 31);
    }

    public /* synthetic */ c(CategorisationFilter categorisationFilter, AnalyticsAccountsSelection analyticsAccountsSelection, Priority.HIGH high, int i) {
        this(categorisationFilter, analyticsAccountsSelection, (Collection) null, (i & 8) != 0 ? Priority.STANDARD.f60263b : high);
    }
}
