package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 extends Migration {
    public u0() {
        super(59, 60);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `extra_attributes` ADD COLUMN `extra_attr_guardian_id` TEXT DEFAULT NULL");
    }
}
