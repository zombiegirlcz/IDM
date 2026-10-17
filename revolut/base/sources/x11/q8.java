package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class q8 extends Migration {
    public q8() {
        super(30, 31);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `current_product` ADD COLUMN `startDate` INTEGER DEFAULT NULL", "ALTER TABLE `current_product` ADD COLUMN `endDate` INTEGER DEFAULT NULL");
    }
}
