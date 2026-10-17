package rx1;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends Migration {
    public g() {
        super(18, 19);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `qvik_contacts` ADD COLUMN `settings_blockIncomingMoneyRequests` INTEGER DEFAULT NULL");
    }
}
