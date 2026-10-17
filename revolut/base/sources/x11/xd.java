package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class xd extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xd f302060c = new xd();

    private xd() {
        super(84, 85);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "\n            CREATE TABLE IF NOT EXISTS `instruments_watchlist_copy` \n            (\n                `symbol` TEXT NOT NULL, \n                `synced` INTEGER NOT NULL DEFAULT 0,\n                PRIMARY KEY(`symbol`),\n                FOREIGN KEY(`symbol`) REFERENCES `instruments`(`ticker`) ON DELETE CASCADE\n            )\n            ", "\n            INSERT INTO instruments_watchlist_copy (symbol)\n            SELECT i.ticker AS symbol FROM instruments_watchlist AS w JOIN instruments as i ON i.id = w.instrumentId\n            ", "DROP TABLE instruments_watchlist");
        supportSQLiteDatabase.execSQL("ALTER TABLE instruments_watchlist_copy RENAME TO instruments_watchlist;");
        supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX `index_instruments_ticker` ON `instruments` (`ticker`)");
    }
}
