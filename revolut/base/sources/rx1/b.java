package rx1;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends Migration {
    public b() {
        super(10, 11);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `iris_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `descriptor` TEXT NOT NULL, `descriptorValue` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, PRIMARY KEY(`idValue`))");
    }
}
