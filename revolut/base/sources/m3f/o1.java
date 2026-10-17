package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class o1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1 f202462c = new o1();

    private o1() {
        super(20, 21);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "\n            CREATE TABLE IF NOT EXISTS `etf_details` (\n                `symbol` TEXT NOT NULL, \n                `description` TEXT, \n                `stats` TEXT, \n                `exposure` TEXT, \n                PRIMARY KEY(`symbol`)\n            )\n        ", "\n            CREATE TABLE IF NOT EXISTS `etf_stats` (\n                `symbol` TEXT NOT NULL, \n                `price` TEXT,\n                `marketCapitalization` TEXT,\n                `dividends` TEXT,\n                `expenseRatios` TEXT,\n                `managementFees` TEXT,\n                PRIMARY KEY(`symbol`)\n            )\n        ");
    }
}
