package n77;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends Migration {
    public b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_index_details` (`symbol` TEXT NOT NULL, `baseCurrency` TEXT, `shortDescription` TEXT, `description` TEXT, PRIMARY KEY(`symbol`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_index_details` (`symbol`,`baseCurrency`,`shortDescription`,`description`) SELECT `symbol`,`baseCurrency`,`shortDescription`,`description` FROM `index_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `index_details`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_index_details` RENAME TO `index_details`");
    }
}
