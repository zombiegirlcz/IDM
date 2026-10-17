package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f230207c = new m0();

    private m0() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `complex_analytics_total_value_chart` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `start` INTEGER NOT NULL,\n    `end` INTEGER NOT NULL,\n    `net_top_up` TEXT NOT NULL,\n    `total_return` TEXT NOT NULL,\n    PRIMARY KEY(`asset_type`, `time_span`, `currency`)\n)", "CREATE TABLE IF NOT EXISTS `complex_analytics_total_value_chart_point` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `timestamp` INTEGER NOT NULL,\n    `amount` TEXT NOT NULL,\n    `cumulative_net_top_up` TEXT NOT NULL,\n    PRIMARY KEY(`asset_type`, `time_span`, `currency`, `timestamp`),\n    FOREIGN KEY(`asset_type`, `time_span`, `currency`)\n    REFERENCES `complex_analytics_total_value_chart`(`asset_type`, `time_span`, `currency`)\n    ON UPDATE NO ACTION ON DELETE CASCADE\n)");
    }
}
