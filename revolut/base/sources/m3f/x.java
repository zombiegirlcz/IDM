package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f202514c = new x();

    private x() {
        super(121, 122);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `instrument_details` ADD COLUMN `tags` TEXT DEFAULT NULL", "ALTER TABLE `etf_details` ADD COLUMN `tags` TEXT DEFAULT NULL");
    }
}
