package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes13.dex */
public final class r extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f324434c = new r();

    private r() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "\n                CREATE TABLE IF NOT EXISTS `payments_groups_settlements_tmp` (\n                    `id` TEXT NOT NULL, \n                    `groupId` TEXT NOT NULL, \n                    `transactionId` TEXT, \n                    `paymentLinkId` TEXT, \n                    `type` TEXT NOT NULL, \n                    `payerId` TEXT NOT NULL, \n                    `payeeId` TEXT NOT NULL, \n                    `amount` INTEGER NOT NULL, \n                    `currencyCode` TEXT NOT NULL, \n                    `createdDate` INTEGER NOT NULL, \n                    PRIMARY KEY(`id`)\n                )\n                ", "\n                INSERT INTO `payments_groups_settlements_tmp`\n                    (id, groupId, transactionId, paymentLinkId, type, payerId, payeeId, amount, currencyCode, createdDate)\n                SELECT\n                    id, groupId, transactionId, NULL, 'COMPLETED', payerId, payeeId, amount, currencyCode, createdDate\n                FROM payments_groups_settlements\n                ", "DROP TABLE `payments_groups_settlements`");
        y.y(supportSQLiteDatabase, "ALTER TABLE `payments_groups_settlements_tmp` RENAME TO `payments_groups_settlements`");
    }
}
