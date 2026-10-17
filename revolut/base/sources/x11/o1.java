package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1 f301950c = new o1();

    private o1() {
        super(Constants.EMVTag.TAG_9C_TRANSACTION_TYPE, 157);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `recently_viewed_instrument_tmp` (`symbol` TEXT NOT NULL, `last_seen` INTEGER NOT NULL, PRIMARY KEY(`symbol`))", "INSERT INTO `recently_viewed_instrument_tmp` (symbol, last_seen) SELECT symbol, last_seen FROM recently_viewed_instrument", "DROP TABLE recently_viewed_instrument");
        supportSQLiteDatabase.execSQL("ALTER TABLE recently_viewed_instrument_tmp RENAME TO recently_viewed_instrument");
    }
}
