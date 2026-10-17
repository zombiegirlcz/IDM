package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class d9 extends Migration {
    public d9() {
        super(32, 33);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `portfolios`", "DROP TABLE IF EXISTS `holdings`", "DROP TABLE IF EXISTS `trades`");
        prk.o.D(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `portfolios` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `asset_types` TEXT NOT NULL, `balance` TEXT, `kyc` TEXT NOT NULL, `info` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `holdings` (`id` TEXT NOT NULL, `creation_date` INTEGER, `holding_state` TEXT NOT NULL, `name` TEXT NOT NULL, `currency` TEXT NOT NULL, `cash_holding` TEXT, `stock_holding` TEXT, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `trades` (`trade_id` TEXT NOT NULL, `holding_id` TEXT NOT NULL, `state` TEXT NOT NULL, `side` TEXT NOT NULL, `started_at` INTEGER NOT NULL, `stock_trade` TEXT, `cash_trade` TEXT, PRIMARY KEY(`trade_id`), FOREIGN KEY(`holding_id`) REFERENCES `holdings`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE  INDEX `index_trades_holding_id` ON `trades` (`holding_id`)");
        prk.o.D(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `robo_holdings` (`id` TEXT NOT NULL, `creation_date` INTEGER, `holding_state` TEXT NOT NULL, `account_type` TEXT NOT NULL, `name` TEXT NOT NULL, `currency` TEXT NOT NULL, `amount` TEXT, `risk_level` INTEGER, `assets` TEXT, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `robo_portfolios` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `balance` TEXT, `kyc` TEXT NOT NULL, `info` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `robo_portfolio_performance_points` (`portfolio_id` TEXT NOT NULL, `currency` TEXT NOT NULL, `period` TEXT NOT NULL, `date` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `ppm` INTEGER NOT NULL, `profit` INTEGER NOT NULL, PRIMARY KEY(`portfolio_id`, `currency`, `period`, `date`), FOREIGN KEY(`portfolio_id`) REFERENCES `robo_portfolios`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `robo_trades` (`trade_id` TEXT NOT NULL, `holding_id` TEXT NOT NULL, `state` TEXT NOT NULL, `side` TEXT NOT NULL, `started_at` INTEGER NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`trade_id`), FOREIGN KEY(`holding_id`) REFERENCES `robo_holdings`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `robo_holding_performance_points` (`holding_id` TEXT NOT NULL, `period` TEXT NOT NULL, `date` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `ppm` INTEGER NOT NULL, `profit` INTEGER NOT NULL, PRIMARY KEY(`holding_id`, `period`, `date`), FOREIGN KEY(`holding_id`) REFERENCES `robo_holdings`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
    }
}
