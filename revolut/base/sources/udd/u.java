package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f279201c = new u();

    private u() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `vaults`", "CREATE TABLE IF NOT EXISTS `vaults` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `goal` INTEGER NOT NULL, `banner` TEXT, `icon` TEXT, `underlyingId` TEXT NOT NULL, `pocketInfo` TEXT, `depositInfo` TEXT, `stakingInfo` TEXT, `members` TEXT, `estimate` INTEGER, `deadline` INTEGER, `rewards` TEXT, `createdDate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
