package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class j2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j2 f202433c = new j2();

    private j2() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `trading_trades` (`trade_id` TEXT NOT NULL, `holding_id` TEXT NOT NULL, `state` TEXT NOT NULL, `completed_at` INTEGER, `created_at` INTEGER NOT NULL, `stock_trade` TEXT, `cash_trade` TEXT, `dividend_trade` TEXT, `custody_fees` TEXT, `value` TEXT NOT NULL, PRIMARY KEY(`trade_id`))", "CREATE  INDEX `index_trading_trades_holding_id_created_at` ON `trading_trades` (`holding_id`, `created_at`)", "CREATE  INDEX `index_trading_trades_created_at` ON `trading_trades` (`created_at`)");
        supportSQLiteDatabase.execSQL("CREATE  INDEX `index_trading_trades_holding_id` ON `trading_trades` (`holding_id`)");
    }
}
