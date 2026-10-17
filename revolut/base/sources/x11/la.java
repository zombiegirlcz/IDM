package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class la extends Migration {
    public la() {
        super(43, 44);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DELETE FROM `trades`", "ALTER TABLE `trades` ADD COLUMN `completed_at` INTEGER NOT NULL DEFAULT 0", "ALTER TABLE `trades` ADD COLUMN `created_at` INTEGER NOT NULL DEFAULT 0");
    }
}
