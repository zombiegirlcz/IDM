package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f230221c = new w();

    private w() {
        super(30, 31);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE `complex_analytics_combined_performance_chart_point`", "DROP TABLE `complex_analytics_combined_performance_chart`", "\n                CREATE TABLE IF NOT EXISTS `complex_analytics_combined_performance_chart` (\n                    `time_span` TEXT NOT NULL,\n                    `start` INTEGER NOT NULL,\n                    `end` INTEGER NOT NULL,\n                    `last_modified` INTEGER NOT NULL,\n                    `asset_types_id` TEXT NOT NULL,\n                    `currency` TEXT NOT NULL,\n                    PRIMARY KEY(`asset_types_id`, `time_span`, `currency`)\n                 )\n            ");
        supportSQLiteDatabase.execSQL("\n                CREATE TABLE IF NOT EXISTS `complex_analytics_combined_performance_chart_point` (\n                    `time_span` TEXT NOT NULL,\n                    `timestamp` INTEGER NOT NULL,\n                    `returns` REAL NOT NULL,\n                    `totalReturns` REAL NOT NULL,\n                    `benchmark` REAL,\n                    `pnl` TEXT NOT NULL,\n                    `asset_types_id` TEXT NOT NULL,\n                    `currency` TEXT NOT NULL,\n                    PRIMARY KEY(`time_span`, `timestamp`, `asset_types_id`, `currency`),\n                    FOREIGN KEY(`time_span`, `asset_types_id`, `currency`)\n                        REFERENCES `complex_analytics_combined_performance_chart`(`time_span`, `asset_types_id`, `currency`)\n                    ON UPDATE NO ACTION ON DELETE CASCADE\n                )\n            ");
    }
}
