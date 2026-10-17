package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends Migration {
    public p0() {
        super(54, 55);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `defi_metadata` (`defi_metadata_leg_id` TEXT NOT NULL, `defi_metadata_account_id` TEXT NOT NULL, `defi_metadata_account_scoped_asset_id` TEXT NOT NULL, `defi_metadata_counterpart_account_scoped_asset_id` TEXT, `defi_metadata_rate` TEXT, `defi_metadata_amount_value` TEXT NOT NULL, `defi_metadata_amount_currency` TEXT NOT NULL, `defi_metadata_fee_value` TEXT, `defi_metadata_fee_currency` TEXT, `defi_metadata_counterpart_value` TEXT, `defi_metadata_counterpart_currency` TEXT, `defi_metadata_bundle_id` TEXT, `defi_metadata_bundle_link` TEXT, `defi_metadata_on_chain_tx_hash` TEXT, `defi_metadata_on_chain_tx_link` TEXT, `defi_metadata_recipient_wallet_address` TEXT, `defi_metadata_recipient_link` TEXT, PRIMARY KEY(`defi_metadata_leg_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_defi_metadata_defi_metadata_account_scoped_asset_id` ON `defi_metadata` (`defi_metadata_account_scoped_asset_id`)");
    }
}
