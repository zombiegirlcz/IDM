package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f174399c = new k();

    private k() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "ALTER TABLE `plans` ADD COLUMN `merchantLogoUrl` TEXT DEFAULT NULL", "ALTER TABLE `plans` ADD COLUMN `merchantLogoName` TEXT DEFAULT NULL");
    }
}
