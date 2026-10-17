package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p0 f301962c = new p0();

    private p0() {
        super(135, 136);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DELETE FROM `instrument_details`", "ALTER TABLE `instrument_details` ADD COLUMN `sector` TEXT NOT NULL DEFAULT ''");
    }
}
