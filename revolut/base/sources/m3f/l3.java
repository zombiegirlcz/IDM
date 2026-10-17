package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes13.dex */
public final class l3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l3 f202446c = new l3();

    private l3() {
        super(65, 66);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `stocks_historical_rates`", "    CREATE TABLE IF NOT EXISTS `stocks_historical_rates` (\n        `ticker` TEXT NOT NULL, \n        `period` TEXT NOT NULL, \n        `timestamp` INTEGER NOT NULL, \n        `valueType` TEXT NOT NULL, \n        `price` TEXT, \n        `percentageYtm` TEXT, \n        PRIMARY KEY(`ticker`, `period`, `timestamp`, `valueType`)\n)");
    }
}
