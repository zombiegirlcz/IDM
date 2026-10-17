package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f174411c = new w();

    private w() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `limits` ADD COLUMN `deactivationReason` TEXT DEFAULT NULL", "ALTER TABLE `limits` ADD COLUMN `state` TEXT NOT NULL DEFAULT 'ACTIVE'");
    }
}
