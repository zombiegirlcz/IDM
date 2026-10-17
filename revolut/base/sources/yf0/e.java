package yf0;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Migration {
    public e() {
        super(13, 14);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DELETE FROM `faq`", "DELETE FROM `settings`", "DROP TABLE `light_faq`");
        prk.o.C(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `light_faq` (`type` TEXT NOT NULL, `key` TEXT NOT NULL, `title` TEXT NOT NULL, `parentKey` TEXT NOT NULL, `contentStyle` TEXT NOT NULL, `deeplink` TEXT NOT NULL, `language` TEXT NOT NULL, `index` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`key`))", "CREATE INDEX `index_light_faq_key` ON `light_faq` (`key`)", "CREATE INDEX `index_light_faq_parentKey` ON `light_faq` (`parentKey`)");
    }
}
