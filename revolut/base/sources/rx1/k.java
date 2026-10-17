package rx1;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends Migration {
    public k() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `blik_contacts_temp` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `phone` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, PRIMARY KEY(`idValue`))");
    }
}
