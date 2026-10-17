package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f324420c = new d();

    private d() {
        super(13, 14);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE `payments_groups_bills`", "\n            CREATE TABLE IF NOT EXISTS `payments_groups_bills`(\n                `id` TEXT NOT NULL,\n                `groupId` TEXT NOT NULL,\n                `ownerId` TEXT NOT NULL,\n                `createdBy` TEXT NOT NULL,\n                `type` TEXT NOT NULL,\n                `title` TEXT NOT NULL,\n                `amount` INTEGER NOT NULL,\n                `currencyCode` TEXT NOT NULL,\n                `createdDate` INTEGER NOT NULL,\n                `transactionId` TEXT,\n                `transactionCategory` TEXT,\n                `transactionLogo` TEXT, \n                PRIMARY KEY(`id`))\n            ");
    }
}
