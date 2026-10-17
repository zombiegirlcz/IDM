package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class s1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s1 f202486c = new s1();

    private s1() {
        super(24, 25);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `instruments` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `name` TEXT NOT NULL, `symbol` TEXT NOT NULL, `stateDetails` TEXT NOT NULL, `currency` TEXT NOT NULL, `sortOrder` INTEGER NOT NULL, `isin` TEXT NOT NULL, `shortOverview` TEXT, `quantityDecimalPlaces` INTEGER NOT NULL, `allSymbols` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_instruments_symbol` ON `instruments` (`symbol`)", "CREATE TABLE IF NOT EXISTS `instrument_tickers` (`symbol` TEXT NOT NULL, `price` TEXT NOT NULL, `status` TEXT NOT NULL, `delayed` INTEGER NOT NULL, `previous` TEXT, `next_open_utc_timestamp` INTEGER, `updatedAt` INTEGER NOT NULL, `previousClose` TEXT, `baseline` TEXT, `lastClose` TEXT, `tradingSession` TEXT NOT NULL, PRIMARY KEY(`symbol`))");
        prk.o.C(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `instrument_tickers_summary` (`symbol` TEXT NOT NULL, `volume` TEXT, `unitVolume` INTEGER, `dailyRange` TEXT, `fiftyTwoWeekRange` TEXT, `fiveYearRange` TEXT, `highlyVolatile` INTEGER, PRIMARY KEY(`symbol`))", "CREATE TABLE IF NOT EXISTS `instruments_watchlist` (`symbol` TEXT NOT NULL, `synced` INTEGER NOT NULL, PRIMARY KEY(`symbol`))", "CREATE TABLE IF NOT EXISTS `recently_viewed_instrument` (`symbol` TEXT NOT NULL, `last_seen` INTEGER NOT NULL, PRIMARY KEY(`symbol`))");
    }
}
