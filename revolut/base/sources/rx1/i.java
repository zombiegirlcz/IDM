package rx1;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends Migration {
    public i() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `multibanco_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `phone` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, `contactName` TEXT, PRIMARY KEY(`idValue`))");
    }
}
