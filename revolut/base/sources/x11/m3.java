package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m3 f301926c = new m3();

    private m3() {
        super(Constants.TAG_POWER_OFF_TIMEOUT, 199);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `candles_cryptocommodities_chart`", "DROP TABLE IF EXISTS `candles_cryptocommodities_point`");
    }
}
