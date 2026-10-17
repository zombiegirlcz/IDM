package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f202383c = new b0();

    private b0() {
        super(ISO781611.SMT_TAG, 126);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `candle_sticks`", "DROP TABLE IF EXISTS `stocks_historical_rates`", "CREATE TABLE IF NOT EXISTS `candle_sticks` (\n    `ref` TEXT NOT NULL,\n    `period` TEXT NOT NULL,\n    `open` TEXT NOT NULL,\n    `close` TEXT NOT NULL,\n    `high` TEXT NOT NULL,\n    `low` TEXT NOT NULL,\n    `volume` INTEGER NOT NULL,\n    `from` INTEGER NOT NULL,\n    `to` INTEGER NOT NULL,\n    `startClose` TEXT NOT NULL,\n    `endClose` TEXT NOT NULL,\n    `baseline` TEXT,\n    PRIMARY KEY(`ref`, `period`, `from`) )");
        supportSQLiteDatabase.execSQL("    CREATE TABLE IF NOT EXISTS `stocks_historical_rates` (\n        `ref` TEXT NOT NULL, \n        `period` TEXT NOT NULL, \n        `timestamp` INTEGER NOT NULL, \n        `valueType` TEXT NOT NULL, \n        `price` TEXT, \n        `percentageYtm` TEXT, \n        PRIMARY KEY(`ref`, `period`, `timestamp`, `valueType`)\n)");
    }
}
