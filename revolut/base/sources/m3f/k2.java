package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class k2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k2 f202439c = new k2();

    private k2() {
        super(40, 41);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `trading_trades` ADD COLUMN `stock_transfer_fee` INTEGER NOT NULL DEFAULT 0", "ALTER TABLE `trading_trades` ADD COLUMN `commission_refund` INTEGER NOT NULL DEFAULT 0", "ALTER TABLE `portfolio_trades` ADD COLUMN `stock_transfer_fee` INTEGER NOT NULL DEFAULT 0");
        supportSQLiteDatabase.execSQL("ALTER TABLE `portfolio_trades` ADD COLUMN `commission_refund` INTEGER NOT NULL DEFAULT 0");
    }
}
