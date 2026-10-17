package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n1 f301939c = new n1();

    private n1() {
        super(155, Constants.EMVTag.TAG_9C_TRANSACTION_TYPE);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `instrument_tickers_summary` ADD COLUMN `unitVolume` INTEGER", "ALTER TABLE `instrument_tickers_summary` ADD COLUMN `fiveYearRange` TEXT");
    }
}
