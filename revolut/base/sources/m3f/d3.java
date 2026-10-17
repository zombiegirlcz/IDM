package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class d3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d3 f202398c = new d3();

    private d3() {
        super(58, 59);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        wp5.y.z(supportSQLiteDatabase, "database", "ALTER TABLE `instrument_tickers` ADD COLUMN `lastYtm` TEXT DEFAULT NULL", "ALTER TABLE `instrument_tickers` ADD COLUMN `lastCloseYtm` TEXT DEFAULT NULL", "ALTER TABLE `instrument_tickers` ADD COLUMN `previousYtm` TEXT DEFAULT NULL");
        wp5.y.y(supportSQLiteDatabase, "ALTER TABLE `instrument_tickers` ADD COLUMN `previousCloseYtm` TEXT DEFAULT NULL");
    }
}
