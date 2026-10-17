package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g2 f301853c = new g2();

    private g2() {
        super(170, 171);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `candles_cryptocommodities_chart`", "DROP TABLE IF EXISTS `candles_cryptocommodities_point`", "\n            CREATE TABLE IF NOT EXISTS `candles_cryptocommodities_chart` (\n                `graph_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                `symbol` TEXT NOT NULL,\n                `duration` TEXT NOT NULL,\n                `from` INTEGER NOT NULL,\n                `to` INTEGER NOT NULL,\n                `startClose` TEXT NOT NULL,\n                `endClose` TEXT NOT NULL)\n            ");
        supportSQLiteDatabase.execSQL("\n                CREATE UNIQUE INDEX IF NOT EXISTS `index_candles_cryptocommodities_chart_symbol_duration`\n                ON `candles_cryptocommodities_chart` (`symbol`, `duration`)\n            ");
        supportSQLiteDatabase.execSQL("\n                CREATE TABLE IF NOT EXISTS `candles_cryptocommodities_point` (\n                `timestampStart` INTEGER NOT NULL,\n                `timestampEnd` INTEGER NOT NULL,\n                `open` TEXT NOT NULL,\n                `close` TEXT NOT NULL,\n                `high` TEXT NOT NULL,\n                `low` TEXT NOT NULL,\n                `graph_id` INTEGER NOT NULL,\n                PRIMARY KEY(`timestampStart`), \n                FOREIGN KEY(`graph_id`) REFERENCES `candles_cryptocommodities_chart`(`graph_id`) ON UPDATE NO ACTION ON DELETE CASCADE )\n            ");
    }
}
