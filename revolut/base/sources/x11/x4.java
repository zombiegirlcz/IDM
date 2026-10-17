package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class x4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x4 f302055c = new x4();

    private x4() {
        super(Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS, Constants.TAG_E4_CUSTOMER_DATA);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `instalment_plan_planId` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `instalment_plan_facilityId` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `instalment_plan_fee` INTEGER DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `instalment_plan_repaymentIndex` INTEGER DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `instalment_plan_repaymentCount` INTEGER DEFAULT NULL");
    }
}
