package hpk;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f154571c = new e();

    private e() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `mid_rates_cache`", "DROP TABLE IF EXISTS `rates_cache`", "CREATE TABLE IF NOT EXISTS `mid_rates_cache` (\n    `from` TEXT NOT NULL,\n    `to` TEXT NOT NULL,\n    `rate` TEXT NOT NULL,\n    `eodRate` TEXT NOT NULL,\n    `isWeekend` INTEGER,\n    `weekendStartTime` INTEGER,\n    `weekendEndTime` INTEGER,\n    PRIMARY KEY(`from`, `to`)\n)");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `rates_cache` (\n    `from` TEXT NOT NULL,\n    `to` TEXT NOT NULL,\n    `rate` REAL NOT NULL,\n    `time_stamp` INTEGER NOT NULL,\n    `isWeekend` INTEGER,\n    `weekendStartTime` INTEGER,\n    `weekendEndTime` INTEGER,\n    PRIMARY KEY(`from`, `to`)\n)");
    }
}
