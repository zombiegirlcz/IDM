package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class bb extends Migration {
    public bb() {
        super(50, 51);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DELETE FROM `stocks_last_rates`", "ALTER TABLE `stocks_last_rates` ADD COLUMN `delayed` INTEGER NOT NULL DEFAULT 1");
    }
}
