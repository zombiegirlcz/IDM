package tuf;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends Migration {
    public c() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `purchased_transit_tickets` ADD COLUMN `isDiscounted` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `purchased_transit_tickets` ADD COLUMN `canBeUsedForExtension` INTEGER DEFAULT NULL");
    }
}
