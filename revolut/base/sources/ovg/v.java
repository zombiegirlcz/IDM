package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f230220c = new v();

    private v() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `complex_analytics_contributors` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `method` TEXT NOT NULL,\n    `asset` TEXT NOT NULL,\n    `pnl` TEXT NOT NULL,\n    `returns` REAL NOT NULL,\n    `closedOn` TEXT,\n    PRIMARY KEY(`asset_type`, `time_span`, `method`, `asset`)\n)", "CREATE INDEX IF NOT EXISTS `index_complex_analytics_contributors_asset_type_time_span_method` ON `complex_analytics_contributors` (\n    `asset_type`,\n    `time_span`,\n    `method`\n)");
    }
}
