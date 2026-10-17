package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes13.dex */
public final class x0 extends Migration {
    public x0() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_deposits` ADD COLUMN `counterparty_address` TEXT DEFAULT NULL");
    }
}
