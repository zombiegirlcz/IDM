package rx1;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends Migration {
    public f() {
        super(15, 16);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `breb_contacts` ADD COLUMN `issuingEntityName` TEXT DEFAULT NULL");
    }
}
