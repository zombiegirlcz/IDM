package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f279203c = new w();

    private w() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `vaults`", "CREATE TABLE IF NOT EXISTS `vaults` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `type` TEXT NOT NULL, `goal` INTEGER NOT NULL, `banner` TEXT, `underlyingId` TEXT NOT NULL, `pocketInfo` TEXT, `depositInfo` TEXT, `stakingInfo` TEXT, `members` TEXT, `estimate` INTEGER, `deadline` INTEGER, `rewards` TEXT, `createdDate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
