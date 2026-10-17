package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes13.dex */
public final class s extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f324435c = new s();

    private s() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "\n                CREATE TABLE IF NOT EXISTS `payments_groups_debts_tmp` (\n                    `id` TEXT NOT NULL, \n                    `groupId` TEXT NOT NULL, \n                    `type` TEXT NOT NULL, \n                    `state` TEXT NOT NULL, \n                    `amount` INTEGER NOT NULL, \n                    `currencyCode` TEXT NOT NULL, \n                    `payerId` TEXT, \n                    `payeeId` TEXT, \n                    PRIMARY KEY(`id`)\n                )\n                ", "\n                INSERT INTO `payments_groups_debts_tmp`\n                    (id, groupId, type, state, amount, currencyCode, payerId, payeeId)\n                SELECT \n                    id, groupId, type, 'ACTIVE', amount, currencyCode, payerId, payeeId\n                FROM payments_groups_debts\n            ", "DROP TABLE `payments_groups_debts`");
        y.y(supportSQLiteDatabase, "ALTER TABLE `payments_groups_debts_tmp` RENAME TO `payments_groups_debts`");
    }
}
