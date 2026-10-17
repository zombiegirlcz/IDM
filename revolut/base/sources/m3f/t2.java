package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class t2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2 f202493c = new t2();

    private t2() {
        super(49, 50);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `trading_trades` ADD COLUMN `client_order_id` TEXT", "ALTER TABLE `portfolio_trades` ADD COLUMN `client_order_id` TEXT", "CREATE INDEX IF NOT EXISTS `index_portfolio_trades_client_order_id` ON `portfolio_trades` (`client_order_id`)");
    }
}
