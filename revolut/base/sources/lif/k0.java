package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 extends Migration {
    public k0() {
        super(47, 48);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `merchants` ADD COLUMN `merchant_location_latitude` REAL DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `merchants` ADD COLUMN `merchant_location_longitude` REAL DEFAULT NULL");
    }
}
