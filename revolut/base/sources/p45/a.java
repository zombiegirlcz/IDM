package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f232812c = new a();

    private a() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `loan_details_shard`", "CREATE TABLE IF NOT EXISTS `loan_details_shard` (\n                `id` TEXT NOT NULL,\n                `durationMonths` INTEGER NOT NULL,\n                `repaymentDay` INTEGER NOT NULL,\n                `outstandingPrincipal` INTEGER NOT NULL,\n                `outstandingBalance` INTEGER NOT NULL,\n                `accruedInterest` INTEGER NOT NULL,\n                `accruedFee` INTEGER NOT NULL,\n                `oneTimeFee` INTEGER NOT NULL,\n                `monthlyRepayment` INTEGER NOT NULL,\n                `isInCooldownPeriod` INTEGER NOT NULL,\n                `unavailableFeatures` TEXT NOT NULL,\n                `borrowers` TEXT NOT NULL,\n                `backupCard` TEXT,\n                `repaymentConfig` TEXT NOT NULL,\n                PRIMARY KEY(`id`)\n             )");
    }
}
