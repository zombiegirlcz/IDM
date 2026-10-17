package n77;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends Migration {
    public a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `index_details` (`symbol` TEXT NOT NULL, `baseCurrency` TEXT, `shortDescription` TEXT NOT NULL, `description` TEXT NOT NULL, PRIMARY KEY(`symbol`))");
    }
}
