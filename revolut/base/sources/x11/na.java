package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class na extends Migration {
    public na() {
        super(44, 45);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `contact` ADD COLUMN `timestamp` INTEGER NOT NULL DEFAULT 0", "UPDATE `contact` SET `timestamp` = `transactionsCount` WHERE `transactionsCount` > 0");
    }
}
