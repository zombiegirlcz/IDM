package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class k4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k4 f301903c = new k4();

    private k4() {
        super(Constants.TAG_EMV_L2_CHECKSUM, Constants.TAG_BOOT_LOADER_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_transaction_hash` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_display_rate` REAL DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_display_currency` TEXT DEFAULT NULL");
    }
}
