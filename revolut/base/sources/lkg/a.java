package lkg;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nie.g;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedTransactionsFilter f196419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f196420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionListDestination f196421c;

    public a(UnifiedTransactionsFilter unifiedFilter, List scopes, TransactionListDestination seeAllDestination) {
        Intrinsics.checkNotNullParameter(unifiedFilter, "unifiedFilter");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(seeAllDestination, "seeAllDestination");
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        RecurringPaymentAccount.Personal recurringPaymentAccount = RecurringPaymentAccount.Personal.f89320a;
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
        this.f196419a = unifiedFilter;
        this.f196420b = scopes;
        this.f196421c = seeAllDestination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        if (!Intrinsics.f(this.f196419a, aVar.f196419a) || !Intrinsics.f(this.f196420b, aVar.f196420b) || !this.f196421c.equals(aVar.f196421c)) {
            return false;
        }
        Object obj3 = AccountId.Personal.f51414a;
        if (!obj3.equals(obj3)) {
            return false;
        }
        Object obj4 = RecurringPaymentAccount.Personal.f89320a;
        return obj4.equals(obj4);
    }

    public final int hashCode() {
        return (RecurringPaymentAccount.Personal.f89320a.hashCode() + ((AccountId.Personal.f51414a.hashCode() + ((this.f196421c.f91991b.hashCode() + p.a.d(this.f196419a.hashCode() * 961, 31, this.f196420b)) * 31)) * 31)) * 31;
    }
}
