package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f230216c = new r();

    private r() {
        super(26, 27);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "DROP TABLE `complex_analytics_sector_allocations_assets`", "CREATE TABLE IF NOT EXISTS `complex_analytics_sector_allocations_assets` (\n    `assetType` TEXT NOT NULL,\n    `sector` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `asset` TEXT NOT NULL,\n    `quantity` TEXT NOT NULL,\n    `value` TEXT NOT NULL,\n    `allocation` REAL NOT NULL,\n    PRIMARY KEY(`assetType`, `sector`, `currency`, `asset`),\n    FOREIGN KEY(`assetType`, `sector`, `currency`)\n        REFERENCES `complex_analytics_sector_allocations`(`assetType`, `sector`, `currency`)\n    ON UPDATE NO ACTION ON DELETE CASCADE\n)", "DROP TABLE `complex_analytics_allocations_assets`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `complex_analytics_allocations_assets` (\n    `assetType` TEXT NOT NULL,\n    `sector` INTEGER NOT NULL,\n    `currency` TEXT NOT NULL,\n    `portfolio_id` TEXT NOT NULL,\n    `asset` TEXT NOT NULL,\n    `quantity` TEXT NOT NULL,\n    `value` TEXT NOT NULL,\n    `allocation` REAL NOT NULL,\n    PRIMARY KEY(`assetType`, `sector`, `currency`, `portfolio_id`, `asset`),\n    FOREIGN KEY(`assetType`, `sector`, `currency`, `portfolio_id`) \n        REFERENCES `complex_analytics_allocations`(`assetType`, `sector`, `currency`, `portfolio_id`)\n    ON UPDATE NO ACTION ON DELETE CASCADE \n)");
    }
}
