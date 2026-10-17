package yf0;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Migration {
    public b() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `light_faq` (`type` TEXT NOT NULL, `key` TEXT NOT NULL, `title` TEXT NOT NULL, `parentKey` TEXT NOT NULL, `contentStyle` TEXT NOT NULL, `deeplink` TEXT NOT NULL, `language` TEXT NOT NULL, PRIMARY KEY(`key`))", "CREATE INDEX `index_light_faq_key` ON `light_faq` (`key`)", "CREATE INDEX `index_light_faq_parentKey` ON `light_faq` (`parentKey`)");
    }
}
