package yx1;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f317532c = new d();

    private d() {
        super(17, 18);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `aani_contacts` ", "CREATE TABLE IF NOT EXISTS `aani_contacts` (\n    `id` TEXT NOT NULL, \n    `idValue` TEXT NOT NULL, \n    `descriptor` TEXT NOT NULL, \n    `descriptorValue` TEXT NOT NULL, \n    `contactName` TEXT, \n    `alias` TEXT, \n    `photoUri` TEXT, \n    `state` TEXT NOT NULL, \n    `isRequestEnabled` INTEGER NOT NULL DEFAULT 0, \n    PRIMARY KEY(`idValue`)\n)");
    }
}
