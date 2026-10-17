package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w1 f302040c = new w1();

    private w1() {
        super(162, Constants.TAG_ACE_LAYER_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `money_requests` ADD COLUMN `payer_username` TEXT DEFAULT NULL", "ALTER TABLE `money_requests` ADD COLUMN `requester_username` TEXT DEFAULT NULL");
    }
}
