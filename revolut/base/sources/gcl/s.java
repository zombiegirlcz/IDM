package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f142547c = new s();

    private s() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `stocks_historical_rates` (\n    `ref` TEXT NOT NULL,\n    `period` TEXT NOT NULL,\n    `timestamp` INTEGER NOT NULL,\n    `valueType` TEXT NOT NULL,\n    `price` TEXT,\n    `percentageYtm` TEXT,\n    PRIMARY KEY(`ref`, `period`, `timestamp`, `valueType`)\n)", "CREATE TABLE IF NOT EXISTS `candle_sticks` (\n    `ref` TEXT NOT NULL,\n    `period` TEXT NOT NULL,\n    `open` TEXT NOT NULL,\n    `close` TEXT NOT NULL,\n    `high` TEXT NOT NULL,\n    `low` TEXT NOT NULL,\n    `volume` INTEGER NOT NULL,\n    `from` INTEGER NOT NULL,\n    `to` INTEGER NOT NULL,\n    `startClose` TEXT NOT NULL,\n    `endClose` TEXT NOT NULL,\n    `baseline` TEXT,\n    PRIMARY KEY(`ref`, `period`, `from`)\n)");
    }
}
