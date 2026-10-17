package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class v1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v1 f202504c = new v1();

    private v1() {
        super(27, 28);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "\n                CREATE TABLE IF NOT EXISTS `stocks_historical_rates` (\n                    `ticker` TEXT NOT NULL,\n                    `period` TEXT NOT NULL,\n                    `timestamp` INTEGER NOT NULL,\n                    `price` TEXT NOT NULL,\n                    PRIMARY KEY(`ticker`, `period`, `timestamp`)\n                )\n                ", "\n                CREATE TABLE IF NOT EXISTS `candle_sticks` (\n                    `symbol` TEXT NOT NULL,\n                    `period` TEXT NOT NULL,\n                    `open` TEXT NOT NULL,\n                    `close` TEXT NOT NULL,\n                    `high` TEXT NOT NULL,\n                    `low` TEXT NOT NULL,\n                    `volume` TEXT NOT NULL,\n                    `from` INTEGER NOT NULL,\n                    `to` INTEGER NOT NULL,\n                    `startClose` TEXT NOT NULL,\n                    `endClose` TEXT NOT NULL,\n                    `baseline` TEXT,\n                    PRIMARY KEY(`symbol`, `period`, `from`)\n                )\n                ");
    }
}
