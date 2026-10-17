package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a2 f301780c = new a2();

    private a2() {
        super(Constants.TAG_PAYMENT_APP_CLESS_VERSION, 167);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `loan_repaymentType` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_loanName` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_regularLoanAmount` INTEGER DEFAULT NULL");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `transactions` ADD COLUMN `loan_regularInterestAmount` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_outstandingLoanAmount` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_outstandingInterestAmount` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `loan_overdueLoanAmount` INTEGER DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `loan_overdueInterestAmount` INTEGER DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `loan_penaltyAmount` INTEGER DEFAULT NULL");
    }
}
