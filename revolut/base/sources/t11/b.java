package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import x11.l8;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l8 f267062c;

    public b() {
        super(301, 302);
        this.f267062c = new l8();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_institutions` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `logo` TEXT NOT NULL, `logoType` TEXT NOT NULL, `paymentInitiation` INTEGER NOT NULL, `infoProvider` INTEGER NOT NULL, `requirements` TEXT NOT NULL, `mandateInitiation` INTEGER NOT NULL, `system` TEXT NOT NULL, `recurrenceSupported` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_institutions` (`id`,`name`,`logo`,`logoType`,`paymentInitiation`,`infoProvider`,`requirements`,`mandateInitiation`,`system`,`recurrenceSupported`) SELECT `id`,`name`,`logo`,`logoType`,`paymentInitiation`,`infoProvider`,`requirements`,`mandateInitiation`,`system`,`recurrenceSupported` FROM `institutions`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `institutions`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_institutions` RENAME TO `institutions`");
        this.f267062c.onPostMigrate(sQLiteConnection);
    }
}
