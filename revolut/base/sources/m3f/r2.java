package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class r2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r2 f202481c = new r2();

    private r2() {
        super(47, 48);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DELETE FROM `instruments`", "ALTER TABLE `instruments` ADD COLUMN `exchange` TEXT NOT NULL DEFAULT ''");
    }
}
