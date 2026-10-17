package w8f;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8f.a f295644c;

    public a() {
        super(1, 2);
        this.f295644c = new z8f.a();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_transfer_instruments` (`account_id` TEXT NOT NULL DEFAULT '', `ref` TEXT NOT NULL, `name` TEXT NOT NULL, `symbol` TEXT NOT NULL, `currency` TEXT NOT NULL, PRIMARY KEY(`account_id`, `ref`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_transfer_instruments` (`ref`,`name`,`symbol`,`currency`) SELECT `ref`,`name`,`symbol`,`currency` FROM `transfer_instruments`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `transfer_instruments`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_transfer_instruments` RENAME TO `transfer_instruments`");
        this.f295644c.onPostMigrate(sQLiteConnection);
    }
}
