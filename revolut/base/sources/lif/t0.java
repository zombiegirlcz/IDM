package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 extends Migration {
    public t0() {
        super(58, 59);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `extra_attributes` ADD COLUMN `extra_attr_transfer_reasons_catalogue` TEXT DEFAULT NULL");
    }
}
