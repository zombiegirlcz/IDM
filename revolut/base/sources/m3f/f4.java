package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class f4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f4 f202411c = new f4();

    private f4() {
        super(83, 84);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DELETE FROM `instrument_details` WHERE `type` = 'CFD'", "\n                CREATE TABLE IF NOT EXISTS `cfd_details` (\n                    `ref` TEXT NOT NULL,\n                    `symbol` TEXT NOT NULL, \n                    `stock_exchange_code` TEXT NOT NULL,\n                    `description` TEXT,\n                    `kidUrl` TEXT,\n                    PRIMARY KEY(`ref`)\n                )\n            ");
    }
}
