package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class u extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f232832c = new u();

    private u() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `loan_details` \n                (`id` TEXT NOT NULL, \n                `startDateTime` TEXT NOT NULL,\n                `finalRepaymentDate` TEXT NOT NULL,\n                `currency` TEXT NOT NULL,\n                `durationMonths` INTEGER NOT NULL,\n                `repaymentDay` INTEGER NOT NULL,\n                `principal` INTEGER NOT NULL,\n                `outstandingPrincipal` INTEGER NOT NULL,\n                `outstandingBalance` INTEGER NOT NULL,\n                `accruedInterest` INTEGER NOT NULL,\n                `accruedFee` INTEGER NOT NULL,\n                `oneTimeFee` INTEGER NOT NULL,\n                `monthlyRepayment` INTEGER NOT NULL,\n                `aprPercentage` TEXT NOT NULL,\n                `annualInterestRatePercentage` TEXT NOT NULL,\n                `countryCode` TEXT NOT NULL,\n                `isInCooldownPeriod` INTEGER NOT NULL,\n                `isRefinancing` INTEGER NOT NULL,\n                `autoPayRepaymentSource` TEXT,\n                `backupCardRepaymentSource` TEXT,\n                `unavailableFeatures` TEXT NOT NULL,\n                PRIMARY KEY(`id`))");
    }
}
