package is6;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Migration {
    public h() {
        super(25, 26);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_invoices` (`id` TEXT NOT NULL, `number` TEXT NOT NULL, `numberFormatted` TEXT NOT NULL, `numberPrefix` TEXT NOT NULL, `saleDate` INTEGER, `issueDate` INTEGER, `dueDate` INTEGER, `currency` TEXT NOT NULL, `status` TEXT NOT NULL, `total` TEXT NOT NULL, `subtotal` TEXT NOT NULL, `totalTax` TEXT NOT NULL, `customerId` TEXT, `customerDetails` TEXT, `supplierDetails` TEXT, `statusDetails` TEXT, `enabledPaymentMethods` TEXT NOT NULL, `enabledReminders` TEXT NOT NULL, `taxes` TEXT NOT NULL, `items` TEXT NOT NULL, `additionalNote` TEXT, `customerMessage` TEXT, `recurringInvoiceId` TEXT, `recurringSchedule` TEXT, `templateId` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_invoices` (`id`,`number`,`numberFormatted`,`numberPrefix`,`saleDate`,`issueDate`,`dueDate`,`currency`,`status`,`total`,`subtotal`,`totalTax`,`customerId`,`customerDetails`,`supplierDetails`,`statusDetails`,`enabledPaymentMethods`,`enabledReminders`,`taxes`,`items`,`additionalNote`,`customerMessage`,`recurringInvoiceId`,`recurringSchedule`,`templateId`) SELECT `id`,`number`,`numberFormatted`,`numberPrefix`,`saleDate`,`issueDate`,`dueDate`,`currency`,`status`,`total`,`subtotal`,`totalTax`,`customerId`,`customerDetails`,`supplierDetails`,`statusDetails`,`enabledPaymentMethods`,`enabledReminders`,`taxes`,`items`,`additionalNote`,`customerMessage`,`recurringInvoiceId`,`recurringSchedule`,`templateId` FROM `invoices`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `invoices`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_invoices` RENAME TO `invoices`");
    }
}
