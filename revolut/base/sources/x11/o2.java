package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class o2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o2 f301951c = new o2();

    private o2() {
        super(178, 179);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `instrument_tickers`", "\n            CREATE TABLE IF NOT EXISTS `instrument_tickers` (\n                `symbol` TEXT NOT NULL,\n                `price` TEXT NOT NULL,\n                `status` TEXT NOT NULL,\n                `delayed` INTEGER NOT NULL,\n                `previous` TEXT,\n                `next_open_utc_timestamp` INTEGER,\n                `updatedAt` INTEGER NOT NULL,\n                `previousClose` TEXT,\n                `baseline` TEXT,\n                `lastClose` TEXT,\n                `tradingSession` TEXT NOT NULL,\n                PRIMARY KEY(`symbol`)\n            )\n            ");
    }
}
