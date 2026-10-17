package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class g4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g4 f202417c = new g4();

    private g4() {
        super(84, 85);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DELETE FROM `stocks_historical_rates`", "DELETE FROM `candle_sticks`");
    }
}
