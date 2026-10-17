package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class r5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r5 f301992c = new r5();

    private r5() {
        super(Constants.TAG_F3_BUILD_CONFIGURATION, Constants.TAG_F4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `money_requests` ADD COLUMN `payer_app_mode` TEXT DEFAULT NULL", "ALTER TABLE `money_requests` ADD COLUMN `requester_app_mode` TEXT DEFAULT NULL");
    }
}
