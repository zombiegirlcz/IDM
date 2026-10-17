package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class jb extends Migration {
    public jb() {
        super(54, 55);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `trades`", "CREATE TABLE IF NOT EXISTS `trades` (`trade_id` TEXT NOT NULL, `holding_id` TEXT NOT NULL, `state` TEXT NOT NULL, `started_at` INTEGER, `completed_at` INTEGER, `created_at` INTEGER NOT NULL, `stock_trade` TEXT, `cash_trade` TEXT, `dividend_trade` TEXT, `value` TEXT NOT NULL, PRIMARY KEY(`trade_id`), FOREIGN KEY(`holding_id`) REFERENCES `holdings`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE  INDEX `index_trades_holding_id` ON `trades` (`holding_id`)");
    }
}
