package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class ie extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ie f301887c = new ie();

    private ie() {
        super(93, 94);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `beneficiaries` ADD COLUMN `settings` TEXT NOT NULL DEFAULT \"[]\"", "ALTER TABLE `contact` ADD COLUMN `settings` TEXT NOT NULL DEFAULT \"[]\"");
    }
}
