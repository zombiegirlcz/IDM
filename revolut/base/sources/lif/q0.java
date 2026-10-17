package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 extends Migration {
    public q0() {
        super(55, 56);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `defi_metadata` ADD COLUMN `defi_metadata_chain` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `defi_metadata` ADD COLUMN `defi_metadata_sender_wallet_address` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `defi_metadata` ADD COLUMN `defi_metadata_sender_link` TEXT DEFAULT NULL");
    }
}
