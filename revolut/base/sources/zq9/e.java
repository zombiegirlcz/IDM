package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f324421c = new e();

    private e() {
        super(14, 15);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE `payments_groups_debts`", "\n                CREATE TABLE IF NOT EXISTS `payments_groups_debts` (\n                    `id` TEXT NOT NULL, \n                    `groupId` TEXT NOT NULL, \n                    `type` TEXT NOT NULL, \n                    `state` TEXT NOT NULL, \n                    `amount` INTEGER NOT NULL, \n                    `currencyCode` TEXT NOT NULL, \n                    `displayAmount` INTEGER NOT NULL, \n                    `displayCurrencyCode` TEXT NOT NULL, \n                    `payerId` TEXT NOT NULL, \n                    `payeeId` TEXT NOT NULL, \n                    `transferReasonRequired` INTEGER NOT NULL, \n                    PRIMARY KEY(`id`)\n                )\n                ");
    }
}
