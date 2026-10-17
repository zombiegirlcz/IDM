package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class za extends Migration {
    public za() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `credit_lines`", "CREATE TABLE IF NOT EXISTS `credit_lines` (\n`uuid` TEXT NOT NULL,\n`state` TEXT NOT NULL,\n`amount` INTEGER NOT NULL,\n`currency` TEXT NOT NULL,\n`apr` REAL NOT NULL,\n`exampleMinimumRepayment` INTEGER NOT NULL,\n`exampleAccruedInterest` INTEGER NOT NULL,\n`monthlyIncome` TEXT DEFAULT NULL,\n`residentialStatus` TEXT DEFAULT NULL,\n`residence` TEXT DEFAULT NULL,\n`previousResidences` TEXT DEFAULT NULL,\n`title` TEXT DEFAULT NULL,\n`agreementUrl` TEXT DEFAULT NULL,\n`bankAccount` TEXT DEFAULT NULL,\n`employerDetail` TEXT DEFAULT NULL,\n`externalCardId` TEXT DEFAULT NULL,\nPRIMARY KEY(`uuid`))", "ALTER TABLE `auto_invests` ADD COLUMN `multiplier` REAL");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `credit_loans` ADD COLUMN `monthlyRentPayment` INTEGER DEFAULT NULL", "ALTER TABLE `credit_loans` ADD COLUMN `purpose` TEXT DEFAULT NULL", "ALTER TABLE `credit_loans` ADD COLUMN `employerName` TEXT DEFAULT NULL", "ALTER TABLE `credit_loans` ADD COLUMN `title` TEXT DEFAULT NULL");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `credit_loans` ADD COLUMN `email` TEXT DEFAULT NULL", "ALTER TABLE `credit_loans` ADD COLUMN `monthlyIncome` TEXT DEFAULT NULL", "ALTER TABLE `credit_loans` ADD COLUMN `residentialStatus` TEXT DEFAULT NULL", "ALTER TABLE `credit_loans` ADD COLUMN `residence` TEXT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `credit_loans` ADD COLUMN `previousResidences` TEXT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `credit_loans` ADD COLUMN `bankAccount` TEXT DEFAULT NULL");
    }
}
