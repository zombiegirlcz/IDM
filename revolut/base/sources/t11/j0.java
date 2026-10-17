package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class j0 extends Migration {
    public j0() {
        super(343, 344);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `recurring_payments` ADD COLUMN `sourcePocketId` TEXT DEFAULT NULL");
    }
}
