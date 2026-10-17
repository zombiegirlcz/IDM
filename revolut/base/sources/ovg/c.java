package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f230186c = new c();

    private c() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `complex_analytics_sector_allocations` (\n    `assetType` TEXT NOT NULL,\n    `sector` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `total_value` TEXT NOT NULL,\n    PRIMARY KEY(`assetType`, `sector`, `currency`)\n)", "CREATE TABLE IF NOT EXISTS `complex_analytics_sector_allocations_assets` (\n    `assetType` TEXT NOT NULL,\n    `sector` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `asset` TEXT NOT NULL,\n    `quantity` REAL NOT NULL,\n    `value` TEXT NOT NULL,\n    `allocation` REAL NOT NULL,\n    PRIMARY KEY(`assetType`, `sector`, `currency`, `asset`), \n    FOREIGN KEY(`assetType`, `sector`, `currency`) \n    REFERENCES `complex_analytics_sector_allocations`(`assetType`, `sector`, `currency`) ON UPDATE NO ACTION ON DELETE CASCADE \n)", "CREATE TABLE IF NOT EXISTS `complex_analytics_sector_contributors` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `method` TEXT NOT NULL,\n    `sector` TEXT NOT NULL,\n    `portfolio_id` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `asset` TEXT NOT NULL,\n    `pnl` TEXT NOT NULL,\n    `returns` REAL NOT NULL,\n    `closedOn` TEXT,\n    PRIMARY KEY(`asset_type`, `time_span`, `method`, `sector`, `portfolio_id`, `currency`, `asset`)\n)");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_complex_analytics_sector_contributors_asset_type_time_span_method_sector_portfolio_id_currency`\nON `complex_analytics_sector_contributors` (`asset_type`, `time_span`, `method`, `sector`, `portfolio_id`, `currency`)");
    }
}
