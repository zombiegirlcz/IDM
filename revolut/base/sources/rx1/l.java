package rx1;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends Migration {
    public l() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `wero_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `phone` TEXT, `email` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, `alias` TEXT, `contactName` TEXT, PRIMARY KEY(`idValue`))");
    }
}
