package qpj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends Migration {
    public l() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_trips` (`id` TEXT NOT NULL, `startDate` INTEGER NOT NULL, `endDate` INTEGER NOT NULL, `countryCode` TEXT NOT NULL, `transactionAdjustments` TEXT NOT NULL DEFAULT '', `state` TEXT NOT NULL DEFAULT 'DELETED', PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_trips` (`id`,`startDate`,`endDate`,`countryCode`) SELECT `id`,`startDate`,`endDate`,`countryCode` FROM `trips`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `trips`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_trips` RENAME TO `trips`");
    }
}
