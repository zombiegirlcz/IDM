package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends Migration {
    public r() {
        super(27, 28);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `extra_attributes` ADD COLUMN `extra_attr_can_be_marked_as_subscription` INTEGER DEFAULT NULL");
    }
}
