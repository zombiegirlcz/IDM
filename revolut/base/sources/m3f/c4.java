package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class c4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c4 f202393c = new c4();

    private c4() {
        super(80, 81);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `instrument_tickers` ADD COLUMN `pricePrecise` TEXT", "ALTER TABLE `instrument_tickers` ADD COLUMN `previousPrecise` TEXT", "ALTER TABLE `instrument_tickers` ADD COLUMN `previousClosePrecise` TEXT");
        supportSQLiteDatabase.execSQL("ALTER TABLE `instrument_tickers` ADD COLUMN `lastClosePrecise` TEXT");
    }
}
