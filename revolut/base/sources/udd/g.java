package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f279187c = new g();

    private g() {
        super(16, 17);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `vaults`", "CREATE TABLE IF NOT EXISTS `vaults` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `type` TEXT NOT NULL, `ownerId` TEXT NOT NULL, `goal` INTEGER NOT NULL, `banner` TEXT, `underlyingId` TEXT NOT NULL, `pocketInfo` TEXT, `depositInfo` TEXT, `members` TEXT, `estimate` INTEGER, `deadline` INTEGER, `rewards` TEXT, `recurringPayments` TEXT, `accountType` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
