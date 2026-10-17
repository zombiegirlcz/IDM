package xqj;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.revolut.feature.crypto_investments.impl.data.database.CryptoInvestmentsDatabase;
import com.revolut.feature.shops.impl.db.ShopsDatabase;
import com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase;
import com.revolut.retail.feature.impl.budgeting.database.BudgetingDatabase;
import com.revolut.retail.feature.stockdetails.impl.data.database.StockDetailsDatabase;
import com.revolut.retail.feature.trading_onboarding.impl.data.database.TradingOnboardingDatabase;
import com.revolut.shared.feature.payments.money_request.domain.impl.data.database.MoneyRequestDatabase;
import kotlin.jvm.internal.Intrinsics;
import od0.e;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308180a = 6;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f308181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RoomDatabase f308182c;

    public a(Context context, ShopsDatabase shopsDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(shopsDatabase, "shopsDatabase");
        this.f308181b = context;
        this.f308182c = shopsDatabase;
    }

    @Override // od0.e
    public final void clear() {
        switch (this.f308180a) {
            case 0:
                ce0.a.a(this.f308181b, "budgeting_db", (BudgetingDatabase) this.f308182c);
                break;
            case 1:
                ce0.a.a(this.f308181b, "revolut_trading_onboarding_db", (TradingOnboardingDatabase) this.f308182c);
                break;
            case 2:
                ce0.a.a(this.f308181b, "travel_hotels_db", (TravelHotelsDatabase) this.f308182c);
                break;
            case 3:
                ce0.a.a(this.f308181b, "payments_money_request_db", (MoneyRequestDatabase) this.f308182c);
                break;
            case 4:
                ce0.a.a(this.f308181b, "shops_db", (ShopsDatabase) this.f308182c);
                break;
            case 5:
                ce0.a.a(this.f308181b, "stockdetails_database", (StockDetailsDatabase) this.f308182c);
                break;
            default:
                ce0.a.a(this.f308181b, "crypto_investments_database", (CryptoInvestmentsDatabase) this.f308182c);
                break;
        }
    }

    public a(Context context, BudgetingDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f308181b = context;
        this.f308182c = database;
    }

    public a(Context context, CryptoInvestmentsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f308181b = context;
        this.f308182c = database;
    }

    public a(Context context, MoneyRequestDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f308181b = context;
        this.f308182c = database;
    }

    public a(Context context, StockDetailsDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f308181b = context;
        this.f308182c = database;
    }

    public a(Context context, TradingOnboardingDatabase database) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f308181b = context;
        this.f308182c = database;
    }

    public a(Context context, TravelHotelsDatabase travelHotelsDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(travelHotelsDatabase, "travelHotelsDatabase");
        this.f308181b = context;
        this.f308182c = travelHotelsDatabase;
    }
}
