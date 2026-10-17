package is6;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Migration {
    public k() {
        super(28, 29);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `acquiring_payments` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `created_at` TEXT NOT NULL, `updated_at` TEXT, `settle_on` TEXT, `type` TEXT NOT NULL, `payment_method` TEXT NOT NULL, `card` TEXT, `sepa_last_four` TEXT, `customer` TEXT, `order_id` TEXT, `billing_address` TEXT, `external_transaction_id` TEXT, `acquiring_reference_number` TEXT, `amount_amount` INTEGER NOT NULL, `amount_currency` TEXT NOT NULL, `tip_amount_amount` INTEGER NOT NULL, `tip_amount_currency` TEXT NOT NULL, `surcharge_amount_amount` INTEGER, `surcharge_amount_currency` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_acquiring_payments_created_at` ON `acquiring_payments` (`created_at`)");
    }
}
