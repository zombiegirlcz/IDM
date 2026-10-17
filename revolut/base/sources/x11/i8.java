package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class i8 extends Migration {
    public i8() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `auto_invests` (\n`id` TEXT NOT NULL,\n`isEnabled` INTEGER NOT NULL,\n`targetId` TEXT,\n`targetName` TEXT,\n`targetType` TEXT,\n`dailySpendAmount` INTEGER,\n`dailySpendCcy` TEXT,\n`percentage` REAL,\n`strategy` TEXT,\nPRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `money_boxes` (\n`id` TEXT NOT NULL,\n`state` INTEGER NOT NULL,\n`goal` INTEGER,\n`pocketId` TEXT NOT NULL,\n`estimate` INTEGER,\nPRIMARY KEY(`id`))", "DROP TABLE IF EXISTS `recurring_payments`");
        prk.o.C(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `recurring_payments` (\n`id` TEXT NOT NULL,\n`state` TEXT NOT NULL,\n`type` TEXT NOT NULL,\n`receiver` TEXT,\n`speed` TEXT,\n`startDate` TEXT,\n`nextDate` TEXT,\n`period` TEXT,\n`recurring` INTEGER,\n`estimated` INTEGER,\n`autoExchangeEnabled` INTEGER,\n`fee` TEXT,\n`sourceCurrency` TEXT,\n`currency` TEXT NOT NULL,\n`amount` INTEGER,\n`title` TEXT,\n`description` TEXT,\n`recieverInfoBeneficiary` TEXT,\n`recieverInfoRecipient` TEXT,\n`recieverInfoCreditor` TEXT,\n`day` INTEGER NOT NULL,\nPRIMARY KEY(`id`))", "DROP TABLE IF EXISTS `credit_lines`", "CREATE TABLE IF NOT EXISTS `credit_lines` (\n`uuid` TEXT NOT NULL,\n`state` TEXT NOT NULL,\n`amount` INTEGER NOT NULL,\n`currency` TEXT NOT NULL,\n`apr` REAL NOT NULL,\n`exampleMinimumRepayment` INTEGER NOT NULL,\n`exampleAccruedInterest` INTEGER NOT NULL,\n`monthlyIncome` TEXT NOT NULL,\n`residentialStatus` TEXT NOT NULL,\n`residence` TEXT,\n`previousResidences` TEXT NOT NULL,\n`title` TEXT NOT NULL,\n`bankAccount` TEXT NOT NULL,\n`externalCardId` TEXT NOT NULL,\nPRIMARY KEY(`uuid`))");
    }
}
