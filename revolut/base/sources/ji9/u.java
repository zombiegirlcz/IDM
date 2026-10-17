package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f174409c = new u();

    private u() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DELETE FROM plan_updates");
        f174409c.getClass();
        database.execSQL("DROP TABLE IF EXISTS `limits`");
        database.execSQL("CREATE TABLE IF NOT EXISTS `limits` (\n                `facilityId` TEXT NOT NULL, \n                `pocketId` TEXT NOT NULL, \n                `fee` REAL NOT NULL, \n                `lateInterest` REAL NOT NULL, \n                `countryCode` TEXT NOT NULL, \n                `availableToSpend` INTEGER NOT NULL, \n                `currency` TEXT NOT NULL, \n                PRIMARY KEY(`facilityId`))");
        database.execSQL("DROP TABLE IF EXISTS `plans`");
        prk.o.D(database, "CREATE TABLE IF NOT EXISTS `plans` (\n                `id` TEXT NOT NULL, \n                `transactionId` TEXT NOT NULL, \n                `facilityId` TEXT NOT NULL, \n                `merchantName` TEXT NOT NULL, \n                `merchantLogoUrl` TEXT, \n                `merchantLogoName` TEXT, \n                `startDateTime` INTEGER NOT NULL, \n                `updateDateTime` INTEGER NOT NULL, \n                `amount` INTEGER NOT NULL, \n                `fee` INTEGER NOT NULL, \n                `lateInterest` INTEGER NOT NULL, \n                `currency` TEXT NOT NULL, \n                `state` TEXT NOT NULL, \n                `amountChanged` INTEGER NOT NULL, \n                `cancellationOrigin` TEXT, \n                PRIMARY KEY(`id`))", "DROP TABLE IF EXISTS `repayments`", "CREATE TABLE IF NOT EXISTS `repayments` (\n                `planId` TEXT NOT NULL, \n                `index` INTEGER NOT NULL, \n                `dueDate` INTEGER NOT NULL, \n                `state` TEXT NOT NULL, \n                `currency` TEXT NOT NULL, \n                `paidDateTime` INTEGER, \n                `transactionIds` TEXT NOT NULL, \n                `amount` INTEGER NOT NULL, \n                `repaidAmount` INTEGER NOT NULL, \n                `fee` INTEGER NOT NULL, \n                `repaidFee` INTEGER NOT NULL, \n                `lateInterest` INTEGER NOT NULL, \n                `repaidLateInterest` INTEGER NOT NULL, \n                PRIMARY KEY(`index`, `planId`))", "CREATE INDEX IF NOT EXISTS `index_repayments_state` ON `repayments` (`state`)");
        database.execSQL("CREATE TABLE IF NOT EXISTS `plan_preferences` (\n                `planId` TEXT NOT NULL, \n                `planChangedNotificationConsumed` INTEGER NOT NULL, \n                PRIMARY KEY(`planId`))");
    }
}
