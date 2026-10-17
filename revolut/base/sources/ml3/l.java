package ml3;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ol3.g f206607c;

    public l() {
        super(8, 9);
        this.f206607c = new ol3.g();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_contact` (`id` INTEGER NOT NULL, `point` TEXT NOT NULL, `displayedName` TEXT NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `registeredAs` TEXT NOT NULL, `username` TEXT, `code` TEXT, `isRevolut` INTEGER NOT NULL, `isNewlyJoined` INTEGER NOT NULL, `joinDate` INTEGER, `transactionsCount` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `pictureUri` TEXT, `type` TEXT NOT NULL, `country` TEXT NOT NULL, `appMode` TEXT NOT NULL, `paidPlan` TEXT, `customerType` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_contact` (`id`,`point`,`displayedName`,`firstName`,`lastName`,`registeredAs`,`username`,`code`,`isRevolut`,`isNewlyJoined`,`joinDate`,`transactionsCount`,`timestamp`,`pictureUri`,`type`,`country`,`appMode`,`paidPlan`,`customerType`) SELECT `id`,`point`,`displayedName`,`firstName`,`lastName`,`registeredAs`,`username`,`code`,`isRevolut`,`isNewlyJoined`,`joinDate`,`transactionsCount`,`timestamp`,`pictureUri`,`type`,`country`,`appMode`,`paidPlan`,`customerType` FROM `contact`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `contact`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_contact` RENAME TO `contact`");
        this.f206607c.onPostMigrate(sQLiteConnection);
    }
}
