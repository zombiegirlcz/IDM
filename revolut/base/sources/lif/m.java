package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends Migration {
    public m() {
        super(22, 23);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transfer_users` ADD COLUMN `transfer_user_individual_type` TEXT DEFAULT NULL");
    }
}
