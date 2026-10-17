package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f230195c = new g0();

    private g0() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `complex_analytics_allocations` (\n    `assetType` TEXT NOT NULL,\n    `sector` INTEGER NOT NULL,\n    `total_value` TEXT NOT NULL,\n    PRIMARY KEY(`assetType`, `sector`)\n)", "CREATE TABLE IF NOT EXISTS `complex_analytics_allocations_cash` (\n    `assetType` TEXT NOT NULL,\n    `sector` INTEGER NOT NULL,\n    `asset` TEXT NOT NULL,\n    `value` TEXT NOT NULL,\n    `allocation` REAL NOT NULL,\n    PRIMARY KEY(`assetType`, `sector`, `asset`),\n    FOREIGN KEY(`assetType`, `sector`) REFERENCES `complex_analytics_allocations`(`assetType`, `sector`)\n    ON UPDATE NO ACTION\n    ON DELETE CASCADE\n)", "CREATE TABLE IF NOT EXISTS `complex_analytics_allocations_assets` (\n    `assetType` TEXT NOT NULL,\n    `sector` INTEGER NOT NULL,\n    `asset` TEXT NOT NULL,\n    `quantity` REAL NOT NULL,\n    `value` TEXT NOT NULL,\n    `allocation` REAL NOT NULL,\n    PRIMARY KEY(`assetType`, `sector`, `asset`),\n    FOREIGN KEY(`assetType`, `sector`) REFERENCES `complex_analytics_allocations`(`assetType`, `sector`)\n    ON UPDATE NO ACTION\n    ON DELETE CASCADE\n)");
    }
}
