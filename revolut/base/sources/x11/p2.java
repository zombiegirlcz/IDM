package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class p2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2 f301964c = new p2();

    private p2() {
        super(179, 180);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `loan_regularFeeAmount` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_regularPrincipalAmount` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_outstandingFeeAmount` INTEGER DEFAULT NULL");
        prk.o.C(supportSQLiteDatabase, "ALTER TABLE `transactions` ADD COLUMN `loan_outstandingPrincipalAmount` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_overdueFeeAmount` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_overduePrincipalAmount` INTEGER DEFAULT NULL");
    }
}
