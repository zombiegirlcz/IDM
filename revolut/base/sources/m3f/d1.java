package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes8.dex */
public final class d1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1 f202396c = new d1();

    private d1() {
        super(150, ISO7816.TAG_SM_EXPECTED_LENGTH);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "DROP table IF EXISTS `etf_stats`", "DROP table IF EXISTS `fund_stats`", "DROP table IF EXISTS `instrument_stats`");
        supportSQLiteDatabase.execSQL("DROP table IF EXISTS `bond_stats`");
    }
}
