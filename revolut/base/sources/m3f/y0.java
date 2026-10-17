package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y0 f202521c = new y0();

    private y0() {
        super(146, 147);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `stocks_historical_rates`", "DROP TABLE IF EXISTS `candle_sticks`");
    }
}
