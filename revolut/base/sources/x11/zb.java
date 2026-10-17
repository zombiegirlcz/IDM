package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class zb extends Migration {
    public zb() {
        super(61, 62);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE `trades`", "CREATE TABLE IF NOT EXISTS `trades` (`trade_id` TEXT NOT NULL, `holding_id` TEXT NOT NULL, `state` TEXT NOT NULL, `started_at` INTEGER, `completed_at` INTEGER, `created_at` INTEGER NOT NULL, `stock_trade` TEXT, `cash_trade` TEXT, `dividend_trade` TEXT, `custody_fees` TEXT, `value` TEXT NOT NULL, PRIMARY KEY(`trade_id`))", "CREATE INDEX `index_trades_holding_id` ON `trades` (`holding_id`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX `index_trades_holding_id_created_at` ON `trades` (`holding_id`, `created_at`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX `index_trades_created_at` ON `trades` (`created_at`)");
    }
}
