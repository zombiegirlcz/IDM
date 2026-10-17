package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f230222c = new x();

    private x() {
        super(31, 32);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "\n                CREATE TABLE IF NOT EXISTS `complex_analytics_combined_pnl_chart` (\n                    `user_id` TEXT NOT NULL,\n                    `asset_types_id` TEXT NOT NULL, \n                    `time_span` TEXT NOT NULL, \n                    `currency` TEXT NOT NULL, \n                    `start` INTEGER NOT NULL, \n                    `end` INTEGER NOT NULL,\n                    PRIMARY KEY(`user_id`, `asset_types_id`, `time_span`, `currency`)\n                )\n            ", "\n                CREATE TABLE IF NOT EXISTS `complex_analytics_combined_pnl_chart_point` (\n                    `user_id` TEXT NOT NULL,\n                    `asset_types_id` TEXT NOT NULL,\n                    `time_span` TEXT NOT NULL,\n                    `currency` TEXT NOT NULL,\n                    `point_start` INTEGER NOT NULL,\n                    `point_end` INTEGER NOT NULL,\n                    `net_sell` TEXT NOT NULL,\n                    `dividends` TEXT,\n                    `cumulative` TEXT NOT NULL,\n                    PRIMARY KEY(`user_id`, `asset_types_id`, `time_span`, `currency`),\n                    FOREIGN KEY(`user_id`, `asset_types_id`, `time_span`, `currency`)\n                        REFERENCES `complex_analytics_combined_pnl_chart`(`user_id`, `asset_types_id`, `time_span`, `currency`)\n                    ON UPDATE NO ACTION ON DELETE CASCADE\n                )\n            ");
    }
}
