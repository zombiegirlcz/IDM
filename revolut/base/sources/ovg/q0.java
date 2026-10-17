package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class q0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f230215c = new q0();

    private q0() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `complex_analytics_contributors`", "CREATE TABLE IF NOT EXISTS `complex_analytics_contributors` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `method` TEXT NOT NULL,\n    `sector` INTEGER NOT NULL,\n    `portfolio_id` TEXT NOT NULL,\n    `asset` TEXT NOT NULL,\n    `pnl` TEXT NOT NULL,\n    `returns` REAL NOT NULL,\n    `closedOn` TEXT, PRIMARY KEY(`asset_type`, `time_span`, `method`, `sector`, `portfolio_id`, `asset`)\n)", "CREATE INDEX IF NOT EXISTS `index_complex_analytics_contributors_asset_type_time_span_method_sector_portfolio_id`\nON `complex_analytics_contributors` (`asset_type`, `time_span`, `method`, `sector`, `portfolio_id`)");
    }
}
