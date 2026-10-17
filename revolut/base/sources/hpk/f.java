package hpk;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f154572c = new f();

    private f() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `mid_rates_cache`", "    CREATE TABLE IF NOT EXISTS `mid_rates_cache` (\n    `from` TEXT NOT NULL, \n    `to` TEXT NOT NULL, \n    `rate` TEXT NOT NULL, \n    `eodRate` TEXT, \n    `isWeekend` INTEGER, \n    `weekendStartTime` INTEGER, \n    `weekendEndTime` INTEGER, \n    PRIMARY KEY(`from`, `to`)\n)");
    }
}
