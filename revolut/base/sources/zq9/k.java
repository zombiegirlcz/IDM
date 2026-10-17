package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes13.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f324427c = new k();

    private k() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS 'payments_groups'", "DROP TABLE IF EXISTS 'payments_groups_interactions'", "DROP TABLE IF EXISTS 'payments_groups_members'");
        prk.o.D(supportSQLiteDatabase, "DROP TABLE IF EXISTS 'payments_groups_bills'", "DROP TABLE IF EXISTS 'payments_groups_bills_splits'", "DROP TABLE IF EXISTS 'payments_groups_settlements'", "DROP TABLE IF EXISTS 'payments_groups_debts'");
        prk.o.D(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `payments_groups` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `imageUrl` TEXT, `currencyCode` TEXT, `balance` TEXT, `updatedDate` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `payments_groups_interactions` (`groupId` TEXT NOT NULL, `interactionsTimestamp` INTEGER NOT NULL, `interactionsCount` INTEGER NOT NULL, PRIMARY KEY(`groupId`))", "CREATE TABLE IF NOT EXISTS `payments_groups_members` (`memberId` TEXT NOT NULL, `groupId` TEXT NOT NULL, `username` TEXT NOT NULL, `firstName` TEXT, `lastName` TEXT, `countryCode` TEXT NOT NULL, PRIMARY KEY(`memberId`))", "CREATE TABLE IF NOT EXISTS `payments_groups_bills` (`id` TEXT NOT NULL, `groupId` TEXT NOT NULL, `ownerId` TEXT NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currencyCode` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `transactionId` TEXT, `transactionCategory` TEXT, `transactionLogo` TEXT, PRIMARY KEY(`id`))");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `payments_groups_bills_splits` (`id` TEXT NOT NULL, `billId` TEXT NOT NULL, `groupId` TEXT NOT NULL, `ownerId` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currencyCode` TEXT NOT NULL, PRIMARY KEY(`id`))");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `payments_groups_settlements` (`id` TEXT NOT NULL, `groupId` TEXT NOT NULL, `transactionId` TEXT, `payerId` TEXT NOT NULL, `payeeId` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currencyCode` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `payments_groups_debts` (`id` TEXT NOT NULL, `groupId` TEXT NOT NULL, `type` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currencyCode` TEXT NOT NULL, `payerId` TEXT, `payeeId` TEXT, PRIMARY KEY(`id`))");
        supportSQLiteDatabase.setTransactionSuccessful();
        supportSQLiteDatabase.endTransaction();
    }
}
