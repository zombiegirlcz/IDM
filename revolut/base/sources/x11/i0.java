package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends Migration {
    public i0() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `credit_loans`", "CREATE TABLE IF NOT EXISTS `credit_loans` (\n`uuid` TEXT NOT NULL,\n`state` TEXT NOT NULL,\n`amount` INTEGER NOT NULL,\n`currency` TEXT NOT NULL,\n`createdDate` TEXT,\n`transactionId` TEXT,\n`expireDate` TEXT,\n`term` INTEGER NOT NULL,\n`monthlyRentPayment` INTEGER,\n`purpose` TEXT DEFAULT NULL,\n`employerName` TEXT DEFAULT NULL,\n`title` TEXT DEFAULT NULL,\n`email` TEXT DEFAULT NULL,\n`monthlyIncome` TEXT DEFAULT NULL,\n`residentialStatus` TEXT DEFAULT NULL,\n`residence` TEXT DEFAULT NULL,\n`previousResidences` TEXT DEFAULT NULL,\n`bankAccount` TEXT DEFAULT NULL,\n`completedAt` TEXT DEFAULT NULL,\n`agreementUrl` TEXT DEFAULT NULL,\n`lender` TEXT DEFAULT NULL,\nPRIMARY KEY(`uuid`))");
    }
}
