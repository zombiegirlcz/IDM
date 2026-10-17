package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class p4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p4 f202471c = new p4();

    private p4() {
        super(92, 93);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `trading_trades` ADD COLUMN `compound_id` TEXT", "CREATE INDEX IF NOT EXISTS `index_trading_trades_compound_id` ON `trading_trades` (`compound_id`)");
    }
}
