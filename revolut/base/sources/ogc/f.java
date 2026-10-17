package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f225083c = new f();

    private f() {
        super(15, 16);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "\n            CREATE TABLE IF NOT EXISTS `rewards_transactions_tmp` (\n                `id` TEXT NOT NULL, \n                `merchant` TEXT NOT NULL, \n                `description` TEXT NOT NULL, \n                `cashback_state` TEXT NOT NULL,\n                `cashback_transaction_id` TEXT,\n                `value_amount` INTEGER NOT NULL, \n                `value_currency` TEXT NOT NULL, \n                `cashback_dates_created_date` INTEGER NOT NULL, \n                `cashback_dates_updated_date` INTEGER NOT NULL, \n                `cashback_dates_confirmed_date` INTEGER, \n                `cashback_dates_paid_date` INTEGER, \n                PRIMARY KEY(`id`)\n            )\n        ", "\n               INSERT INTO `rewards_transactions_tmp` (id, merchant, description, cashback_state, `cashback_transaction_id`, `value_amount`, `value_currency`, `cashback_dates_created_date`, `cashback_dates_updated_date`, `cashback_dates_confirmed_date`, `cashback_dates_paid_date`) SELECT id, merchant, description, cashback_state, `cashback_transaction_id`, `value_amount`, `value_currency`, `cashback_dates_created_date`, `cashback_dates_updated_date`, `cashback_dates_confirmed_date`, `cashback_dates_paid_date` FROM `rewards_transactions`  \n            ", "DROP TABLE `rewards_transactions`");
        prk.o.C(supportSQLiteDatabase, "ALTER TABLE `rewards_transactions_tmp` RENAME TO `rewards_transactions`", "CREATE INDEX IF NOT EXISTS `index_rewards_transactions_cashback_dates_updated_date` ON `rewards_transactions` (`cashback_dates_updated_date`)", "CREATE INDEX IF NOT EXISTS `index_rewards_transactions_cashback_state` ON `rewards_transactions` (`cashback_state`)");
    }
}
