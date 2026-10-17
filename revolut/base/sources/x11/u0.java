package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends Migration {
    public u0() {
        super(13, 14);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `price_alert`", "CREATE TABLE IF NOT EXISTS `price_alert` (`id` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `currencyFrom` TEXT NOT NULL, `currencyTo` TEXT NOT NULL, `rate` REAL NOT NULL, `trigger` TEXT NOT NULL, `state` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `alertedDate` INTEGER NOT NULL, PRIMARY KEY(`id`))", "DROP TABLE IF EXISTS `auto_exchange`");
        prk.o.D(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `auto_exchange` (`id` TEXT NOT NULL, `side` TEXT NOT NULL, `state` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, `transactionId` TEXT, `value` REAL NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE `portfolios` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `balance` TEXT, `kyc` TEXT NOT NULL, `info` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE `holdings` (`id` TEXT NOT NULL, `creation_date` INTEGER, `holding_state` TEXT NOT NULL, `account_type` TEXT NOT NULL, `name` TEXT NOT NULL, `currency` TEXT NOT NULL, `amount` TEXT, `risk_level` INTEGER, `assets` TEXT, PRIMARY KEY(`id`))", "CREATE TABLE `trades` (`trade_id` TEXT NOT NULL, `holding_id` TEXT NOT NULL, `state` TEXT NOT NULL, `side` TEXT NOT NULL, `started_at` INTEGER NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`trade_id`), FOREIGN KEY(`holding_id`) REFERENCES `holdings`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        supportSQLiteDatabase.execSQL("CREATE TABLE `portfolio_performance_points` (`portfolio_id` TEXT NOT NULL, `currency` TEXT NOT NULL, `period` TEXT NOT NULL, `date` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `ppm` INTEGER NOT NULL, `profit` INTEGER NOT NULL, PRIMARY KEY(`portfolio_id`, `currency`, `period`, `date`), FOREIGN KEY(`portfolio_id`) REFERENCES `portfolios`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        supportSQLiteDatabase.execSQL("CREATE TABLE `holding_performance_points` (`holding_id` TEXT NOT NULL, `period` TEXT NOT NULL, `date` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `ppm` INTEGER NOT NULL, `profit` INTEGER NOT NULL, PRIMARY KEY(`holding_id`, `period`, `date`), FOREIGN KEY(`holding_id`) REFERENCES `holdings`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
    }
}
