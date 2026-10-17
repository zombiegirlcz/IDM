package is6;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends Migration {
    public l() {
        super(29, 30);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `acquiring_payments` ADD COLUMN `fees` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `acquiring_payments` ADD COLUMN `rolling_reserves` TEXT DEFAULT NULL");
    }
}
