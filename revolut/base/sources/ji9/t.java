package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f174408c = new t();

    private t() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DELETE FROM plan_updates", "DELETE FROM plans", "DROP TABLE IF EXISTS `repayments`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `repayments`(\n                `planId` TEXT NOT NULL, \n                `index` INTEGER NOT NULL, \n                `dueDate` INTEGER NOT NULL, \n                `amount` INTEGER NOT NULL, \n                `fee` INTEGER NOT NULL,\n                 `state` TEXT NOT NULL, \n                 `currency` TEXT NOT NULL, \n                 `paidDateTime` INTEGER, \n                 `transactionIds` TEXT NOT NULL, \n                 `repaidFee` INTEGER NOT NULL, \n                 `repaidAmount` INTEGER NOT NULL, \n                 PRIMARY KEY(`index`, `planId`))");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_repayments_state` ON `repayments` (`state`)");
    }
}
