package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class p1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p1 f202468c = new p1();

    private p1() {
        super(21, 22);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `trading_price_alerts` (`id` TEXT NOT NULL, `symbol` TEXT NOT NULL, `targetPrice` TEXT NOT NULL, `placementPrice` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE INDEX IF NOT EXISTS `index_trading_price_alerts_symbol` ON `trading_price_alerts` (`symbol`)");
    }
}
