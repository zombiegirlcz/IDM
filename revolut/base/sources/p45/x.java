package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class x extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f232835c = new x();

    private x() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `loan_details`", "CREATE TABLE IF NOT EXISTS `loan_details` (\n                `id` TEXT NOT NULL,\n                `startDateTime` TEXT NOT NULL,\n                `finalRepaymentDate` TEXT NOT NULL,\n                `currency` TEXT NOT NULL,\n                `durationMonths` INTEGER NOT NULL,\n                `repaymentDay` INTEGER NOT NULL,\n                `principal` INTEGER NOT NULL,\n                `outstandingPrincipal` INTEGER NOT NULL,\n                `outstandingBalance` INTEGER NOT NULL,\n                `accruedInterest` INTEGER NOT NULL,\n                `accruedFee` INTEGER NOT NULL,\n                `oneTimeFee` INTEGER NOT NULL,\n                `monthlyRepayment` INTEGER NOT NULL,\n                `aprPercentage` TEXT NOT NULL,\n                `annualInterestRatePercentage` TEXT NOT NULL,\n                `countryCode` TEXT NOT NULL,\n                `isInCooldownPeriod` INTEGER NOT NULL,\n                `isRefinancing` INTEGER NOT NULL,\n                `unavailableFeatures` TEXT NOT NULL,\n                `interestRate` TEXT NOT NULL,\n                `borrowers` TEXT NOT NULL,\n                `backupCard` TEXT,\n                PRIMARY KEY(`id`)\n            )");
    }
}
