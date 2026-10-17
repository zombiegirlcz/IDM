package qo5;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends Migration {
    public o() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_addresses` ADD COLUMN `flags` TEXT NOT NULL DEFAULT '[]'");
    }
}
