package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f230223c = new y();

    private y() {
        super(32, 33);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `complex_analytics_performance_chart_point`", "DROP TABLE IF EXISTS `complex_analytics_performance_chart`", "CREATE TABLE IF NOT EXISTS `complex_analytics_performance_chart` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `method` TEXT NOT NULL,\n    `benchmark` TEXT NOT NULL DEFAULT '',\n    `portfolio_id` TEXT NOT NULL,\n    `start` INTEGER NOT NULL,\n    `end` INTEGER NOT NULL,\n    `last_modified` INTEGER NOT NULL DEFAULT 0,\n    PRIMARY KEY(`asset_type`, `time_span`, `currency`, `method`, `benchmark`, `portfolio_id`)\n)");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `complex_analytics_performance_chart_point` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `method` TEXT NOT NULL,\n    `benchmark_ref` TEXT NOT NULL DEFAULT '',\n    `portfolio_id` TEXT NOT NULL,\n    `timestamp` INTEGER NOT NULL, \n    `returns` REAL NOT NULL,\n    `totalReturns` REAL NOT NULL,\n    `benchmark` REAL,\n    `pnl` TEXT NOT NULL, \n    PRIMARY KEY(`asset_type`, `time_span`, `currency`, `method`, `benchmark_ref`, `portfolio_id`, `timestamp`),\n    FOREIGN KEY(`asset_type`, `time_span`, `currency`, `method`, `benchmark_ref`, `portfolio_id`)\n    REFERENCES `complex_analytics_performance_chart`(`asset_type`, `time_span`, `currency`, `method`, `benchmark`, `portfolio_id`) \n    ON UPDATE NO ACTION ON DELETE CASCADE \n)");
    }
}
