package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class t3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t3 f302013c = new t3();

    private t3() {
        super(201, 202);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DELETE FROM `institutions`", "ALTER TABLE `institutions` ADD COLUMN `infoProvider` INTEGER NOT NULL DEFAULT 1");
    }
}
