package lbj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends Migration {
    public f() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_id` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_address` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_state` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_hostingType` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_hostingVerification` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_hostingPlatform` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_ownershipState` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_ownershipMethod` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_ownershipPayload` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_details_type` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_details_name` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_details_surname` TEXT DEFAULT NULL");
    }
}
