package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class f3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f3 f202410c = new f3();

    private f3() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `instrument_details`", "\n            CREATE TABLE IF NOT EXISTS `instrument_details` (\n                `symbol` TEXT NOT NULL, \n                `sector` TEXT NOT NULL,\n                `description` TEXT, \n                `stats` TEXT, \n                `analystsSummary` TEXT,\n                PRIMARY KEY(`symbol`)\n            )\n        ");
    }
}
