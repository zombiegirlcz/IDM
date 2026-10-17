package qpj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uvj.a f248434c;

    public n() {
        super(6, 7);
        this.f248434c = new uvj.a();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `trips` ADD COLUMN `deleted` INTEGER NOT NULL DEFAULT false");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_trips` (`id` TEXT NOT NULL, `startDate` INTEGER, `endDate` INTEGER, `countryCode` TEXT NOT NULL, `transactionAdjustments` TEXT NOT NULL DEFAULT '', `createdDate` INTEGER NOT NULL DEFAULT 0, `deleted` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_trips` (`id`,`startDate`,`endDate`,`countryCode`,`transactionAdjustments`,`createdDate`) SELECT `id`,`startDate`,`endDate`,`countryCode`,`transactionAdjustments`,`createdDate` FROM `trips`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `trips`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_trips` RENAME TO `trips`");
        this.f248434c.onPostMigrate(sQLiteConnection);
    }
}
