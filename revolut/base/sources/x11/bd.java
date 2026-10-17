package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class bd extends Migration {
    public bd() {
        super(74, 75);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `trading_orders` (`id` TEXT NOT NULL, `symbol` TEXT NOT NULL, `state` TEXT NOT NULL, `value` TEXT NOT NULL, `declineReason` TEXT, `createdAt` INTEGER NOT NULL, `completedAt` INTEGER, `side` TEXT NOT NULL, `estimatedPrice` TEXT, `executedPrice` TEXT, `estimatedQuantity` TEXT, `executedQuantity` TEXT, `estimatedTotal` TEXT, `gross` TEXT, `net` TEXT, `orderType` TEXT NOT NULL, `externalId` TEXT, `fees` TEXT NOT NULL, `commission` TEXT, PRIMARY KEY(`id`))", "CREATE  INDEX `index_trading_orders_symbol` ON `trading_orders` (`symbol`)", "CREATE TABLE IF NOT EXISTS `trading_trades` (`trade_id` TEXT NOT NULL, `holding_id` TEXT NOT NULL, `state` TEXT NOT NULL, `completed_at` INTEGER, `created_at` INTEGER NOT NULL, `stock_trade` TEXT, `cash_trade` TEXT, `dividend_trade` TEXT, `custody_fees` TEXT, `value` TEXT NOT NULL, PRIMARY KEY(`trade_id`))");
        prk.o.D(supportSQLiteDatabase, "CREATE  INDEX `index_trading_trades_holding_id_created_at` ON `trading_trades` (`holding_id`, `created_at`)", "CREATE  INDEX `index_trading_trades_created_at` ON `trading_trades` (`created_at`)", "CREATE  INDEX `index_trading_trades_holding_id` ON `trading_trades` (`holding_id`)", "INSERT INTO `trading_trades` (trade_id, holding_id, state, completed_at, created_at, stock_trade, cash_trade, dividend_trade, custody_fees, value) SELECT trade_id, holding_id, state, completed_at, created_at, stock_trade, cash_trade, dividend_trade, custody_fees, value FROM `trades`");
        supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `trades`");
    }
}
