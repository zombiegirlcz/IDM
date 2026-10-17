package ssi;

import com.revolut.core.model.account.AccountId;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements nie.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f265419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nce.a f265420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionContext f265421c;
    public final List d;
    public final ParcelableDestination e;
    public final AccountId f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecurringPaymentAccount f265422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nie.c f265423h;
    public final Set i;

    public n(i7 transactionFilter, nce.a aVar, TransactionContext transactionContext, List scopes, ParcelableDestination seeAllDestination, AccountId accountId, RecurringPaymentAccount recurringPaymentAccount, nie.c cVar, Set disablePredefinedFilters, int i) {
        aVar = (i & 2) != 0 ? null : aVar;
        transactionContext = (i & 4) != 0 ? new TransactionContext(new Priority.HIGH("Transactions widget"), null, 2) : transactionContext;
        accountId = (i & 32) != 0 ? AccountId.Personal.f51414a : accountId;
        recurringPaymentAccount = (i & 64) != 0 ? RecurringPaymentAccount.Personal.f89320a : recurringPaymentAccount;
        cVar = (i & 128) != 0 ? null : cVar;
        disablePredefinedFilters = (i & 256) != 0 ? h0.f322473a : disablePredefinedFilters;
        Intrinsics.checkNotNullParameter(transactionFilter, "transactionFilter");
        Intrinsics.checkNotNullParameter(transactionContext, "transactionContext");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(seeAllDestination, "seeAllDestination");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
        Intrinsics.checkNotNullParameter(disablePredefinedFilters, "disablePredefinedFilters");
        this.f265419a = transactionFilter;
        this.f265420b = aVar;
        this.f265421c = transactionContext;
        this.d = scopes;
        this.e = seeAllDestination;
        this.f = accountId;
        this.f265422g = recurringPaymentAccount;
        this.f265423h = cVar;
        this.i = disablePredefinedFilters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f265419a, nVar.f265419a) && Intrinsics.f(this.f265420b, nVar.f265420b) && Intrinsics.f(this.f265421c, nVar.f265421c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f265422g, nVar.f265422g) && Intrinsics.f(this.f265423h, nVar.f265423h) && Intrinsics.f(this.i, nVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f265419a.hashCode() * 31;
        nce.a aVar = this.f265420b;
        int iHashCode2 = (this.f265422g.hashCode() + h30.l.b(this.f, (this.e.hashCode() + p.a.d((this.f265421c.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31, this.d)) * 31, 31)) * 31;
        nie.c cVar = this.f265423h;
        return Boolean.hashCode(false) + p.a.f((iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.i);
    }
}
