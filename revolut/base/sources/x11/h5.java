package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class h5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h5 f301870c = new h5();

    private h5() {
        super(Constants.TAG_EMV_NFC_CONFIG_VERSION, Constants.TAG_OS_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `junior_junior_user_id` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `junior_transfer_intent` TEXT DEFAULT NULL");
    }
}
