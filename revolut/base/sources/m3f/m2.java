package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class m2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m2 f202451c = new m2();

    private m2() {
        super(42, 43);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DELETE FROM `instruments`", "ALTER TABLE `instruments` ADD COLUMN `ref` TEXT NOT NULL DEFAULT ''");
    }
}
