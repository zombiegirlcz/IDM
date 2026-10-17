package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f225088c = new k();

    private k() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE rewards_transactions;", "\n            CREATE TABLE IF NOT EXISTS `rewards_transactions` (\n                `id` TEXT NOT NULL, \n                `merchant` TEXT NOT NULL, \n                `description` TEXT NOT NULL, \n                `cashback_state` TEXT NOT NULL, \n                `original_transaction_id` TEXT NOT NULL,\n                `cashback_transaction_id` TEXT,\n                `value_amount` INTEGER NOT NULL, \n                `value_currency` TEXT NOT NULL, \n                `cashback_dates_created_date` INTEGER NOT NULL, \n                `cashback_dates_updated_date` INTEGER NOT NULL, \n                `cashback_dates_confirmed_date` INTEGER, \n                `cashback_dates_paid_date` INTEGER, \n                PRIMARY KEY(`id`)\n            )\n        ", "\n                CREATE INDEX IF NOT EXISTS `index_rewards_transactions_cashback_dates_updated_date` \n                ON `rewards_transactions` (`cashback_dates_updated_date`)\n            ");
        supportSQLiteDatabase.execSQL("\n                CREATE INDEX IF NOT EXISTS `index_rewards_transactions_cashback_state` \n                ON `rewards_transactions` (`cashback_state`)\n            ");
    }
}
