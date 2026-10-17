package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class w9 extends Migration {
    public w9() {
        super(37, 38);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `robo_holdings` ADD COLUMN `isaDetails` TEXT", "CREATE INDEX `index_robo_trades_holding_id` ON `robo_trades` (`holding_id`)");
    }
}
