package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class t5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t5 f302014c = new t5();

    private t5() {
        super(Constants.TAG_F5, 246);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `junior_p2p_transfer_request_id` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `junior_p2p_transfer_request_state` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `junior_p2p_transfer_request_sender_first_name` TEXT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `junior_p2p_transfer_request_sender_last_name` TEXT DEFAULT NULL");
    }
}
