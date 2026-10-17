package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1 f301817c = new d1();

    private d1() {
        super(147, 148);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "\n                    CREATE TABLE IF NOT EXISTS `remote_contacts` \n                    (\n                        `id` INTEGER NOT NULL, \n                        `username` TEXT NOT NULL, \n                        `firstName` TEXT NOT NULL, \n                        `lastName` TEXT NOT NULL, \n                        `country` TEXT NOT NULL, \n                        `transactionsCount` INTEGER NOT NULL, \n                        `timestamp` INTEGER NOT NULL,\n                        PRIMARY KEY(`id`))\n                ", "\n                    CREATE UNIQUE INDEX `index_remote_contacts_username` \n                    ON `remote_contacts` (`username`)\n                ");
    }
}
