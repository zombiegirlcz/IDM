package yf0;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Migration {
    public p() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `faq` ADD COLUMN `scope` TEXT NOT NULL DEFAULT ''", "DROP INDEX `index_faq_key_placement_language`", "CREATE UNIQUE INDEX `index_faq_key_placement_language` ON `faq` (`key`, `placement`, `language`, `scope`)");
    }
}
