package ls6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f199627c = new a();

    private a() {
        super(10, 11);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "DROP TABLE `orders`", "CREATE TABLE IF NOT EXISTS `orders` (`id` TEXT NOT NULL, `description` TEXT NOT NULL DEFAULT '',`state` TEXT NOT NULL, `type` TEXT NOT NULL, `channel` TEXT NOT NULL,`amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `allowed_payment_methods` TEXT,`payment_link` TEXT, `invoice` TEXT, `related_orders` TEXT, `original_order_details` TEXT, `related_transactions` TEXT, `created_at` INTEGER NOT NULL,`updated_at` INTEGER NOT NULL, `expires_at` INTEGER NOT NULL, PRIMARY KEY(`id`))", "DROP TABLE `invoices`");
        y.y(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `invoices` (`id` TEXT NOT NULL, `number` TEXT NOT NULL, `numberFormatted` TEXT NOT NULL, `numberPrefix` TEXT NOT NULL, `saleDate` INTEGER NOT NULL, `issueDate` INTEGER NOT NULL, `dueDate` INTEGER NOT NULL, `currency` TEXT NOT NULL,`status` TEXT NOT NULL,`total` TEXT NOT NULL,`subtotal` TEXT NOT NULL,`totalTax` TEXT NOT NULL,`customerId` TEXT,`customerDetails` TEXT,`supplierDetails` TEXT,`statusDetails` TEXT,`enabledPaymentMethods` TEXT NOT NULL,`taxes` TEXT NOT NULL,`items` TEXT NOT NULL,PRIMARY KEY(`id`))");
    }
}
