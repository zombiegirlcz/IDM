package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class s2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s2 f202487c = new s2();

    private s2() {
        super(48, 49);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `portfolio_trades` ADD COLUMN `standing_order_id` TEXT DEFAULT NULL", "CREATE INDEX IF NOT EXISTS `index_portfolio_trades_standing_order_id` ON `portfolio_trades` (`standing_order_id`)", "ALTER TABLE `trading_trades` ADD COLUMN `standing_order_id` TEXT DEFAULT NULL");
    }
}
