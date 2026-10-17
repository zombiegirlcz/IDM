package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import x11.w8;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w8 f267068c;

    public m() {
        super(318, 319);
        this.f267068c = new w8();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_transaction_custom_category` (`id` TEXT NOT NULL, `walletId` TEXT NOT NULL, `title` TEXT NOT NULL, `image` TEXT NOT NULL, `color` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_transaction_custom_category` (`id`,`walletId`,`title`,`image`,`color`) SELECT `id`,`walletId`,`title`,`image`,`color` FROM `transaction_custom_category`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `transaction_custom_category`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_transaction_custom_category` RENAME TO `transaction_custom_category`");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_transaction_predefined_category` (`id` TEXT NOT NULL, `walletId` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_transaction_predefined_category` (`id`,`walletId`) SELECT `id`,`walletId` FROM `transaction_predefined_category`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `transaction_predefined_category`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_transaction_predefined_category` RENAME TO `transaction_predefined_category`");
        this.f267068c.onPostMigrate(sQLiteConnection);
    }
}
