package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f142550c = new v();

    private v() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `instrument_tickers_summary_new` (\n    `ref` TEXT NOT NULL,\n    `volume` TEXT,\n    `unitVolume` INTEGER,\n    `dailyRange` TEXT,\n    `fiftyTwoWeekRange` TEXT,\n    `fiveYearRange` TEXT,\n    `highlyVolatile` INTEGER,\n    PRIMARY KEY(`ref`)\n)", "INSERT INTO `instrument_tickers_summary_new` (\n    `ref`,\n    `volume`,\n    `unitVolume`,\n    `dailyRange`,\n    `fiftyTwoWeekRange`,\n    `fiveYearRange`,\n    `highlyVolatile`\n)\nSELECT\n    `ref`,\n    `volume`,\n    `unitVolume`,\n    `dailyRange`,\n    `fiftyTwoWeekRange`,\n    `fiveYearRange`,\n    `highlyVolatile`\nFROM `instrument_tickers_summary`", "DROP TABLE `instrument_tickers_summary`");
        supportSQLiteDatabase.execSQL("ALTER TABLE `instrument_tickers_summary_new` RENAME TO `instrument_tickers_summary`");
    }
}
