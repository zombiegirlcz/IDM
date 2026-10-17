package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends Migration {
    public q2() {
        super(17, 18);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DELETE FROM `holdings`", "ALTER TABLE `holdings` ADD COLUMN `stock_holding` TEXT");
    }
}
