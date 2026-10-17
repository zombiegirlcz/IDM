package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class d5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d5 f301821c = new d5();

    private d5() {
        super(Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION, 232);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `money_requests` ADD COLUMN `payer_country` TEXT DEFAULT NULL", "ALTER TABLE `money_requests` ADD COLUMN `requester_country` TEXT DEFAULT NULL");
    }
}
