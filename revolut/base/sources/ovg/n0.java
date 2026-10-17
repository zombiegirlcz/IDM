package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n0 f230209c = new n0();

    private n0() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `complex_analytics_performance_chart` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `method` TEXT NOT NULL,\n    `benchmark_index` TEXT NOT NULL,\n    `start` INTEGER NOT NULL,\n    `end` INTEGER NOT NULL,\n    PRIMARY KEY(`asset_type`, `time_span`, `currency`, `method`, `benchmark_index`)\n)", "CREATE TABLE IF NOT EXISTS `complex_analytics_performance_chart_point` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `method` TEXT NOT NULL,\n    `benchmark_index` TEXT NOT NULL,\n    `timestamp` INTEGER NOT NULL,\n    `returns` REAL NOT NULL,\n    `totalReturns` REAL NOT NULL,\n    `benchmark` REAL,\n    PRIMARY KEY(`asset_type`, `time_span`, `currency`, `method`, `benchmark_index`, `timestamp`),\n    FOREIGN KEY(`asset_type`, `time_span`, `currency`, `method`, `benchmark_index`)\n    REFERENCES `complex_analytics_performance_chart`(`asset_type`, `time_span`, `currency`, `method`, `benchmark_index`) \n    ON UPDATE NO ACTION ON DELETE CASCADE\n)");
    }
}
