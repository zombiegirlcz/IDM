package o91;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f223057c = new e();

    private e() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `pae_payment_required_attributes_table` (\n    `id` TEXT NOT NULL,\n    `paymentId` TEXT NOT NULL,\n    `title` TEXT NOT NULL,\n    `description` TEXT,\n    PRIMARY KEY(`id`, `paymentId`),\n    FOREIGN KEY(`paymentId`) REFERENCES `pae_direct_debits_table`(`id`) ON DELETE CASCADE\n)", "CREATE INDEX IF NOT EXISTS `index_pae_payment_required_attributes_table_paymentId` \nON `pae_payment_required_attributes_table`(`paymentId`)", "CREATE TABLE IF NOT EXISTS `pae_payment_required_attribute_values_table` (\n    `id` TEXT NOT NULL,\n    `paymentId` TEXT NOT NULL,\n    `value` TEXT NOT NULL,\n    PRIMARY KEY(`id`, `paymentId`),\n    FOREIGN KEY(`id`, `paymentId`) REFERENCES `pae_payment_required_attributes_table`(`id`, `paymentId`) ON DELETE CASCADE\n)");
    }
}
