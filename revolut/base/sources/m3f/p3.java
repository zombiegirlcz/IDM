package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class p3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p3 f202470c = new p3();

    private p3() {
        super(69, 70);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `trading_trades` ADD COLUMN `updated_at` INTEGER DEFAULT NULL", "ALTER TABLE `portfolio_trades` ADD COLUMN `updated_at` INTEGER DEFAULT NULL");
    }
}
