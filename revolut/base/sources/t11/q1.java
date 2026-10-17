package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class q1 extends Migration {
    public q1() {
        super(378, 379);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `institutions` ADD COLUMN `description` TEXT DEFAULT NULL");
    }
}
