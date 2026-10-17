package ml3;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends Migration {
    public m() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `contact` ADD COLUMN `birthday` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `remote_contacts_extra` ADD COLUMN `birthday` TEXT DEFAULT NULL");
    }
}
