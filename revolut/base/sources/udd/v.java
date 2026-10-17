package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f279202c = new v();

    private v() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `vaults_without_icon_tmp` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `goal` INTEGER NOT NULL, `banner` TEXT, `underlyingId` TEXT NOT NULL, `pocketInfo` TEXT, `depositInfo` TEXT, `stakingInfo` TEXT, `members` TEXT, `estimate` INTEGER, `deadline` INTEGER, `rewards` TEXT, `createdDate` INTEGER NOT NULL, PRIMARY KEY(`id`))", "\n            INSERT INTO `vaults_without_icon_tmp`\n                (id, state, goal, banner, underlyingId, pocketInfo, depositInfo, stakingInfo, members, estimate, deadline, rewards, createdDate)\n            SELECT \n                id, state, goal, banner, underlyingId, pocketInfo, depositInfo, stakingInfo, members, estimate, deadline, rewards, createdDate\n            FROM vaults\n        ", "DROP TABLE 'vaults'");
        y.y(supportSQLiteDatabase, "ALTER TABLE 'vaults_without_icon_tmp' RENAME TO 'vaults'");
    }
}
