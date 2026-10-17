package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class i5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i5 f301881c = new i5();

    private i5() {
        super(Constants.TAG_OS_VERSION, Constants.TAG_MPOS_MODULE_STATE);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `stocks_historical_rates`", "DROP TABLE IF EXISTS `candle_sticks`");
    }
}
