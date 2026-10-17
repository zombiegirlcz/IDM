package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f202401c = new e0();

    private e0() {
        super(128, 129);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `fund_details`", "CREATE TABLE IF NOT EXISTS `fund_details` (\n    `ref` TEXT NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `exchange` TEXT NOT NULL,\n    `fundHouse` TEXT,\n    `fundManager` TEXT,\n    `performance` TEXT,\n    `documents` TEXT,\n    `keyDetails` TEXT,\n    `exposure` TEXT,\n    `concentration` TEXT,\n    PRIMARY KEY(`ref`)\n)");
    }
}
