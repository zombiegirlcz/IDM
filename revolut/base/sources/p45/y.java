package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class y extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f232836c = new y();

    private y() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `loans`", "CREATE TABLE IF NOT EXISTS `loans` (\n                `id` TEXT NOT NULL,\n                `name` TEXT NOT NULL,\n                `disbursalDate` TEXT NOT NULL,\n                `finalRepaymentDate` TEXT NOT NULL,\n                `currency` TEXT NOT NULL,\n                `countryCode` TEXT NOT NULL,\n                `principal` INTEGER NOT NULL,\n                `totalRepaid` INTEGER NOT NULL,\n                `totalToRepay` INTEGER NOT NULL,\n                `percentageRepaid` INTEGER NOT NULL,\n                `state` TEXT NOT NULL,\n                `product` TEXT NOT NULL,\n                `repaidCount` INTEGER NOT NULL,\n                `interestRate` TEXT NOT NULL,\n                `nextInstalment` TEXT,\n                `lastPaidRepayment` TEXT,\n                `config` TEXT NOT NULL,\n                 PRIMARY KEY(`id`)\n                )", "DROP TABLE IF EXISTS `loan_details`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `loan_details_shard` (\n                `id` TEXT NOT NULL,\n                `durationMonths` INTEGER NOT NULL,\n                `repaymentDay` INTEGER NOT NULL,\n                `outstandingPrincipal` INTEGER NOT NULL,\n                `outstandingBalance` INTEGER NOT NULL,\n                `accruedInterest` INTEGER NOT NULL,\n                `accruedFee` INTEGER NOT NULL,\n                `oneTimeFee` INTEGER NOT NULL,\n                `monthlyRepayment` INTEGER NOT NULL,\n                `isInCooldownPeriod` INTEGER NOT NULL,\n                `unavailableFeatures` TEXT NOT NULL,\n                `borrowers` TEXT NOT NULL,\n                `backupCard` TEXT,\n                PRIMARY KEY (`id`)\n            )");
    }
}
