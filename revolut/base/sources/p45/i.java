package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f232820c = new i();

    private i() {
        super(21, 22);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "DELETE FROM loans", "DROP TABLE IF EXISTS `loan_details_shard`", "CREATE TABLE IF NOT EXISTS `loan_details_shard` (\n                `id` TEXT NOT NULL,\n                `durationMonths` INTEGER NOT NULL,\n                `repaymentDay` INTEGER NOT NULL,\n                `outstandingPrincipal` INTEGER NOT NULL,\n                `rescheduledOutstandingPrincipal` INTEGER,\n                `outstandingBalance` INTEGER NOT NULL,\n                `accruedInterest` TEXT NOT NULL,\n                `accruedFee` TEXT NOT NULL,\n                `oneTimeFee` TEXT NOT NULL,\n                `monthlyRepayment` INTEGER NOT NULL,\n                `isInCooldownPeriod` INTEGER NOT NULL,\n                `unavailableFeatures` TEXT NOT NULL,\n                `borrowers` TEXT NOT NULL,\n                `backupCard` TEXT, \n                `repaymentConfig` TEXT NOT NULL, \n                PRIMARY KEY(`id`)\n            )");
    }
}
