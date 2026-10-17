package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class g5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g5 f301856c = new g5();

    private g5() {
        super(Constants.TAG_EMV_ICC_CONFIG_VERSION, Constants.TAG_EMV_NFC_CONFIG_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `doxgety_reward_rate` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `doxgety_reward_promised_amount_amount` INTEGER", "ALTER TABLE `transactions` ADD COLUMN `doxgety_reward_promised_amount_currency` TEXT");
    }
}
