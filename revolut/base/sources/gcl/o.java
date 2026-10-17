package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f142543c = new o();

    private o() {
        super(23, 24);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER TABLE `instrument_tickers` ADD COLUMN `lastFmv` TEXT DEFAULT null", "ALTER TABLE `instrument_tickers` ADD COLUMN `fmvUpdatedAt` INTEGER DEFAULT null", "ALTER TABLE `instrument_tickers` ADD COLUMN `lastMid` TEXT DEFAULT null");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `instrument_tickers` ADD COLUMN `lastBidSize` INTEGER DEFAULT null", "ALTER TABLE `instrument_tickers` ADD COLUMN `lastAskSize` INTEGER DEFAULT null", "ALTER TABLE `instrument_tickers` ADD COLUMN `dayVolume` INTEGER DEFAULT null", "ALTER TABLE `instrument_tickers` ADD COLUMN `openInterest` INTEGER DEFAULT null");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `instrument_tickers` ADD COLUMN `impliedVolatility` TEXT DEFAULT null", "ALTER TABLE `instrument_tickers` ADD COLUMN `delta` TEXT DEFAULT null", "ALTER TABLE `instrument_tickers` ADD COLUMN `gamma` TEXT DEFAULT null", "ALTER TABLE `instrument_tickers` ADD COLUMN `theta` TEXT DEFAULT null");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `instrument_tickers` ADD COLUMN `vega` TEXT DEFAULT null", "ALTER TABLE `instrument_tickers` ADD COLUMN `probabilityOfProfit` TEXT DEFAULT null", "ALTER TABLE `instrument_tickers` ADD COLUMN `breakEven` TEXT DEFAULT null", "ALTER TABLE `instrument_tickers` ADD COLUMN `effectiveLeverage` TEXT DEFAULT null");
        supportSQLiteDatabase.execSQL("ALTER TABLE `instrument_tickers` ADD COLUMN `contractSize` INTEGER DEFAULT null");
    }
}
