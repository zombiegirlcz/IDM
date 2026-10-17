package ol3;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f226321c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "ALTER TABLE `contact` ADD COLUMN `paidPlan` TEXT DEFAULT NULL", "CREATE TABLE IF NOT EXISTS `remote_contacts_extra` (`code` TEXT NOT NULL,`username` TEXT NOT NULL, `paidPlan` TEXT, PRIMARY KEY(`code`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_remote_contacts_extra_username` ON `remote_contacts_extra` (`username`)");
    }
}
