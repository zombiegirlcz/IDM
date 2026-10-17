package tuf;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends Migration {
    public b() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `purchased_transit_tickets` ADD COLUMN `activatedAt` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `purchased_transit_tickets` ADD COLUMN `controlNumber` TEXT DEFAULT NULL");
    }
}
