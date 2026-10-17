package rx1;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yx1.f f258014c;

    public h() {
        super(1, 2);
        this.f258014c = new yx1.f();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_bizum_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `phone` TEXT, `email` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, `alias` TEXT, `contactName` TEXT, PRIMARY KEY(`idValue`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_bizum_contacts` (`id`,`idValue`,`phone`,`email`,`photoUri`,`state`,`alias`,`contactName`) SELECT `id`,`idValue`,`phone`,`email`,`photoUri`,`state`,`alias`,`contactName` FROM `apm_contacts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `apm_contacts`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_bizum_contacts` RENAME TO `bizum_contacts`");
        this.f258014c.onPostMigrate(sQLiteConnection);
    }
}
