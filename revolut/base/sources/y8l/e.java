package y8l;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends Migration {
    public e() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `money_requests` ADD COLUMN `settings_editableAmount` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `money_requests` ADD COLUMN `settings_editableReference` INTEGER DEFAULT NULL");
    }
}
