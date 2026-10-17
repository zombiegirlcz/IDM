package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h3 f301868c = new h3();

    private h3() {
        super(Constants.TAG_ATMEL_SERIAL, 194);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `salary_advance_fee` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `salary_advance_id` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `salary_advance_currency` TEXT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `salary_advance_payDate` INTEGER DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `salary_advance_estimatedPayDate` INTEGER DEFAULT NULL");
    }
}
