package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class y1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y1 f202522c = new y1();

    private y1() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DELETE FROM `index_details`", "ALTER TABLE `index_details` ADD COLUMN `title` TEXT NOT NULL DEFAULT ''");
    }
}
