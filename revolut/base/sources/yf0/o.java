package yf0;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Migration {
    public o() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `faq` ADD COLUMN `specialisationQueue` TEXT DEFAULT NULL", "ALTER TABLE `faq` ADD COLUMN `chatEntrySuggestions` TEXT DEFAULT NULL");
    }
}
