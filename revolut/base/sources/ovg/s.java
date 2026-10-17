package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f230217c = new s();

    private s() {
        super(27, 28);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `complex_analytics_allocations_assets` ADD COLUMN `ref` TEXT default null", "ALTER TABLE `complex_analytics_allocations_cash` ADD COLUMN `ref` TEXT default null", "ALTER TABLE `complex_analytics_contributors` ADD COLUMN `ref` TEXT default null");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `complex_analytics_dividends` ADD COLUMN `ref` TEXT default null", "ALTER TABLE `complex_analytics_realised_pnl` ADD COLUMN `ref` TEXT default null", "ALTER TABLE `complex_analytics_sector_allocations_assets` ADD COLUMN `ref` TEXT default null", "ALTER TABLE `complex_analytics_sector_contributors` ADD COLUMN `ref` TEXT default null");
        supportSQLiteDatabase.execSQL("ALTER TABLE `complex_analytics_security_positions` ADD COLUMN `ref` TEXT default null");
    }
}
