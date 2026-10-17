package ol3;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f226323c = new d();

    private d() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "ALTER TABLE `remote_contacts` ADD COLUMN `type` TEXT NOT NULL DEFAULT 'INDIVIDUAL'", "ALTER TABLE `remote_contacts` ADD COLUMN `businessName` TEXT DEFAULT NULL");
    }
}
