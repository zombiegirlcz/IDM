package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f230211c = new o0();

    private o0() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `complex_analytics_pnl` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `portfolio_id` TEXT NOT NULL,\n    `interval` TEXT NOT NULL,\n    `start` INTEGER NOT NULL,\n    `end` INTEGER NOT NULL,\n    PRIMARY KEY(`asset_type`, `time_span`, `currency`, `portfolio_id`, `interval`)\n)", "CREATE TABLE IF NOT EXISTS `complex_analytics_pnl_point` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `portfolio_id` TEXT NOT NULL,\n    `interval` TEXT NOT NULL,\n    `point_start` INTEGER NOT NULL,\n    `point_end` INTEGER NOT NULL,\n    `net_sell` TEXT NOT NULL,\n    `dividends` TEXT NOT NULL,\n    `cumulative` TEXT NOT NULL, PRIMARY KEY(`asset_type`, `time_span`, `currency`, `portfolio_id`, `interval`, `point_start`, `point_end`), FOREIGN KEY(`asset_type`, `time_span`, `currency`, `portfolio_id`, `interval`) REFERENCES `complex_analytics_pnl`(`asset_type`, `time_span`, `currency`, `portfolio_id`, `interval`)\n    ON UPDATE NO ACTION ON DELETE CASCADE\n)");
    }
}
