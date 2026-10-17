package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class ha extends Migration {
    public ha() {
        super(41, 42);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `stocks_last_rates`", "CREATE TABLE IF NOT EXISTS `stocks_last_rates` (`ticker` TEXT NOT NULL, `price` TEXT NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`ticker`))");
    }
}
