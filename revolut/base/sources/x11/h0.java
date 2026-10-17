package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f301865c = new h0();

    private h0() {
        super(129, 130);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "\n            CREATE TABLE IF NOT EXISTS `rewards_transactions` (\n                `id` TEXT NOT NULL, \n                `merchant` TEXT NOT NULL, \n                `description` TEXT NOT NULL, \n                `cashback_state` TEXT NOT NULL, \n                `original_transaction_id` TEXT NOT NULL, \n                `original_transaction_wallet_id` TEXT NOT NULL, \n                `cashback_transaction_id` TEXT, \n                `cashback_transaction_wallet_id` TEXT, \n                `value_amount` INTEGER NOT NULL, \n                `value_currency` TEXT NOT NULL, \n                `cashback_dates_created_date` INTEGER NOT NULL, \n                `cashback_dates_updated_date` INTEGER NOT NULL, \n                `cashback_dates_confirmed_date` INTEGER, \n                `cashback_dates_paid_date` INTEGER, \n                PRIMARY KEY(`id`)\n            )\n        ", "\n                CREATE INDEX IF NOT EXISTS `index_rewards_transactions_cashback_dates_updated_date` \n                ON `rewards_transactions` (`cashback_dates_updated_date`)\n            ", "\n                CREATE INDEX IF NOT EXISTS `index_rewards_transactions_cashback_state` \n                ON `rewards_transactions` (`cashback_state`)\n            ");
    }
}
