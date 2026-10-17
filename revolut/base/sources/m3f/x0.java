package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes8.dex */
public final class x0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0 f202515c = new x0();

    private x0() {
        super(145, 146);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `instrument_details`", "DROP TABLE IF EXISTS `etf_details`", "DROP TABLE IF EXISTS `bond_details`");
        prk.o.D(supportSQLiteDatabase, "DROP TABLE IF EXISTS `cfd_details`", "DROP TABLE IF EXISTS `fund_details`", "DROP TABLE IF EXISTS `instrument_governance`", "DROP TABLE IF EXISTS `instrument_details_recommendations`");
    }
}
