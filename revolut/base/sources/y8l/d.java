package y8l;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends Migration {
    public d() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `money_requests` ADD COLUMN `registered_identity_id` TEXT DEFAULT NULL");
    }
}
