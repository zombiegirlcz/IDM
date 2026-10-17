package oqk;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedTransactionsFilter f227983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nce.a f227984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f227985c;
    public final ParcelableDestination d;
    public final AccountId e;
    public final RecurringPaymentAccount f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f227986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nie.c f227987h;
    public final boolean i;

    public s(UnifiedTransactionsFilter unifiedTransactionsFilter, nce.a aVar, List scopes, ParcelableDestination seeAllDestination, AccountId accountId, RecurringPaymentAccount recurringPaymentAccount, Set disablePredefinedFilters, nie.c cVar, boolean z) {
        Intrinsics.checkNotNullParameter(unifiedTransactionsFilter, "unifiedTransactionsFilter");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(seeAllDestination, "seeAllDestination");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
        Intrinsics.checkNotNullParameter(disablePredefinedFilters, "disablePredefinedFilters");
        this.f227983a = unifiedTransactionsFilter;
        this.f227984b = aVar;
        this.f227985c = scopes;
        this.d = seeAllDestination;
        this.e = accountId;
        this.f = recurringPaymentAccount;
        this.f227986g = disablePredefinedFilters;
        this.f227987h = cVar;
        this.i = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f227983a, sVar.f227983a) && Intrinsics.f(this.f227984b, sVar.f227984b) && Intrinsics.f(this.f227985c, sVar.f227985c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f227986g, sVar.f227986g) && Intrinsics.f(this.f227987h, sVar.f227987h) && this.i == sVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.f227983a.hashCode() * 31;
        nce.a aVar = this.f227984b;
        int iF = p.a.f((this.f.hashCode() + h30.l.b(this.e, (this.d.hashCode() + p.a.d((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f227985c)) * 31, 31)) * 31, 31, this.f227986g);
        nie.c cVar = this.f227987h;
        return Boolean.hashCode(this.i) + ((iF + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }
}
