package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f230218c = new t();

    private t() {
        super(28, 29);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `complex_analytics_allocations_cash`", "CREATE TABLE IF NOT EXISTS `complex_analytics_allocations_cash` (\n    `assetType` TEXT NOT NULL,\n    `sector` INTEGER NOT NULL,\n    `currency` TEXT NOT NULL,\n    `portfolio_id` TEXT NOT NULL,\n    `asset` TEXT NOT NULL,\n    `value` TEXT NOT NULL,\n    `allocation` REAL NOT NULL,\n    PRIMARY KEY(`assetType`, `sector`, `currency`, `portfolio_id`, `asset`),\n    FOREIGN KEY(`assetType`, `sector`, `currency`, `portfolio_id`) \n    REFERENCES `complex_analytics_allocations`(`assetType`, `sector`, `currency`, `portfolio_id`)\n    ON UPDATE NO ACTION ON DELETE CASCADE )");
    }
}
