package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends Migration {
    public d0() {
        super(40, 41);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `search_index_state` (`id` TEXT NOT NULL, `value` INTEGER, PRIMARY KEY(`id`))");
    }
}
