package mfg;

import android.content.Context;
import com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase;
import com.revolut.feature.banners.impl.data.database.BannersDatabase;
import com.revolut.feature.cards_core.impl.data.db.CardsDatabase;
import com.revolut.feature.contacts.impl.data.database.ContactsDatabase;
import com.revolut.feature.crypto.withdraw.impl.database.CryptoWithdrawDatabase;
import com.revolut.feature.defi.rates.impl.data.DeFiRatesDatabase;
import com.revolut.feature.freelancer.impl.database.tax_pockets.FreelancerTaxPocketsDatabase;
import com.revolut.feature.global_markets.impl.data.database.GlobalMarketsDatabase;
import com.revolut.feature.junior_transfer_request.impl.db.JuniorTransferRequestDatabase;
import com.revolut.feature.lifestyle.core.impl.database.LifestyleCoreDatabase;
import com.revolut.feature.payments.groups.impl.data.database.PaymentsGroupsDatabase;
import com.revolut.feature.push_to_card.impl.storage.database.PushToCardDatabase;
import com.revolut.feature.referrals.promo.impl.invitation.data.db.model.ReferralsInvitationDatabase;
import com.revolut.feature.rev_points.impl.data.storage.database.RevPointsDatabase;
import com.revolut.feature.rewards.impl.data.database.RewardsDatabase;
import com.revolut.feature.shared.vaults.domain.impl.data.database.TransactionsExtraDatabase;
import com.revolut.feature.shared.vaults.domain.impl.data.database.VaultsDatabase;
import com.revolut.feature.slot_manager.impl.database.SlotManagerDatabase;
import com.revolut.feature.stock_lending.impl.database.StockLendingDatabase;
import com.revolut.feature.trading.transfer.investments.impl.data.database.TransferInvestmentsDatabase;
import com.revolut.feature.transport.impl.data.database.TransportDatabase;
import com.revolut.feature.travel.common.impl.database.TravelDatabase;
import com.revolut.feature.travel.experiences.impl.database.TravelExperiencesDatabase;
import com.revolut.feature.travel.miles.impl.database.TravelMilesDatabase;
import com.revolut.feature.wealth.account_closure.impl.data.database.WealthAccountClosureDatabase;
import com.revolut.feature.wealth.analytics.insights.repository.database.PortfolioInsightsDatabase;
import com.revolut.retail.feature.impl.AnalyticsDatabase;
import com.revolut.retail.feature.impl.budget.database.BudgetHistoryDatabase;
import com.revolut.retail.feature.pricing_plans.impl.database.PricingPlansDatabase;
import kotlin.jvm.internal.Intrinsics;
import od0.e;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204994a = 18;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f204995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f204996c;

    public a(Context context, ReferralsInvitationDatabase cryptoDepositsDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cryptoDepositsDatabase, "cryptoDepositsDatabase");
        this.f204995b = context;
        this.f204996c = cryptoDepositsDatabase;
    }

    @Override // od0.e
    public final void clear() {
        switch (this.f204994a) {
            case 0:
                ce0.a.a((Context) this.f204995b, "travel_miles_db", (TravelMilesDatabase) this.f204996c);
                break;
            case 1:
                ce0.a.a((Context) this.f204995b, "rewards_db", (RewardsDatabase) this.f204996c);
                break;
            case 2:
                ce0.a.a((Context) this.f204995b, "contacts_db", (ContactsDatabase) this.f204996c);
                break;
            case 3:
                ce0.a.a((Context) this.f204995b, "banners_db", (BannersDatabase) this.f204996c);
                break;
            case 4:
                ce0.a.a((Context) this.f204995b, "freelancer_tax_pockets_db", (FreelancerTaxPocketsDatabase) this.f204996c);
                break;
            case 5:
                ce0.a.a((Context) this.f204995b, "global_markets_db", (GlobalMarketsDatabase) this.f204996c);
                break;
            case 6:
                ce0.a.a((Context) this.f204995b, "junior_transfer_request_database", (JuniorTransferRequestDatabase) this.f204996c);
                break;
            case 7:
                ce0.a.a((Context) this.f204995b, "slot_manager_db", (SlotManagerDatabase) this.f204996c);
                break;
            case 8:
                ce0.a.a((Context) this.f204995b, "lifestyle_core_db", (LifestyleCoreDatabase) this.f204996c);
                break;
            case 9:
                ((ww0.b) this.f204995b).d(h01.a.INACTIVE);
                ((fqi.b) this.f204996c).f137264a.edit().clear().apply();
                break;
            case 10:
                ce0.a.a((Context) this.f204995b, "wealth_account_closure", (WealthAccountClosureDatabase) this.f204996c);
                break;
            case 11:
                ce0.a.a((Context) this.f204995b, "crypto_withdraw_db", (CryptoWithdrawDatabase) this.f204996c);
                break;
            case 12:
                ce0.a.a((Context) this.f204995b, "analytics_db", (AnalyticsDatabase) this.f204996c);
                break;
            case 13:
                ce0.a.a((Context) this.f204995b, "push_to_card_db", (PushToCardDatabase) this.f204996c);
                break;
            case 14:
                ce0.a.a((Context) this.f204995b, "travel_experiences_db", (TravelExperiencesDatabase) this.f204996c);
                break;
            case 15:
                ce0.a.a((Context) this.f204995b, "moneybox_transactions_db", (TransactionsExtraDatabase) this.f204996c);
                break;
            case 16:
                ce0.a.a((Context) this.f204995b, "vaults_db", (VaultsDatabase) this.f204996c);
                break;
            case 17:
                ce0.a.a((Context) this.f204995b, "budget_history_db", (BudgetHistoryDatabase) this.f204996c);
                break;
            case 18:
                ce0.a.a((Context) this.f204995b, "apm_contacts_db", (ApmContactsDatabase) this.f204996c);
                break;
            case 19:
                ce0.a.a((Context) this.f204995b, "referrals_invite_db", (ReferralsInvitationDatabase) this.f204996c);
                break;
            case 20:
                ce0.a.a((Context) this.f204995b, "rev_points_db", (RevPointsDatabase) this.f204996c);
                break;
            case 21:
                ce0.a.a((Context) this.f204995b, "cards_database", (CardsDatabase) this.f204996c);
                break;
            case 22:
                ce0.a.a((Context) this.f204995b, "transport_db", (TransportDatabase) this.f204996c);
                break;
            case 23:
                ce0.a.a((Context) this.f204995b, "portfolio_insights_db", (PortfolioInsightsDatabase) this.f204996c);
                break;
            case 24:
                ce0.a.a((Context) this.f204995b, "defi_rates_db", (DeFiRatesDatabase) this.f204996c);
                break;
            case 25:
                ce0.a.a((Context) this.f204995b, "travel_common_db", (TravelDatabase) this.f204996c);
                break;
            case 26:
                ce0.a.a((Context) this.f204995b, "stock_lending_db", (StockLendingDatabase) this.f204996c);
                break;
            case 27:
                ce0.a.a((Context) this.f204995b, "revolut_transfer_investments_db", (TransferInvestmentsDatabase) this.f204996c);
                break;
            case 28:
                ce0.a.a((Context) this.f204995b, "payments_groups_db", (PaymentsGroupsDatabase) this.f204996c);
                break;
            default:
                ce0.a.a((Context) this.f204995b, "pricing_plans_db", (PricingPlansDatabase) this.f204996c);
                break;
        }
    }

    public a(ww0.b sensitiveDataManager, fqi.b uiDataStorage) {
        Intrinsics.checkNotNullParameter(sensitiveDataManager, "sensitiveDataManager");
        Intrinsics.checkNotNullParameter(uiDataStorage, "uiDataStorage");
        this.f204995b = sensitiveDataManager;
        this.f204996c = uiDataStorage;
    }

    public a(Context context, CardsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, PricingPlansDatabase pricingPlansDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pricingPlansDatabase, "pricingPlansDatabase");
        this.f204995b = context;
        this.f204996c = pricingPlansDatabase;
    }

    public a(Context context, DeFiRatesDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, TransactionsExtraDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, StockLendingDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, WealthAccountClosureDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, RewardsDatabase rewardsDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rewardsDatabase, "rewardsDatabase");
        this.f204995b = context;
        this.f204996c = rewardsDatabase;
    }

    public a(Context context, TransferInvestmentsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, BannersDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, GlobalMarketsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, LifestyleCoreDatabase lifestyleCoreDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifestyleCoreDatabase, "lifestyleCoreDatabase");
        this.f204995b = context;
        this.f204996c = lifestyleCoreDatabase;
    }

    public a(Context context, PushToCardDatabase pushToCardDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushToCardDatabase, "pushToCardDatabase");
        this.f204995b = context;
        this.f204996c = pushToCardDatabase;
    }

    public a(Context context, TransportDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, JuniorTransferRequestDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, SlotManagerDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, TravelDatabase travelDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(travelDatabase, "travelDatabase");
        this.f204995b = context;
        this.f204996c = travelDatabase;
    }

    public a(Context context, FreelancerTaxPocketsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, BudgetHistoryDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, ContactsDatabase contactsDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contactsDatabase, "contactsDatabase");
        this.f204995b = context;
        this.f204996c = contactsDatabase;
    }

    public a(Context context, CryptoWithdrawDatabase cryptoWithdrawDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cryptoWithdrawDatabase, "cryptoWithdrawDatabase");
        this.f204995b = context;
        this.f204996c = cryptoWithdrawDatabase;
    }

    public a(Context context, PortfolioInsightsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, TravelExperiencesDatabase travelExperiencesDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(travelExperiencesDatabase, "travelExperiencesDatabase");
        this.f204995b = context;
        this.f204996c = travelExperiencesDatabase;
    }

    public a(Context context, RevPointsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, TravelMilesDatabase travelMilesDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(travelMilesDatabase, "travelMilesDatabase");
        this.f204995b = context;
        this.f204996c = travelMilesDatabase;
    }

    public a(Context context, VaultsDatabase vaultsDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vaultsDatabase, "vaultsDatabase");
        this.f204995b = context;
        this.f204996c = vaultsDatabase;
    }

    public a(Context context, ApmContactsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f204995b = context;
        this.f204996c = database;
    }

    public a(Context context, AnalyticsDatabase analyticsDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsDatabase, "analyticsDatabase");
        this.f204995b = context;
        this.f204996c = analyticsDatabase;
    }

    public a(Context context, PaymentsGroupsDatabase paymentsGroupsDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentsGroupsDatabase, "paymentsGroupsDatabase");
        this.f204995b = context;
        this.f204996c = paymentsGroupsDatabase;
    }
}
