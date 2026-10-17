package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f174405c = new q();

    private q() {
        super(25, 26);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `limits`", "DROP TABLE IF EXISTS `plan_updates`", "CREATE TABLE IF NOT EXISTS `plan_updates` (\n`id` TEXT NOT NULL, \n`updateDateTime` INTEGER NOT NULL, \nPRIMARY KEY(`id`))");
        supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS plans");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `plans` (\n`id` TEXT NOT NULL, \n`facilityId` TEXT NOT NULL, \n`transactionId` TEXT NOT NULL, \n`merchantName` TEXT NOT NULL, \n`merchantLogoUrl` TEXT, \n`merchantLogoName` TEXT, \n`merchantCategory` TEXT, \n`startDateTime` INTEGER NOT NULL, \n`updateDateTime` INTEGER NOT NULL, \n`amount` INTEGER NOT NULL, \n`paidAmount` INTEGER NOT NULL, \n`remainingAmount` INTEGER NOT NULL, \n`revPoints` INTEGER, \n`fee` INTEGER NOT NULL, \n`currency` TEXT NOT NULL, \n`state` TEXT NOT NULL, \n`isLimitWithdrawn` INTEGER NOT NULL, \n`feeType` TEXT NOT NULL, \n`origin` TEXT NOT NULL, \n`countryCode` TEXT NOT NULL, \n`instalmentType` TEXT NOT NULL, \n`termFeeRate` TEXT NOT NULL, \n`minFeeAmount` INTEGER NOT NULL, \n`cancellationOrigin` TEXT, \n`rescheduleCount` INTEGER, \n`withdrawalTransactionId` TEXT, \n`feeDetails` TEXT NOT NULL, \nPRIMARY KEY(`id`))");
    }
}
