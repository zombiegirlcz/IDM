package ol3;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f226320c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "\n                CREATE TABLE IF NOT EXISTS `contact` (\n                    `id` INTEGER NOT NULL, \n                    `point` TEXT NOT NULL, \n                    `displayedName` TEXT NOT NULL, \n                    `firstName` TEXT NOT NULL, \n                    `lastName` TEXT NOT NULL, \n                    `registeredAs` TEXT NOT NULL, \n                    `username` TEXT, \n                    `code` TEXT, \n                    `isRevolut` INTEGER NOT NULL, \n                    `isNewlyJoined` INTEGER NOT NULL, \n                    `joinDate` INTEGER, \n                    `settings` TEXT NOT NULL, \n                    `transactionsCount` INTEGER NOT NULL, \n                    `timestamp` INTEGER NOT NULL, \n                    `pictureUri` TEXT, \n                    `type` TEXT NOT NULL, \n                    `country` TEXT NOT NULL, \n                    `appMode` TEXT NOT NULL, \n                    PRIMARY KEY(`id`)\n                )\n                ", "\n            INSERT INTO `contact_copy` \n                (id, point, displayedName, firstName, lastName, registeredAs, username, code, isRevolut, isNewlyJoined, joinDate, settings, transactionsCount, timestamp, pictureUri, type, country, appMode) \n            SELECT \n                id, point, displayedName, firstName, lastName, registeredAs, username, code, isRevolut, isNewlyJoined, NULL, settings, transactionsCount, timestamp, pictureUri, type, country, appMode\n            FROM `contact`\n        ", "DROP TABLE `contact`");
        y.y(supportSQLiteDatabase, "ALTER TABLE `contact_copy` RENAME TO `contact`");
    }
}
