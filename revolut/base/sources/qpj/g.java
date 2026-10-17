package qpj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends Migration {
    public g() {
        super(15, 16);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `field_definitions` ADD COLUMN `supports_smart_estimation` INTEGER NOT NULL DEFAULT 0");
    }
}
