package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f230183c = new a0();

    private a0() {
        super(34, 35);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER TABLE `complex_analytics_allocations_assets` ADD COLUMN `openingPrice` TEXT DEFAULT null", "ALTER TABLE `complex_analytics_allocations_assets` ADD COLUMN `positionId` TEXT DEFAULT null", "ALTER TABLE `complex_analytics_allocations_assets` ADD COLUMN `leverage` TEXT DEFAULT null");
    }
}
