package qpj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends Migration {
    public q() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `custom_assets` ADD COLUMN `value_source` TEXT NOT NULL DEFAULT 'USER'");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `custom_assets` ADD COLUMN `smart_estimation_enabled` INTEGER NOT NULL DEFAULT 0");
    }
}
