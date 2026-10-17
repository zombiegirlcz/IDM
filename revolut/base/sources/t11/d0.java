package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends Migration {
    public d0() {
        super(336, 337);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_state` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_counterparty_id` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_counterparty_state` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_counterparty_hostingType` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_counterparty_hostingVerification` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_counterparty_hostingPlatform` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_counterparty_ownershipState` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_counterparty_ownershipMethod` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_counterparty_ownershipPayload` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_counterparty_details_type` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_counterparty_details_name` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_counterparty_details_surname` TEXT DEFAULT NULL");
    }
}
