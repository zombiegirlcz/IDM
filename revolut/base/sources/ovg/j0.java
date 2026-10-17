package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f230201c = new j0();

    private j0() {
        super(42, 43);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER TABLE `complex_analytics_allocations_assets` ADD COLUMN `currentPrice` TEXT DEFAULT null", "ALTER TABLE `complex_analytics_combined_allocations_assets` ADD COLUMN `current_price` TEXT DEFAULT null", "ALTER TABLE `complex_analytics_contributors` ADD COLUMN `returnOnInitialMargin` REAL DEFAULT null");
        supportSQLiteDatabase.execSQL("ALTER TABLE `complex_analytics_combined_contributors` ADD COLUMN `returnOnInitialMargin` REAL DEFAULT null");
    }
}
