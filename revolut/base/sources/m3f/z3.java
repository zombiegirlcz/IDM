package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class z3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z3 f202529c = new z3();

    private z3() {
        super(78, 79);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DELETE FROM `instrument_tickers` WHERE `lastClean` IS NOT NULL", "DELETE FROM `bond_stats`", "DELETE FROM `bond_details`");
    }
}
