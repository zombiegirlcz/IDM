package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class p8 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p8 f301970c = new p8();

    private p8() {
        super(309, 310);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER TABLE `transactions` ADD COLUMN `loan_stampDuty_overAccruedInterest` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_stampDuty_overLateInterest` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_stampDuty_overLateFee` INTEGER DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `loan_stampDuty_total` INTEGER DEFAULT NULL");
    }
}
