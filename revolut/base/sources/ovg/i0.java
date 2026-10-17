package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f230199c = new i0();

    private i0() {
        super(41, 42);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `complex_analytics_combined_performance_chart_point`", "DROP TABLE IF EXISTS `complex_analytics_combined_performance_chart`", "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_performance_chart` (\n    `time_span` TEXT NOT NULL,\n    `start` INTEGER NOT NULL,\n    `end` INTEGER NOT NULL,\n    `last_modified` INTEGER NOT NULL,\n    `asset_types_id` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `method` TEXT NOT NULL,\n    `benchmark` TEXT NOT NULL,\n    PRIMARY KEY(`asset_types_id`, `time_span`, `currency`, `method`, `benchmark`)\n)");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `complex_analytics_combined_performance_chart_point` (\n    `time_span` TEXT NOT NULL,\n    `timestamp` INTEGER NOT NULL,\n    `returns` REAL NOT NULL,\n    `totalReturns` REAL NOT NULL,\n    `benchmark` REAL,\n    `pnl` TEXT NOT NULL,\n    `asset_types_id` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `method` TEXT NOT NULL,\n    `benchmark_ref` TEXT NOT NULL,\n    PRIMARY KEY(`time_span`, `timestamp`, `asset_types_id`, `currency`, `method`, `benchmark_ref`),\n    FOREIGN KEY(`time_span`, `asset_types_id`, `currency`, `method`, `benchmark_ref`)\n    REFERENCES `complex_analytics_combined_performance_chart`(`time_span`, `asset_types_id`, `currency`, `method`, `benchmark`)\n    ON UPDATE NO ACTION ON DELETE CASCADE\n)");
    }
}
