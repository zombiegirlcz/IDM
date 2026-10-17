package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f142551c = new w();

    private w() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `bond_stats` (\n    `ref` TEXT NOT NULL, \n    `price` TEXT NOT NULL, \n    `primaryStats` TEXT NOT NULL, \n    `yieldStats` TEXT NOT NULL, \n    `riskStats` TEXT NOT NULL, \n    PRIMARY KEY(`ref`)\n)", "CREATE TABLE IF NOT EXISTS `etf_stats` (\n    `ref` TEXT NOT NULL, \n    `price` TEXT, \n    `marketCapitalization` TEXT, \n    `dividends` TEXT, \n    `expenseRatios` TEXT, \n    `managementFees` TEXT, \n    `charges` TEXT, \n    `riskRating` TEXT, \n    PRIMARY KEY(`ref`)\n)", "CREATE TABLE IF NOT EXISTS `fund_stats` (\n    `ref` TEXT NOT NULL, \n    `annualReturn` TEXT, \n    `risk` INTEGER, \n    PRIMARY KEY(`ref`)\n)");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `instrument_stats` (\n    `ref` TEXT NOT NULL, \n    `price` TEXT NOT NULL, \n    `volume` TEXT NOT NULL, \n    `marketCap` TEXT NOT NULL, \n    `perShare` TEXT NOT NULL, \n    `dividend` TEXT NOT NULL, \n    `valuation` TEXT NOT NULL, \n    `profitability` TEXT NOT NULL, \n    `managementEffectiveness` TEXT NOT NULL, \n    `listStatus` TEXT, \n    PRIMARY KEY(`ref`)\n)");
    }
}
