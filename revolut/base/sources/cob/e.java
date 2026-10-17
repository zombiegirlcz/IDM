package cob;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.vaults.R$string;
import djb.q;
import g48.r0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import rhf.g;
import rhf.h;
import ssi.n;
import ssi.o;
import tof.i7;
import tof.q6;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f25523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f25524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f25525c;

    public e(q savingsTransactionsInteractor, o transactionsWidgetUiModel, mjb.a savingsNavigationProvider, r0 jointAccountInteractor, gjb.b teenSavingsAccountIdResolver) {
        Intrinsics.checkNotNullParameter(savingsTransactionsInteractor, "savingsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(savingsNavigationProvider, "savingsNavigationProvider");
        Intrinsics.checkNotNullParameter(jointAccountInteractor, "jointAccountInteractor");
        Intrinsics.checkNotNullParameter(teenSavingsAccountIdResolver, "teenSavingsAccountIdResolver");
        this.f25523a = savingsTransactionsInteractor;
        this.f25524b = transactionsWidgetUiModel;
        this.f25525c = jointAccountInteractor;
    }

    public final n a(i7 transactionsFilter, List list, AccountId accountId, ProductAccountId productAccountId) {
        Set setB = y0.b(qsi.c.NoSpareChange);
        Intrinsics.checkNotNullParameter(transactionsFilter, "transactionsFilter");
        Intrinsics.checkNotNullParameter(productAccountId, "productAccountId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new n(transactionsFilter, null, null, list, new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.money_boxes_details_all_cash_movements, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByAccounts(new ProductAccountDescriptor$Value.Main(productAccountId, ProductId.SAVINGS), (TransactionContext) null), (String) null, accountId, (h) null, g.VAULT_DETAILS, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65198)), null, null, null, setB, 742);
    }
}
