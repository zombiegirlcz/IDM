package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f230193c = new f0();

    private f0() {
        super(39, 40);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_allocations` (\n    `account_types_combined` TEXT NOT NULL,\n    `sector` INTEGER NOT NULL,\n    `currency` TEXT NOT NULL,\n    `total_value` TEXT NOT NULL,\n    PRIMARY KEY(`account_types_combined`, `sector`, `currency`)\n)", "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_allocations_cash` (\n    `account_types_combined` TEXT NOT NULL,\n    `sector` INTEGER NOT NULL,\n    `currency` TEXT NOT NULL,\n    `asset` TEXT NOT NULL,\n    `asset_type` TEXT NOT NULL,\n    `value` TEXT NOT NULL,\n    `allocation` REAL NOT NULL,\n    PRIMARY KEY(`account_types_combined`, `sector`, `currency`, `asset`, `asset_type`),\n    FOREIGN KEY(`account_types_combined`, `sector`, `currency`) REFERENCES `complex_analytics_combined_allocations`(`account_types_combined`, `sector`, `currency`) ON DELETE CASCADE\n)", "CREATE INDEX IF NOT EXISTS `index_complex_analytics_combined_allocations_cash_account_types_combined_sector_currency`\nON `complex_analytics_combined_allocations_cash` (`account_types_combined`, `sector`, `currency`)");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `complex_analytics_combined_allocations_assets` (\n    `account_types_combined` TEXT NOT NULL,\n    `sector` INTEGER NOT NULL,\n    `currency` TEXT NOT NULL,\n    `asset` TEXT NOT NULL,\n    `asset_type` TEXT NOT NULL,\n    `quantity` TEXT NOT NULL,\n    `value` TEXT NOT NULL,\n    `allocation` REAL NOT NULL,\n    `ref` TEXT,\n    `opening_price` TEXT,\n    `position_id` TEXT,\n    `leverage` TEXT,\n    PRIMARY KEY(`account_types_combined`, `sector`, `currency`, `asset`, `asset_type`),\n    FOREIGN KEY(`account_types_combined`, `sector`, `currency`) REFERENCES `complex_analytics_combined_allocations`(`account_types_combined`, `sector`, `currency`) ON DELETE CASCADE\n)");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_complex_analytics_combined_allocations_assets_account_types_combined_sector_currency`\nON `complex_analytics_combined_allocations_assets` (`account_types_combined`, `sector`, `currency`)");
    }
}
