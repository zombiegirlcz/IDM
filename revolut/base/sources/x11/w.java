package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class w extends Migration {
    public w() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `pricing_plan` ADD COLUMN `state` TEXT DEFAULT NULL", "ALTER TABLE `pricing_plan` ADD COLUMN `queuePosition` INTEGER DEFAULT NULL");
    }
}
