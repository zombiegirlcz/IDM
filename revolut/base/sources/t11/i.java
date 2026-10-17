package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Migration {
    public i() {
        super(313, 314);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `apm_contact_id` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `apm_contact_phone` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `apm_contact_type` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `apm_contact_displayName` TEXT DEFAULT NULL");
    }
}
