package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes.dex */
public final class v extends Migration {
    public v() {
        super(328, 329);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `beneficiaries` ADD COLUMN `identification` TEXT DEFAULT NULL");
    }
}
