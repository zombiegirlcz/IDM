package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f279185c = new e();

    private e() {
        super(14, 15);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `vaults_temp` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `type` TEXT NOT NULL, `goal` INTEGER NOT NULL, `banner` TEXT, `underlyingId` TEXT NOT NULL, `pocketInfo` TEXT, `depositInfo` TEXT, `members` TEXT, `estimate` INTEGER, `deadline` INTEGER, `rewards` TEXT, `createdDate` INTEGER NOT NULL,`recurringPayments` TEXT DEFAULT NULL, PRIMARY KEY(`id`))", "\n            INSERT INTO `vaults_temp`\n                (id, state, type, goal, banner, underlyingId, pocketInfo, depositInfo, members, estimate, deadline, rewards, createdDate, recurringPayments)\n            SELECT \n                id, state, type, goal, banner, underlyingId, pocketInfo, depositInfo, members, estimate, deadline, rewards, createdDate, recurringPayments\n            FROM vaults\n        ", "DROP TABLE IF EXISTS `vaults`");
        y.y(supportSQLiteDatabase, "ALTER TABLE 'vaults_temp' RENAME TO 'vaults'");
    }
}
