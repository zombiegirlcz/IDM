package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 extends Migration {
    public v0() {
        super(60, 61);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `defi_metadata` ADD COLUMN `defi_metadata_fiat_amount_value` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `defi_metadata` ADD COLUMN `defi_metadata_fiat_amount_currency` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `defi_metadata` ADD COLUMN `defi_metadata_fee_fiat_amount_value` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `defi_metadata` ADD COLUMN `defi_metadata_fee_fiat_amount_currency` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `defi_metadata` ADD COLUMN `defi_metadata_counterpart_fiat_amount_value` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `defi_metadata` ADD COLUMN `defi_metadata_counterpart_fiat_amount_currency` TEXT DEFAULT NULL");
    }
}
