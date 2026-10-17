package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class lc extends Migration {
    public lc() {
        super(67, 68);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `trading_price_alerts` (`id` TEXT NOT NULL, `symbol` TEXT NOT NULL, `targetPrice` TEXT NOT NULL, `placementPrice` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE  INDEX `index_trading_price_alerts_symbol` ON `trading_price_alerts` (`symbol`)");
    }
}
