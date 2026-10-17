package m45;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends Migration {
    public e() {
        super(22, 23);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `loans` ADD COLUMN `interestOnly` TEXT DEFAULT NULL");
    }
}
