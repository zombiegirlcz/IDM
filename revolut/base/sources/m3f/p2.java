package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class p2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2 f202469c = new p2();

    private p2() {
        super(45, 46);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `etf_details`", "CREATE TABLE IF NOT EXISTS `etf_details` (`ref` TEXT NOT NULL, `symbol` TEXT NOT NULL, `description` TEXT, `stockExchangeCode` TEXT NOT NULL, `stats` TEXT, `exposure` TEXT, `prospectusUrl` TEXT, `kidUrl` TEXT, `esgScores` TEXT, PRIMARY KEY(`ref`))", "DROP TABLE IF EXISTS `instrument_details`");
        prk.o.D(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `instrument_details` (`ref` TEXT NOT NULL, `symbol` TEXT NOT NULL, `description` TEXT, `stockExchangeCode` TEXT NOT NULL, `stats` TEXT, `sector` TEXT NOT NULL, `type` TEXT NOT NULL, `analystsSummary` TEXT, `esgScores` TEXT, PRIMARY KEY(`ref`))", "DROP TABLE IF EXISTS `instrument_tickers`", "CREATE TABLE IF NOT EXISTS `instrument_tickers` (`symbol` TEXT NOT NULL, `ref` TEXT NOT NULL, `price` TEXT NOT NULL, `status` TEXT NOT NULL, `delayed` INTEGER NOT NULL, `previous` TEXT, `next_open_utc_timestamp` INTEGER, `updatedAt` INTEGER NOT NULL, `previousClose` TEXT, `baseline` TEXT, `lastClose` TEXT, `tradingSession` TEXT NOT NULL, PRIMARY KEY(`ref`))", "DROP TABLE IF EXISTS `instrument_tickers_summary`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `instrument_tickers_summary` (`ref` TEXT NOT NULL, `symbol` TEXT NOT NULL, `volume` TEXT, `unitVolume` INTEGER, `dailyRange` TEXT, `fiftyTwoWeekRange` TEXT, `fiveYearRange` TEXT, `highlyVolatile` INTEGER, PRIMARY KEY(`ref`))");
    }
}
