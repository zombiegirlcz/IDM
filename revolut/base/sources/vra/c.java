package vra;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f291544c = new c();

    private c() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `card_owners_tmp` (`id` TEXT NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `label` TEXT, `email` TEXT, `type` TEXT NOT NULL, `card` TEXT NOT NULL, `twoFaRequired` INTEGER NOT NULL, PRIMARY KEY(`id`))", "\n                INSERT INTO `card_owners_tmp` (`id`, `firstName`, `lastName`, `label`, `email`, `type`, `card`, `twoFaRequired`)\n                    SELECT `id`, `firstName`, `lastName`, `label`, `email`, (CASE `ownCard` WHEN 1 THEN 'SELF' ELSE 'OTHER' END), `card`, `twoFaRequired` \n                FROM `card_owners`\n                ", "DROP TABLE `card_owners`");
        supportSQLiteDatabase.execSQL("ALTER TABLE `card_owners_tmp` RENAME TO `card_owners`");
    }
}
