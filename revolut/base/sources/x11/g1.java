package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends Migration {
    public g1() {
        super(14, 15);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `portfolios` ADD COLUMN `asset_types` TEXT NOT NULL DEFAULT '[]'", "CREATE  INDEX `index_trades_holding_id` ON `trades` (`holding_id`)", "DROP TABLE IF EXISTS `holdings`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `holdings` (`id` TEXT NOT NULL, `creation_date` INTEGER, `holding_state` TEXT NOT NULL, `account_type` TEXT NOT NULL, `name` TEXT NOT NULL, `currency` TEXT NOT NULL, `auto_investment_holding` TEXT, `cash_holding` TEXT, PRIMARY KEY(`id`))");
    }
}
