package ol3;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f226322c = new c();

    private c() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "DROP TABLE `remote_contacts_extra`", "DROP INDEX IF EXISTS `index_remote_contacts_extra_username`", "                CREATE TABLE IF NOT EXISTS `remote_contacts_extra` (\n                    `code` TEXT NOT NULL,\n                    `username` TEXT NOT NULL, \n                    `paidPlan` TEXT, \n                    `legalName` TEXT NOT NULL, \n                    `lastName` TEXT NOT NULL, \n                    `firstName` TEXT NOT NULL, \n                        PRIMARY KEY(`code`))");
        supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_remote_contacts_extra_username` ON `remote_contacts_extra` (`username`)");
    }
}
