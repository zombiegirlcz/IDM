package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f202414c = new g1();

    private g1() {
        super(153, Constants.EMVTag.TAG_9A_TRANSACTION_DATE);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `trading_trades` RENAME COLUMN `bond_coupon` TO 'coupon'", "ALTER TABLE `trading_trades` RENAME COLUMN `bond_redemption` TO 'redemption'");
    }
}
