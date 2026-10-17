package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class be extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final be f301801c = new be();

    private be() {
        super(88, 89);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "\n            CREATE TABLE IF NOT EXISTS `instrument_tickers` \n            (`symbol` TEXT NOT NULL, `price` TEXT NOT NULL, \n            `status` TEXT NOT NULL, `delayed` INTEGER NOT NULL, \n            `previous` TEXT, `next_open_utc_timestamp` INTEGER, \n            PRIMARY KEY(`symbol`))\n            ", "\n            INSERT INTO instrument_tickers\n            SELECT * FROM stocks_last_rates\n            ", "DROP TABLE IF EXISTS stocks_last_rates");
        prk.o.D(supportSQLiteDatabase, "\n            CREATE TABLE `instruments_copy` \n            (`id` TEXT NOT NULL, `name` TEXT NOT NULL, \n            `symbol` TEXT NOT NULL, `currency` TEXT NOT NULL, \n            `icon` TEXT NOT NULL, `isin` TEXT NOT NULL, \n            `quantityDecimalPlaces` INTEGER NOT NULL, \n            `tradeable` INTEGER NOT NULL, PRIMARY KEY(`id`))\n            ", "\n            INSERT INTO instruments_copy\n            SELECT * FROM instruments\n            ", "DROP TABLE IF EXISTS instruments", "ALTER TABLE `instruments_copy` RENAME TO `instruments`");
        prk.o.D(supportSQLiteDatabase, "CREATE UNIQUE INDEX `index_instruments_symbol` ON `instruments`(`symbol`)", "\n            CREATE TABLE `instruments_watchlist_copy`\n            (`symbol` TEXT NOT NULL, `synced` INTEGER NOT NULL,\n             PRIMARY KEY(`symbol`), \n             FOREIGN KEY(`symbol`) REFERENCES `instruments`(`symbol`) ON UPDATE NO ACTION ON DELETE CASCADE )\n            ", "\n            INSERT INTO instruments_watchlist_copy\n            SELECT * FROM instruments_watchlist\n            ", "DROP TABLE `instruments_watchlist`");
        prk.o.C(supportSQLiteDatabase, "ALTER TABLE `instruments_watchlist_copy` RENAME TO `instruments_watchlist`", "\n            CREATE TABLE IF NOT EXISTS `instrument_tickers_summary` \n            (`symbol` TEXT NOT NULL, `volume` TEXT, \n            `dailyRange` TEXT, \n            `fiftyTwoWeekRange` TEXT,\n            PRIMARY KEY(`symbol`))\n            ", "\n            CREATE TABLE IF NOT EXISTS `instrument_details` \n            (`symbol` TEXT NOT NULL, \n            `description` TEXT, \n            `stats` TEXT NOT NULL, \n            PRIMARY KEY(`symbol`))\n            ");
    }
}
