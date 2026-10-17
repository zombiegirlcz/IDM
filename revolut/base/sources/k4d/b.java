package k4d;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends Migration {
    public b() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `alert_items` ADD COLUMN `type` TEXT NOT NULL DEFAULT 'TARGET_PRICE'");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `alert_items` ADD COLUMN `note` TEXT NOT NULL DEFAULT ''");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `alert_items` ADD COLUMN `frequency` TEXT DEFAULT 'ONE_TIME'");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `alert_items` ADD COLUMN `percentage` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `alert_items` ADD COLUMN `time_range` TEXT DEFAULT NULL");
    }
}
