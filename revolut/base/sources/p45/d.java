package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f232815c = new d();

    private d() {
        super(16, 17);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "DELETE FROM loans", "DROP TABLE IF EXISTS `loan_repayments`", "CREATE TABLE IF NOT EXISTS `loan_repayments` (\n                `loanId` TEXT NOT NULL,\n                `id` TEXT NOT NULL,\n                `transactionId` TEXT NOT NULL,\n                `repaymentDateTime` TEXT NOT NULL,\n                `currency` TEXT NOT NULL,\n                `amount` INTEGER NOT NULL,\n                `type` TEXT NOT NULL,\n                `clientId` TEXT,\n                `firstName` TEXT,\n                `lastName` TEXT,\n                `principal` INTEGER,\n                `accruedInterest` INTEGER,\n                `lateRepaymentInterest` INTEGER,\n                PRIMARY KEY(`id`, `loanId`)\n            )");
    }
}
