package yf0;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Migration {
    public a() {
        super(10, 11);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE `faq`", "CREATE TABLE `faq` (`key` TEXT NOT NULL, `title` TEXT NOT NULL, `content` TEXT NOT NULL, `plane_content` TEXT NOT NULL, `placement` TEXT NOT NULL, `weight` INTEGER NOT NULL, `relatedItems` TEXT NOT NULL, `language` TEXT NOT NULL, `userCountry` TEXT NOT NULL, `actions` TEXT NOT NULL, `specialisationQueue` TEXT, `chatEntrySuggestions` TEXT, `contentStyle` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)", "CREATE UNIQUE INDEX `index_faq_key_placement_language_content_style` ON `faq` (`key`, `placement`, `language`, `contentStyle`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX `index_faq_key` ON `faq` (`key`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX `index_faq_placement` ON `faq` (`placement`)");
    }
}
