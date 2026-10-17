package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes13.dex */
public final class m3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m3 f202452c = new m3();

    private m3() {
        super(66, 67);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `instrument_tickers`", "CREATE TABLE IF NOT EXISTS `instrument_tickers` (\n    `ref` TEXT NOT NULL, \n    `symbol` TEXT NOT NULL, \n    `type` TEXT NOT NULL, \n    `price` TEXT NOT NULL, \n    `lastClean` TEXT, \n    `status` TEXT NOT NULL, \n    `delayed` INTEGER NOT NULL, \n    `previous` TEXT, \n    `next_open_utc_timestamp` INTEGER, \n    `updatedAt` INTEGER NOT NULL, \n    `previousClose` TEXT, \n    `baseline` TEXT, \n    `lastClose` TEXT, \n    `lastBid` TEXT, \n    `lastAsk` TEXT, \n    `tradingSession` TEXT NOT NULL, \n    `lastYtm` TEXT, \n    `lastCloseYtm` TEXT, \n    `previousYtm` TEXT, \n    `previousCloseYtm` TEXT, \n    PRIMARY KEY(`ref`)\n)");
    }
}
