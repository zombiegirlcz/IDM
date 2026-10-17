package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends Migration {
    public w() {
        super(31, 32);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `calculated_balance_state` (`id` TEXT NOT NULL, `value` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
