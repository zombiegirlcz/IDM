package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes13.dex */
public final class q extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f324433c = new q();

    private q() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "\n                CREATE TABLE IF NOT EXISTS `payments_groups_members_tmp` (\n                    `memberId` TEXT NOT NULL, \n                    `groupId` TEXT NOT NULL, \n                    `inviterId` TEXT, \n                    `contactId` TEXT, \n                    `type` TEXT NOT NULL, \n                    `firstName` TEXT, \n                    `lastName` TEXT,  \n                    `countryCode` TEXT, \n                    `isRevolut` INTEGER, \n                    PRIMARY KEY(`memberId`)\n                )\n                ", "\n            INSERT INTO `payments_groups_members_tmp`\n                (memberId, groupId, inviterId, contactId, type, firstName, lastName, countryCode, isRevolut)\n            SELECT \n                memberId, groupId, inviterId, contactId, type, firstName, lastName, countryCode, isRevolut\n            FROM payments_groups_members\n        ", "DROP TABLE `payments_groups_members`");
        y.y(supportSQLiteDatabase, "ALTER TABLE `payments_groups_members_tmp` RENAME TO `payments_groups_members`");
    }
}
