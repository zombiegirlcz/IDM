package hpk;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f154569c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `rates_plot` (`currencyFrom` TEXT NOT NULL, `currencyTo` TEXT NOT NULL, `duration` TEXT NOT NULL, `plot` TEXT NOT NULL, PRIMARY KEY(`currencyFrom`, `currencyTo`, `duration`))", "CREATE TABLE IF NOT EXISTS `candles_cryptocommodities_chart` (`graph_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `symbol` TEXT NOT NULL, `duration` TEXT NOT NULL, `from` INTEGER NOT NULL, `to` INTEGER NOT NULL, `startClose` TEXT NOT NULL, `endClose` TEXT NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_candles_cryptocommodities_chart_symbol_duration` ON `candles_cryptocommodities_chart` (`symbol`, `duration`)");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `candles_cryptocommodities_point` (`timestampStart` INTEGER NOT NULL, `timestampEnd` INTEGER NOT NULL, `open` TEXT NOT NULL, `close` TEXT NOT NULL, `high` TEXT NOT NULL, `low` TEXT NOT NULL, `graph_id` INTEGER NOT NULL, PRIMARY KEY(`timestampStart`), FOREIGN KEY(`graph_id`) REFERENCES `candles_cryptocommodities_chart`(`graph_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
    }
}
