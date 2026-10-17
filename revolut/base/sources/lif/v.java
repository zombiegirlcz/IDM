package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends Migration {
    public v() {
        super(30, 31);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `extra_attributes` ADD COLUMN `extra_attr_payment_authorisation_id` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `extra_attributes` ADD COLUMN `extra_attr_payment_authorisation_type` TEXT DEFAULT NULL");
    }
}
