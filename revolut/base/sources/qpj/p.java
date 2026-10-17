package qpj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends Migration {
    public p() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `custom_assets` (`id` TEXT NOT NULL, `category` TEXT NOT NULL, `attributes` TEXT NOT NULL, `value_history` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `state` TEXT NOT NULL, `currentValue_amount` INTEGER NOT NULL, `currentValue_currency` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `field_definitions` (`category` TEXT NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `component` TEXT NOT NULL, `required` INTEGER NOT NULL, `options` TEXT NOT NULL, `max_length` INTEGER, PRIMARY KEY(`category`, `name`))");
    }
}
