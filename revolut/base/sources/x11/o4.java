package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class o4 extends Migration {
    public o4() {
        super(21, 22);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `stocks_historical_rates` (`ticker` TEXT NOT NULL, `period` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `price` TEXT NOT NULL, PRIMARY KEY(`ticker`, `period`, `timestamp`))", "CREATE TABLE IF NOT EXISTS `stocks_last_rates` (`ticker` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `price` TEXT NOT NULL, `is_market_open` INTEGER NOT NULL, PRIMARY KEY(`ticker`))");
    }
}
