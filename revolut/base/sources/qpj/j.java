package qpj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends Migration {
    public j() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `balance_history` (`date` INTEGER NOT NULL, `source` TEXT NOT NULL, `balance` INTEGER NOT NULL, PRIMARY KEY(`date`, `source`))");
    }
}
