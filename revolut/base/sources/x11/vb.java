package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class vb extends Migration {
    public vb() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `credit_lines` ADD COLUMN `dailyInterest` INTEGER DEFAULT NULL", "ALTER TABLE `credit_lines` ADD COLUMN `interestAccrued` INTEGER DEFAULT NULL", "ALTER TABLE `credit_lines` ADD COLUMN `exampleUtilizedAmount` INTEGER DEFAULT NULL");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `user_action` (`uuid` TEXT NOT NULL, `actionKey` TEXT NOT NULL, `value` TEXT NOT NULL, `type` TEXT NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uuid`))");
    }
}
