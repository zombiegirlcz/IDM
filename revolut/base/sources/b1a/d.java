package b1a;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends Migration {
    public d() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_recurring_split` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `participants` TEXT NOT NULL, `comment` TEXT, `created_date` INTEGER NOT NULL, `updated_date` INTEGER NOT NULL, `source_type` TEXT NOT NULL, `source_reference_id` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_recurring_split` (`id`,`state`,`participants`,`comment`,`created_date`,`updated_date`,`source_type`,`source_reference_id`) SELECT `id`,`state`,`participants`,`comment`,`created_date`,`updated_date`,`source_type`,`source_reference_id` FROM `recurring_split`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `recurring_split`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_recurring_split` RENAME TO `recurring_split`");
    }
}
