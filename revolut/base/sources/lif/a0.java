package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends Migration {
    public a0() {
        super(37, 38);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `extra_attributes` ADD COLUMN `extra_attr_mcy_top_up_funding_status` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `extra_attributes` ADD COLUMN `extra_attr_mcy_top_up_funds_transfer_expire_time` INTEGER DEFAULT NULL");
    }
}
