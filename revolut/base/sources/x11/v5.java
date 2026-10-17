package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class v5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v5 f302036c = new v5();

    private v5() {
        super(Constants.TAG_BLE_FIRMWARE_VERSION, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `money_requests` ADD COLUMN `payer_pda_recipient_country` TEXT DEFAULT NULL", "ALTER TABLE `money_requests` ADD COLUMN `requester_pda_recipient_country` TEXT DEFAULT NULL");
    }
}
