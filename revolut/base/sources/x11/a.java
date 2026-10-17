package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f301777c = new a();

    private a() {
        super(100, 101);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "\n            CREATE TABLE `contact_copy` \n            (`id` INTEGER NOT NULL,\n                `point` TEXT NOT NULL,\n                `displayedName` TEXT NOT NULL,\n                `registeredAs` TEXT NOT NULL,\n                `username` TEXT,\n                `isRevolut` INTEGER DEFAULT 0 NOT NULL,\n                `isPremium` INTEGER DEFAULT 0 NOT NULL,\n                `settings` TEXT NOT NULL DEFAULT \"[]\",\n                `transactionsCount` INTEGER DEFAULT 0 NOT NULL,\n                `timestamp` INTEGER DEFAULT 0 NOT NULL,\n                `pictureUri` TEXT,\n                `type` TEXT NOT NULL,                \n                `country` TEXT NOT NULL,\n                PRIMARY KEY(`id`))\n            ", "INSERT INTO `contact_copy` (id, point, displayedName, registeredAs, username, isRevolut, isPremium, settings, transactionsCount, timestamp, pictureUri, type, country) \nSELECT id, point, displayedName, registeredAs, username, isRevolut, isPremium, settings, transactionsCount, timestamp, pictureUri, type, country FROM `contact`", "DROP TABLE contact");
        supportSQLiteDatabase.execSQL("ALTER TABLE contact_copy RENAME TO contact");
    }
}
