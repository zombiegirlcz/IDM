package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes8.dex */
public final class h1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1 f202420c = new h1();

    private h1() {
        super(Constants.EMVTag.TAG_9A_TRANSACTION_DATE, 155);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `instrument_tickers`", "DROP TABLE IF EXISTS `instrument_tickers_summary`", "DROP TABLE IF EXISTS `instruments`");
        supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `recently_viewed_instrument`");
    }
}
