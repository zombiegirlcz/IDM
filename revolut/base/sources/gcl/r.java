package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f142546c = new r();

    private r() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `instrument_details` (\n    `ref` TEXT NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `description` TEXT,\n    `stockExchangeCode` TEXT NOT NULL,\n    `stats` TEXT,\n    `sector` TEXT NOT NULL,\n    `type` TEXT NOT NULL,\n    `analystsSummary` TEXT,\n    `stateReason` TEXT,\n    `delistDate` INTEGER,\n    `tags` TEXT,\n    PRIMARY KEY(`ref`)\n)", "CREATE TABLE IF NOT EXISTS `bond_details` (\n    `ref` TEXT NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `stock_exchange_code` TEXT NOT NULL,\n    `issue` TEXT NOT NULL,\n    `issuer` TEXT NOT NULL,\n    `coupon` TEXT NOT NULL,\n    `primary_stats` TEXT NOT NULL,\n    `ratings` TEXT,\n    `callability` TEXT,\n    `state_reason` TEXT,\n    `delist_date` INTEGER,\n    PRIMARY KEY(`ref`)\n)", "CREATE TABLE IF NOT EXISTS `cfd_details` (\n    `ref` TEXT NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `stock_exchange_code` TEXT NOT NULL,\n    `description` TEXT,\n    `kidUrl` TEXT,\n    `stateReason` TEXT,\n    `delistDate` INTEGER,\n    PRIMARY KEY(`ref`)\n)");
        prk.o.D(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `etf_details` (\n    `ref` TEXT NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `description` TEXT,\n    `stockExchangeCode` TEXT NOT NULL,\n    `stats` TEXT,\n    `exposure` TEXT,\n    `prospectusUrl` TEXT,\n    `kidUrl` TEXT,\n    `stateReason` TEXT,\n    `delistDate` INTEGER,\n    `tags` TEXT,\n    PRIMARY KEY(`ref`)\n)", "CREATE TABLE IF NOT EXISTS `fund_details` (\n    `ref` TEXT NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `exchange` TEXT NOT NULL,\n    `fundHouse` TEXT,\n    `fundManager` TEXT,\n    `performance` TEXT,\n    `documents` TEXT,\n    `keyDetails` TEXT,\n    `exposure` TEXT,\n    `concentration` TEXT,\n    PRIMARY KEY(`ref`)\n)", "CREATE TABLE IF NOT EXISTS `instrument_details_recommendations` (\n    `ref` TEXT NOT NULL,\n    `recommendations` TEXT NOT NULL,\n    PRIMARY KEY(`ref`)\n)", "CREATE TABLE IF NOT EXISTS `instrument_governance` (\n    `ref` TEXT NOT NULL,\n    `targetMarket` TEXT NOT NULL,\n    PRIMARY KEY(`ref`)\n)");
    }
}
