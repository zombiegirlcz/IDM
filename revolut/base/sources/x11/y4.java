package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class y4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y4 f302067c = new y4();

    private y4() {
        super(Constants.TAG_E4_CUSTOMER_DATA, Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `transactions` ADD COLUMN `recipient_appMode` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `sender_appMode` TEXT DEFAULT NULL");
    }
}
