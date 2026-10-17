package is6;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends Migration {
    public m() {
        super(30, 31);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `orders` ADD COLUMN `channel_group` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `orders` ADD COLUMN `merchant_order_ext_ref` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `orders` ADD COLUMN `sub_total_amount_amount` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `orders` ADD COLUMN `sub_total_amount_currency` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `orders` ADD COLUMN `tax_total_amount_amount` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `orders` ADD COLUMN `tax_total_amount_currency` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `orders` ADD COLUMN `tip_amount_amount` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `orders` ADD COLUMN `tip_amount_currency` TEXT DEFAULT NULL");
    }
}
