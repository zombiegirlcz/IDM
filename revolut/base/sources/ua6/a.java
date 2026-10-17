package ua6;

import b93.e;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.vaults.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Collection;
import java.util.Set;
import k71.i;
import kotlin.jvm.internal.Intrinsics;
import rhf.g;
import rhf.h;
import ta6.b;
import tof.q6;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final FeatureCommand a(i transactionDescriptor) {
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        return new FeatureCommand(new TransactionsFeatureConfig.Details(transactionDescriptor, null, null, null, 122));
    }

    public final FeatureCommand b(Collection charities) {
        Intrinsics.checkNotNullParameter(charities, "charities");
        return u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.money_boxes_details_all_cash_movements, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(b.a(charities, null), null, null, 6), (String) null, (AccountId) null, (h) null, g.CHARITY_DETAILS, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65262)));
    }

    public final FeatureCommand c(b93.b cardCode) {
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        return new FeatureCommand(new CardDesignFeatureConfig(e.PHYSICAL, null, null, cardCode, null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 536862702));
    }
}
