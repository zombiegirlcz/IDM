package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f324424c = new h();

    private h() {
        super(17, 18);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "ALTER TABLE payments_groups ADD COLUMN `settings_baseCurrency` TEXT DEFAULT NULL", "ALTER TABLE payments_groups_bills ADD COLUMN `exchangedAmount` TEXT DEFAULT NULL", "ALTER TABLE payments_groups_bills_splits ADD COLUMN `exchangedAmount` TEXT DEFAULT NULL");
        y.y(supportSQLiteDatabase, "ALTER TABLE payments_groups_settlements ADD COLUMN `exchangedAmount` TEXT DEFAULT NULL");
    }
}
