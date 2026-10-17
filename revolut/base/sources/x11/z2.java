package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class z2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z2 f302078c = new z2();

    private z2() {
        super(187, 188);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `loan_sortCode` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_accountNumber` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_debtorName` TEXT DEFAULT NULL");
    }
}
