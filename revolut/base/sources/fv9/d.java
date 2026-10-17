package fv9;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends Migration {
    public d() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `payments_social_reactions` ADD COLUMN `metadata` TEXT DEFAULT NULL");
    }
}
