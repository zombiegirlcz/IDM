package is6;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls6.p f168132c;

    public q() {
        super(34, 35);
        this.f168132c = new ls6.p();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_acquiring_payments` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `created_at` TEXT NOT NULL, `updated_at` TEXT, `settle_on` TEXT, `type` TEXT NOT NULL, `payment_method` TEXT NOT NULL, `card` TEXT, `sepa_last_four` TEXT, `fees` TEXT, `rolling_reserves` TEXT, `customer` TEXT, `order_id` TEXT, `billing_address` TEXT, `acquiring_reference_number` TEXT, `amount_amount` INTEGER NOT NULL, `amount_currency` TEXT NOT NULL, `tip_amount_amount` INTEGER NOT NULL, `tip_amount_currency` TEXT NOT NULL, `surcharge_amount_amount` INTEGER, `surcharge_amount_currency` TEXT, `net_amount_amount` INTEGER, `net_amount_currency` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_acquiring_payments` (`id`,`state`,`created_at`,`updated_at`,`settle_on`,`type`,`payment_method`,`card`,`sepa_last_four`,`fees`,`rolling_reserves`,`customer`,`order_id`,`billing_address`,`acquiring_reference_number`,`amount_amount`,`amount_currency`,`tip_amount_amount`,`tip_amount_currency`,`surcharge_amount_amount`,`surcharge_amount_currency`,`net_amount_amount`,`net_amount_currency`) SELECT `id`,`state`,`created_at`,`updated_at`,`settle_on`,`type`,`payment_method`,`card`,`sepa_last_four`,`fees`,`rolling_reserves`,`customer`,`order_id`,`billing_address`,`acquiring_reference_number`,`amount_amount`,`amount_currency`,`tip_amount_amount`,`tip_amount_currency`,`surcharge_amount_amount`,`surcharge_amount_currency`,`net_amount_amount`,`net_amount_currency` FROM `acquiring_payments`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `acquiring_payments`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_acquiring_payments` RENAME TO `acquiring_payments`");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_acquiring_payments_created_at` ON `acquiring_payments` (`created_at`)");
        this.f168132c.onPostMigrate(sQLiteConnection);
    }
}
