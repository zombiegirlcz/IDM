package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f230191c = new e0();

    private e0() {
        super(38, 39);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_contributors` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `method` TEXT NOT NULL,\n    `sector` INTEGER NOT NULL,\n    `currency` TEXT NOT NULL,\n    `asset` TEXT NOT NULL,\n    `pnl` TEXT NOT NULL,\n    `returns` REAL NOT NULL,\n    `closedOn` TEXT,\n    `ref` TEXT DEFAULT null,\n    `openingPrice` TEXT DEFAULT null,\n    `positionId` TEXT DEFAULT null,\n    `quantity` TEXT DEFAULT null,\n     PRIMARY KEY(`asset_type`, `time_span`, `method`, `sector`, `currency`, `asset`)\n)", "CREATE INDEX IF NOT EXISTS `index_complex_analytics_combined_contributors_asset_type_time_span_method_sector_currency`\nON `complex_analytics_combined_contributors` (`asset_type`, `time_span`, `method`, `sector`, `currency`)");
    }
}
