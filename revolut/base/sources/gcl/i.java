package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f142537c = new i();

    private i() {
        super(18, 19);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "\n                CREATE TABLE IF NOT EXISTS `bond_details_new` (\n                    `ref` TEXT NOT NULL,\n                    `symbol` TEXT NOT NULL,\n                    `stock_exchange_code` TEXT NOT NULL,\n                    `issue` TEXT NOT NULL,\n                    `issuer` TEXT NOT NULL,\n                    `coupon` TEXT NOT NULL,\n                    `primary_stats` TEXT NOT NULL,\n                    `ratings` TEXT,\n                    `callability` TEXT,\n                    PRIMARY KEY(`ref`)\n                )\n                ", "\n            INSERT INTO `bond_details_new`\n                (ref, symbol, stock_exchange_code, issue, issuer, coupon, primary_stats, ratings, callability)\n            SELECT\n                ref, symbol, stock_exchange_code, issue, issuer, coupon, primary_stats, ratings, callability\n            FROM bond_details\n        ", "DROP TABLE `bond_details`");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `bond_details_new` RENAME TO `bond_details`", "\n                CREATE TABLE IF NOT EXISTS `cfd_details_new` (\n                    `ref` TEXT NOT NULL,\n                    `symbol` TEXT NOT NULL,\n                    `stock_exchange_code` TEXT NOT NULL,\n                    `description` TEXT,\n                    `kidUrl` TEXT,\n                    PRIMARY KEY(`ref`)\n                )\n                ", "\n            INSERT INTO `cfd_details_new`\n                (ref, symbol, stock_exchange_code, description, kidUrl)\n            SELECT\n                ref, symbol, stock_exchange_code, description, kidUrl\n            FROM cfd_details\n        ", "DROP TABLE `cfd_details`");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `cfd_details_new` RENAME TO `cfd_details`", "\n                CREATE TABLE IF NOT EXISTS `etf_details_new` (\n                    `ref` TEXT NOT NULL,\n                    `symbol` TEXT NOT NULL,\n                    `description` TEXT,\n                    `stockExchangeCode` TEXT NOT NULL,\n                    `stats` TEXT,\n                    `exposure` TEXT,\n                    `prospectusUrl` TEXT,\n                    `kidUrl` TEXT,\n                    `tags` TEXT,\n                    PRIMARY KEY(`ref`)\n                )\n                ", "\n            INSERT INTO `etf_details_new`\n                (ref, symbol, description, stockExchangeCode, stats, exposure, prospectusUrl, kidUrl, tags)\n            SELECT\n                ref, symbol, description, stockExchangeCode, stats, exposure, prospectusUrl, kidUrl, tags\n            FROM etf_details\n        ", "DROP TABLE `etf_details`");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `etf_details_new` RENAME TO `etf_details`", "\n                CREATE TABLE IF NOT EXISTS `instrument_details_new` (\n                    `ref` TEXT NOT NULL,\n                    `symbol` TEXT NOT NULL,\n                    `description` TEXT,\n                    `stockExchangeCode` TEXT NOT NULL,\n                    `stats` TEXT,\n                    `sector` TEXT NOT NULL,\n                    `type` TEXT NOT NULL,\n                    `analystsSummary` TEXT,\n                    `tags` TEXT,\n                    PRIMARY KEY(`ref`)\n                )\n                ", "\n            INSERT INTO `instrument_details_new`\n                (ref, symbol, description, stockExchangeCode, stats, sector, type, analystsSummary, tags)\n            SELECT\n                ref, symbol, description, stockExchangeCode, stats, sector, type, analystsSummary, tags\n            FROM instrument_details\n        ", "DROP TABLE `instrument_details`");
        supportSQLiteDatabase.execSQL("ALTER TABLE `instrument_details_new` RENAME TO `instrument_details`");
    }
}
