package lbj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends Migration {
    public g() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_details_business_registration_number` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_details_address_country` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_details_address_city` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_details_address_line1` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_details_address_line2` TEXT DEFAULT NULL");
    }
}
