package xah;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.jvm.internal.Intrinsics;
import oc.f;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements f1h.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f303890a;

    public e(f transactionsDependenciesProvider) {
        Intrinsics.checkNotNullParameter(transactionsDependenciesProvider, "transactionsDependenciesProvider");
        this.f303890a = transactionsDependenciesProvider;
    }

    @Override // f1h.e
    public final RowDelegate.Model a(InvestTransaction transaction, q1h.b options, Object obj2) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(options, "options");
        WealthAccountType accountType = transaction.getF85125a().b();
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return this.f303890a.a(accountType).c().a(transaction, options, obj2);
    }
}
