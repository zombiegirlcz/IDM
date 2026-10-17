package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j4 f301893c = new j4();

    private j4() {
        super(Constants.TAG_EMV_L2_VERSION, Constants.TAG_EMV_L2_CHECKSUM);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `push_to_card_first_name` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `push_to_card_last_name` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `push_to_card_state` TEXT DEFAULT NULL");
        prk.o.C(supportSQLiteDatabase, "ALTER TABLE `transactions` ADD COLUMN `push_to_card_last_four` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `push_to_card_scheme` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `push_to_card_logo_url` TEXT DEFAULT NULL");
    }
}
