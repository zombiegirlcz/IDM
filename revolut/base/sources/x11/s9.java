package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class s9 extends Migration {
    public s9() {
        super(36, 37);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS robo_trades", "CREATE TABLE IF NOT EXISTS robo_trades (`trade_id` TEXT NOT NULL, `holding_id` TEXT NOT NULL, `state` TEXT NOT NULL, `side` TEXT NOT NULL, `started_at` INTEGER, `created_at` INTEGER NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`trade_id`), FOREIGN KEY(`holding_id`) REFERENCES `robo_holdings`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
    }
}
