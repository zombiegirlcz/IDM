package rdd;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends Migration {
    public b() {
        super(19, 20);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `vaults` ADD COLUMN `savingsAccountId` TEXT DEFAULT NULL");
    }
}
