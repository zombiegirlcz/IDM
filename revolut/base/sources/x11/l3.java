package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class l3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l3 f301915c = new l3();

    private l3() {
        super(Constants.TAG_BATTERY_STATE, Constants.TAG_POWER_OFF_TIMEOUT);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `beneficiary_legalName` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `beneficiary_firstName` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `beneficiary_lastName` TEXT DEFAULT NULL");
        prk.o.C(supportSQLiteDatabase, "ALTER TABLE `transactions` ADD COLUMN `beneficiary_username` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `beneficiary_code` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `beneficiary_email` TEXT DEFAULT NULL");
    }
}
