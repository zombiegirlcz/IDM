package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class i2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i2 f202427c = new i2();

    private i2() {
        super(39, 40);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `portfolio_trades` (\n    `trade_id` TEXT NOT NULL,\n    `portfolio_id` TEXT NOT NULL,\n    `holding_id` TEXT NOT NULL,\n    `state` TEXT NOT NULL,\n    `completed_at` INTEGER,\n    `created_at` INTEGER NOT NULL,\n    `stock_trade` TEXT,\n    `cash_trade` TEXT,\n    `dividend_trade` TEXT,\n    `custody_fees` TEXT,\n    `value` TEXT NOT NULL,\n    `settlementDate` INTEGER,\n    `slip_transaction` INTEGER NOT NULL,\n    PRIMARY KEY(`trade_id`)\n)", "CREATE  INDEX `index_portfolio_trades_portfolio_id` ON `portfolio_trades` (`portfolio_id`)");
    }
}
