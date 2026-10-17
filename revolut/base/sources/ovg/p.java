package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f230212c = new p();

    private p() {
        super(24, 25);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        wp5.y.z(supportSQLiteDatabase, "db", "DROP TABLE `complex_analytics_combined_total_value_chart_point`", "DROP TABLE `complex_analytics_combined_total_value_chart`", "CREATE TABLE `complex_analytics_combined_total_value_chart` (\n    `user_id` TEXT NOT NULL,\n    `asset_types_id` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `start` INTEGER NOT NULL,\n    `end` INTEGER NOT NULL,\n    `net_top_up` TEXT,\n    `total_return` TEXT,\n    `chart_details_type` TEXT NOT NULL,\n    PRIMARY KEY(`user_id`, `asset_types_id`, `time_span`, `currency`, `chart_details_type`)\n)");
        wp5.y.y(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_total_value_chart_point` (\n    `user_id` TEXT NOT NULL,\n    `asset_types_id` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `timestamp` INTEGER NOT NULL,\n    `amount` TEXT NOT NULL,\n    `cumulative_net_top_up` TEXT,\n    `chart_details_type` TEXT NOT NULL,\n    PRIMARY KEY(`user_id`, `asset_types_id`, `time_span`, `currency`, `timestamp`, `chart_details_type`),\n    FOREIGN KEY(`user_id`, `asset_types_id`, `time_span`, `currency`, `chart_details_type`)\n        REFERENCES `complex_analytics_combined_total_value_chart`(`user_id`, `asset_types_id`, `time_span`, `currency`, `chart_details_type`)\n    ON UPDATE NO ACTION ON DELETE CASCADE\n)");
    }
}
