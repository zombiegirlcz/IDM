package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class x2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x2 f302053c = new x2();

    private x2() {
        super(185, 186);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `remote_contacts`", "CREATE TABLE IF NOT EXISTS `remote_contacts` (`code` TEXT NOT NULL, `username` TEXT NOT NULL, `legalName` TEXT NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `country` TEXT NOT NULL, `transactionsCount` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`code`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_remote_contacts_username` ON `remote_contacts` (`username`)");
    }
}
