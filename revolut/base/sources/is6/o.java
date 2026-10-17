package is6;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends Migration {
    public o() {
        super(32, 33);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `acquiring_orders` (`id` TEXT NOT NULL, `created_at` TEXT NOT NULL, `updated_at` TEXT NOT NULL, `status` TEXT, `channel` TEXT, `capture_mode` TEXT, `merchant_order_external_reference` TEXT, `description` TEXT, `readable_identifier` TEXT NOT NULL, `customer_note` TEXT, `custom_fields` TEXT, `customers` TEXT, `primary_payment` TEXT, `location` TEXT, `created_by_user` TEXT, `initiation_page` TEXT, `device` TEXT, `invoice` TEXT, `amount_amount` INTEGER NOT NULL, `amount_currency` TEXT NOT NULL, `tip_amount_amount` INTEGER, `tip_amount_currency` TEXT, `outstanding_amount_amount` INTEGER, `outstanding_amount_currency` TEXT, `discount_total_amount_amount` INTEGER, `discount_total_amount_currency` TEXT, `sub_total_amount_amount` INTEGER, `sub_total_amount_currency` TEXT, `tax_total_amount_amount` INTEGER, `tax_total_amount_currency` TEXT, `service_charge_amount_amount` INTEGER, `service_charge_amount_currency` TEXT, `surcharge_amount_amount` INTEGER, `surcharge_amount_currency` TEXT, `surcharge_tax_amount_amount` INTEGER, `surcharge_tax_amount_currency` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_acquiring_orders_created_at` ON `acquiring_orders` (`created_at`)");
    }
}
