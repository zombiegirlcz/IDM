package ahl;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.revolut.feature.account_switching.impl.data.storage.AccountSwitchingDatabase;
import com.revolut.feature.apm.multibanco.impl.data.database.MultibancoDatabase;
import com.revolut.feature.credit.loan.impl.database.LoanDatabase;
import com.revolut.feature.credit.post_termination_plan.impl.database.PostTerminationPlanDatabase;
import com.revolut.feature.defi.accounts.impl.data.DeFiAccountsDatabase;
import com.revolut.feature.defi.currency.impl.data.database.DeFiCurrencyDatabase;
import com.revolut.feature.donations.impl.database.DonationsDatabase;
import com.revolut.feature.freelancer.impl.database.FreelancerDatabase;
import com.revolut.feature.invest.smart_notifications.impl.data.database.SmartNotificationsDatabase;
import com.revolut.feature.learn.shared.impl.data.database.LearnDatabase;
import com.revolut.feature.pay_later.impl.database.PayLaterDatabase;
import com.revolut.feature.payments.messaging.data.impl.data.database.SocialPaymentsDatabase;
import com.revolut.feature.payments.recents.impl.data.PaymentsRecentDatabase;
import com.revolut.feature.payments.recipients.settings.impl.data.db.RecipientSettingsDatabase;
import com.revolut.feature.payments.splitbill.impl.data.recurringsplit.database.RecurringSplitDatabase;
import com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase;
import com.revolut.feature.shared.airtip.impl.data.database.AirTipDatabase;
import com.revolut.feature.tab.accounts.impl.data.AccountsDatabase;
import com.revolut.feature.trade_rev_points.impl.database.TradeRevPointsDatabase;
import com.revolut.feature.trading.impl.data.database.TradingDatabase;
import com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import com.revolut.feature.wealth.impl.data.database.WealthDatabase;
import com.revolut.retail.feature.crypto_deposits.impl.database.CryptoDepositsDatabase;
import com.revolut.retail.feature.ratedetails.impl.database.RatesRoomDatabase;
import com.revolut.shared.feature.rates.impl.database.SharedRatesRoomDatabase;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.CorporateEventsDatabase;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.WealthDiscoveryDomainDatabase;
import com.revolut.trading.orders.data.db.OrdersDatabase;
import kotlin.jvm.internal.Intrinsics;
import od0.e;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5130a = 29;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RoomDatabase f5132c;

    public a(Context context, SmartNotificationsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    @Override // od0.e
    public final void clear() {
        switch (this.f5130a) {
            case 0:
                ce0.a.a(this.f5131b, "corporate_events_db", (CorporateEventsDatabase) this.f5132c);
                break;
            case 1:
                ce0.a.a(this.f5131b, "shared_wealth_discovery_domain_database", (WealthDiscoveryDomainDatabase) this.f5132c);
                break;
            case 2:
                ce0.a.a(this.f5131b, "smart_notifications_db", (SmartNotificationsDatabase) this.f5132c);
                break;
            case 3:
                ce0.a.a(this.f5131b, "payments_recurring_split_db", (RecurringSplitDatabase) this.f5132c);
                break;
            case 4:
                ce0.a.a(this.f5131b, "temp_apm_multibanco_db", (MultibancoDatabase) this.f5132c);
                break;
            case 5:
                ce0.a.a(this.f5131b, "shared_wealth_domain_database", (WealthDomainDatabase) this.f5132c);
                break;
            case 6:
                ce0.a.a(this.f5131b, "recipient_settings_db", (RecipientSettingsDatabase) this.f5132c);
                break;
            case 7:
                ce0.a.a(this.f5131b, "accounts_db", (AccountsDatabase) this.f5132c);
                break;
            case 8:
                ce0.a.a(this.f5131b, "wealth_database", (WealthDatabase) this.f5132c);
                break;
            case 9:
                ce0.a.a(this.f5131b, "pay_later_db", (PayLaterDatabase) this.f5132c);
                break;
            case 10:
                ce0.a.a(this.f5131b, "shared_rates_database", (SharedRatesRoomDatabase) this.f5132c);
                break;
            case 11:
                ce0.a.a(this.f5131b, "rates_database", (RatesRoomDatabase) this.f5132c);
                break;
            case 12:
                ce0.a.a(this.f5131b, "payments_social_db", (SocialPaymentsDatabase) this.f5132c);
                break;
            case 13:
                ce0.a.a(this.f5131b, "learn_db", (LearnDatabase) this.f5132c);
                break;
            case 14:
                ce0.a.a(this.f5131b, "defi_accounts_db", (DeFiAccountsDatabase) this.f5132c);
                break;
            case 15:
                ce0.a.a(this.f5131b, "defi_currency_db", (DeFiCurrencyDatabase) this.f5132c);
                break;
            case 16:
                ce0.a.a(this.f5131b, "shared_air_tip_db", (AirTipDatabase) this.f5132c);
                break;
            case 17:
                ce0.a.a(this.f5131b, "donations_db", (DonationsDatabase) this.f5132c);
                break;
            case 18:
                ce0.a.a(this.f5131b, "trading_database", (TradingDatabase) this.f5132c);
                break;
            case 19:
                ce0.a.a(this.f5131b, "orders_database", (OrdersDatabase) this.f5132c);
                break;
            case 20:
                ce0.a.a(this.f5131b, "freelancer_db", (FreelancerDatabase) this.f5132c);
                break;
            case 21:
                ce0.a.a(this.f5131b, "payments_recent_db", (PaymentsRecentDatabase) this.f5132c);
                break;
            case 22:
                ce0.a.a(this.f5131b, "separate_favourites_item_db", (SeparateFavouritesItemDatabase) this.f5132c);
                break;
            case 23:
                ce0.a.a(this.f5131b, "credit_post_termination_plan_db", (PostTerminationPlanDatabase) this.f5132c);
                break;
            case 24:
                ce0.a.a(this.f5131b, "trade_rev_points_db", (TradeRevPointsDatabase) this.f5132c);
                break;
            case 25:
                ce0.a.a(this.f5131b, "crypto_deposits_db", (CryptoDepositsDatabase) this.f5132c);
                break;
            case 26:
                ce0.a.a(this.f5131b, "transactions_db", (TransactionsDatabase) this.f5132c);
                break;
            case 27:
                ce0.a.a(this.f5131b, "wealth_analytics_db", (WealthAnalyticsDatabase) this.f5132c);
                break;
            case 28:
                ce0.a.a(this.f5131b, "loan_db", (LoanDatabase) this.f5132c);
                break;
            default:
                ce0.a.a(this.f5131b, "retail_pae_account_switching_db", (AccountSwitchingDatabase) this.f5132c);
                break;
        }
    }

    public a(Context context, DeFiAccountsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, DeFiCurrencyDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, MultibancoDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, SharedRatesRoomDatabase ratesDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ratesDatabase, "ratesDatabase");
        this.f5131b = context;
        this.f5132c = ratesDatabase;
    }

    public a(Context context, WealthDiscoveryDomainDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, PostTerminationPlanDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, TradeRevPointsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, CryptoDepositsDatabase cryptoDepositsDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cryptoDepositsDatabase, "cryptoDepositsDatabase");
        this.f5131b = context;
        this.f5132c = cryptoDepositsDatabase;
    }

    public a(Context context, AirTipDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, AccountsDatabase paymentsRecentDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentsRecentDatabase, "paymentsRecentDatabase");
        this.f5131b = context;
        this.f5132c = paymentsRecentDatabase;
    }

    public a(Context context, PaymentsRecentDatabase paymentsRecentDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentsRecentDatabase, "paymentsRecentDatabase");
        this.f5131b = context;
        this.f5132c = paymentsRecentDatabase;
    }

    public a(Context context, RecurringSplitDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, WealthDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, DonationsDatabase donationsDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(donationsDatabase, "donationsDatabase");
        this.f5131b = context;
        this.f5132c = donationsDatabase;
    }

    public a(Context context, SocialPaymentsDatabase socialPaymentsDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(socialPaymentsDatabase, "socialPaymentsDatabase");
        this.f5131b = context;
        this.f5132c = socialPaymentsDatabase;
    }

    public a(Context context, RecipientSettingsDatabase recipientSettingsDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recipientSettingsDatabase, "recipientSettingsDatabase");
        this.f5131b = context;
        this.f5132c = recipientSettingsDatabase;
    }

    public a(Context context, CorporateEventsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, SeparateFavouritesItemDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, FreelancerDatabase freelancerDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(freelancerDatabase, "freelancerDatabase");
        this.f5131b = context;
        this.f5132c = freelancerDatabase;
    }

    public a(Context context, RatesRoomDatabase ratesDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ratesDatabase, "ratesDatabase");
        this.f5131b = context;
        this.f5132c = ratesDatabase;
    }

    public a(Context context, AccountSwitchingDatabase accountSwitchingDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(accountSwitchingDatabase, "accountSwitchingDatabase");
        this.f5131b = context;
        this.f5132c = accountSwitchingDatabase;
    }

    public a(Context context, LearnDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, OrdersDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, PayLaterDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, LoanDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, TransactionsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, WealthDomainDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, WealthAnalyticsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }

    public a(Context context, TradingDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5131b = context;
        this.f5132c = database;
    }
}
