package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f230196c = new h();

    private h() {
        super(17, 18);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `complex_analytics_performance_chart_point`", "CREATE TABLE IF NOT EXISTS `complex_analytics_performance_chart_point` (\n`asset_type` TEXT NOT NULL,\n`time_span` TEXT NOT NULL,\n`currency` TEXT NOT NULL,\n`method` TEXT NOT NULL,\n`benchmark_index` TEXT NOT NULL,\n`portfolio_id` TEXT NOT NULL,\n`timestamp` INTEGER NOT NULL, \n`returns` REAL NOT NULL,\n`totalReturns` REAL NOT NULL,\n`benchmark` REAL,\n`pnl` TEXT NOT NULL, \nPRIMARY KEY(`asset_type`, `time_span`, `currency`, `method`, `benchmark_index`, `portfolio_id`, `timestamp`),\nFOREIGN KEY(`asset_type`, `time_span`, `currency`, `method`, `benchmark_index`, `portfolio_id`)\nREFERENCES `complex_analytics_performance_chart`(`asset_type`, `time_span`, `currency`, `method`, `benchmark_index`, `portfolio_id`) \nON UPDATE NO ACTION ON DELETE CASCADE )");
    }
}
