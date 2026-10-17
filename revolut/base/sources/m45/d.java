package m45;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends Migration {
    public d() {
        super(20, 21);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `loans` ADD COLUMN `refurbishment` TEXT DEFAULT NULL");
    }
}
