package ls6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f199647c = new w();

    private w() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `invoices` (`id` TEXT NOT NULL, `number` TEXT NOT NULL, `saleDate` INTEGER NOT NULL, `issueDate` INTEGER NOT NULL, `dueDate` INTEGER NOT NULL, `currency` TEXT NOT NULL,`status` TEXT NOT NULL,`total` TEXT NOT NULL,`subtotal` TEXT NOT NULL,`totalTax` TEXT NOT NULL,`customerId` TEXT,`customerDetails` TEXT,`enabledPaymentMethods` TEXT NOT NULL,`taxes` TEXT NOT NULL,`items` TEXT NOT NULL,PRIMARY KEY(`id`))", "ALTER TABLE `sales` ADD COLUMN `invoice` TEXT");
    }
}
