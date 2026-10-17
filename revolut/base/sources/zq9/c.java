package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f324419c = new c();

    private c() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE `payments_groups_settlements`", "\n                CREATE TABLE IF NOT EXISTS `payments_groups_settlements` (\n                    `id` TEXT NOT NULL, \n                    `groupId` TEXT NOT NULL, \n                    `transactionId` TEXT, \n                    `paymentLinkId` TEXT, \n                    `type` TEXT NOT NULL, \n                    `state` TEXT NOT NULL, \n                    `payerId` TEXT NOT NULL, \n                    `payeeId` TEXT NOT NULL,\n                    `createdBy` TEXT NOT NULL,\n                    `amount` INTEGER NOT NULL, \n                    `currencyCode` TEXT NOT NULL, \n                    `createdDate` INTEGER NOT NULL, \n                    PRIMARY KEY(`id`)\n                )\n                ");
    }
}
