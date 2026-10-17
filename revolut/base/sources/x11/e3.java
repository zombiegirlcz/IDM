package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class e3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e3 f301828c = new e3();

    private e3() {
        super(190, 191);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `contact` ADD COLUMN `firstName` TEXT NOT NULL DEFAULT ''", "ALTER TABLE `contact` ADD COLUMN `lastName` TEXT NOT NULL DEFAULT ''");
    }
}
