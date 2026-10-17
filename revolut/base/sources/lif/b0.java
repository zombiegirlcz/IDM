package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends Migration {
    public b0() {
        super(38, 39);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE VIRTUAL TABLE IF NOT EXISTS `search_indexes` USING FTS4(`leg_id` TEXT NOT NULL, `content_index` TEXT NOT NULL)");
    }
}
