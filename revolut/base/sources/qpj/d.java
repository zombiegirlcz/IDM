package qpj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends Migration {
    public d() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_custom_assets` (`id` TEXT NOT NULL, `category` TEXT NOT NULL, `attributes` TEXT NOT NULL, `value_history` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `state` TEXT NOT NULL, `value_source` TEXT NOT NULL DEFAULT 'USER', `smart_estimation_enabled` INTEGER NOT NULL DEFAULT 0, `currentValue_amount` INTEGER, `currentValue_currency` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_custom_assets` (`id`,`category`,`attributes`,`value_history`,`created_at`,`updated_at`,`state`,`value_source`,`smart_estimation_enabled`,`currentValue_amount`,`currentValue_currency`) SELECT `id`,`category`,`attributes`,`value_history`,`created_at`,`updated_at`,`state`,`value_source`,`smart_estimation_enabled`,`currentValue_amount`,`currentValue_currency` FROM `custom_assets`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `custom_assets`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_custom_assets` RENAME TO `custom_assets`");
    }
}
