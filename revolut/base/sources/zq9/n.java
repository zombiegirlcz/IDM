package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes13.dex */
public final class n extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f324430c = new n();

    private n() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "\n                CREATE TABLE IF NOT EXISTS `payments_groups_members_tmp` (\n                    `memberId` TEXT NOT NULL,\n                    `groupId` TEXT NOT NULL, \n                    `type` TEXT NOT NULL, \n                    `username` TEXT, \n                    `firstName` TEXT, \n                    `lastName` TEXT, \n                    `countryCode` TEXT, \n                    PRIMARY KEY(`memberId`)\n                )\n                ", "\n            INSERT INTO `payments_groups_members_tmp`\n                (memberId, groupId, type, username, firstName, lastName, countryCode)\n            SELECT \n                memberId, groupId, 'ACTIVE', username, firstName, lastName, countryCode\n            FROM payments_groups_members\n        ", "DROP TABLE `payments_groups_members`");
        y.y(supportSQLiteDatabase, "ALTER TABLE `payments_groups_members_tmp` RENAME TO `payments_groups_members`");
    }
}
