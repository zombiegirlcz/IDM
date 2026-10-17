package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class m5 extends Migration {
    public m5() {
        super(23, 24);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `trades`", "CREATE TABLE IF NOT EXISTS `trades` (`trade_id` TEXT NOT NULL, `holding_id` TEXT NOT NULL, `state` TEXT NOT NULL, `side` TEXT NOT NULL, `started_at` INTEGER NOT NULL, `stock_trade` TEXT, `cash_trade` TEXT, `robo_trade` TEXT, PRIMARY KEY(`trade_id`), FOREIGN KEY(`holding_id`) REFERENCES `holdings`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE  INDEX `index_trades_holding_id` ON `trades` (`holding_id`)");
    }
}
