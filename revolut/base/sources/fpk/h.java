package fpk;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.ratedetails.impl.database.RatesRoomDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RatesRoomDatabase_Impl f137134a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RatesRoomDatabase_Impl ratesRoomDatabase_Impl) {
        super(10, "c354fefb218742df34b1a0dfee2ee9b6", "2bcadffd44e547fe59679d0193738339");
        this.f137134a = ratesRoomDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `mid_rates_cache` (`from` TEXT NOT NULL, `to` TEXT NOT NULL, `rate` TEXT NOT NULL, `eodRate` TEXT, `isWeekend` INTEGER, `weekendStartTime` INTEGER, `weekendEndTime` INTEGER, PRIMARY KEY(`from`, `to`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `all_rates` (`from` TEXT NOT NULL, `to` TEXT NOT NULL, `askRate` TEXT NOT NULL, `bidRate` TEXT NOT NULL, `midRate` TEXT NOT NULL, `eodRate` TEXT, PRIMARY KEY(`from`, `to`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `mid_rates_plot` (`previousRangeCloseRate` REAL NOT NULL, `currencyFrom` TEXT NOT NULL, `currencyTo` TEXT NOT NULL, `duration` TEXT NOT NULL, `plot` TEXT NOT NULL, PRIMARY KEY(`currencyFrom`, `currencyTo`, `duration`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `rates_alerts` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `targetRate` TEXT NOT NULL, `placementRate` TEXT, `currencyFrom` TEXT NOT NULL, `currencyTo` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `executedDate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `candles_cryptocommodities_chart` (`graph_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `symbol` TEXT NOT NULL, `duration` TEXT NOT NULL, `from` INTEGER NOT NULL, `to` INTEGER NOT NULL, `startClose` TEXT NOT NULL, `endClose` TEXT NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_candles_cryptocommodities_chart_symbol_duration` ON `candles_cryptocommodities_chart` (`symbol`, `duration`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `candles_cryptocommodities_point` (`timestampStart` INTEGER NOT NULL, `timestampEnd` INTEGER NOT NULL, `open` TEXT NOT NULL, `close` TEXT NOT NULL, `high` TEXT NOT NULL, `low` TEXT NOT NULL, `graph_id` INTEGER NOT NULL, PRIMARY KEY(`timestampStart`), FOREIGN KEY(`graph_id`) REFERENCES `candles_cryptocommodities_chart`(`graph_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c354fefb218742df34b1a0dfee2ee9b6')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `mid_rates_cache`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `all_rates`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `mid_rates_plot`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `rates_alerts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `candles_cryptocommodities_chart`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `candles_cryptocommodities_point`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = RatesRoomDatabase_Impl.f103719n;
        this.f137134a.internalInitInvalidationTracker(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPostMigrate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPreMigrate(SQLiteConnection sQLiteConnection) {
        DBUtil.dropFtsSyncTriggers(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
        HashMap map = new HashMap(7);
        map.put("from", new TableInfo.Column("from", "TEXT", true, 1, null, 1));
        map.put("to", new TableInfo.Column("to", "TEXT", true, 2, null, 1));
        map.put("rate", new TableInfo.Column("rate", "TEXT", true, 0, null, 1));
        map.put("eodRate", new TableInfo.Column("eodRate", "TEXT", false, 0, null, 1));
        map.put("isWeekend", new TableInfo.Column("isWeekend", "INTEGER", false, 0, null, 1));
        map.put("weekendStartTime", new TableInfo.Column("weekendStartTime", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("mid_rates_cache", map, o.s(map, "weekendEndTime", new TableInfo.Column("weekendEndTime", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "mid_rates_cache");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("mid_rates_cache(com.revolut.retail.feature.ratedetails.impl.database.MidRatesCacheEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(6);
        map2.put("from", new TableInfo.Column("from", "TEXT", true, 1, null, 1));
        map2.put("to", new TableInfo.Column("to", "TEXT", true, 2, null, 1));
        map2.put("askRate", new TableInfo.Column("askRate", "TEXT", true, 0, null, 1));
        map2.put("bidRate", new TableInfo.Column("bidRate", "TEXT", true, 0, null, 1));
        map2.put("midRate", new TableInfo.Column("midRate", "TEXT", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("all_rates", map2, o.s(map2, "eodRate", new TableInfo.Column("eodRate", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "all_rates");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("all_rates(com.revolut.retail.feature.ratedetails.impl.database.AllRatesEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(5);
        map3.put("previousRangeCloseRate", new TableInfo.Column("previousRangeCloseRate", "REAL", true, 0, null, 1));
        map3.put("currencyFrom", new TableInfo.Column("currencyFrom", "TEXT", true, 1, null, 1));
        map3.put("currencyTo", new TableInfo.Column("currencyTo", "TEXT", true, 2, null, 1));
        map3.put("duration", new TableInfo.Column("duration", "TEXT", true, 3, null, 1));
        TableInfo tableInfo5 = new TableInfo("mid_rates_plot", map3, o.s(map3, "plot", new TableInfo.Column("plot", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "mid_rates_plot");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("mid_rates_plot(com.revolut.retail.feature.ratedetails.impl.database.rates_plot.MidRatesPlotEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(8);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map4.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map4.put("targetRate", new TableInfo.Column("targetRate", "TEXT", true, 0, null, 1));
        map4.put("placementRate", new TableInfo.Column("placementRate", "TEXT", false, 0, null, 1));
        map4.put("currencyFrom", new TableInfo.Column("currencyFrom", "TEXT", true, 0, null, 1));
        map4.put("currencyTo", new TableInfo.Column("currencyTo", "TEXT", true, 0, null, 1));
        map4.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("rates_alerts", map4, o.s(map4, "executedDate", new TableInfo.Column("executedDate", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "rates_alerts");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("rates_alerts(com.revolut.retail.feature.ratedetails.impl.database.alert.RatesAlertEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(7);
        map5.put("graph_id", new TableInfo.Column("graph_id", "INTEGER", true, 1, null, 1));
        map5.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map5.put("duration", new TableInfo.Column("duration", "TEXT", true, 0, null, 1));
        map5.put("from", new TableInfo.Column("from", "INTEGER", true, 0, null, 1));
        map5.put("to", new TableInfo.Column("to", "INTEGER", true, 0, null, 1));
        map5.put("startClose", new TableInfo.Column("startClose", "TEXT", true, 0, null, 1));
        HashSet hashSetS = o.s(map5, "endClose", new TableInfo.Column("endClose", "TEXT", true, 0, null, 1), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new TableInfo.Index("index_candles_cryptocommodities_chart_symbol_duration", true, Arrays.asList("symbol", "duration"), Arrays.asList("ASC", "ASC")));
        TableInfo tableInfo9 = new TableInfo("candles_cryptocommodities_chart", map5, hashSetS, hashSet);
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "candles_cryptocommodities_chart");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("candles_cryptocommodities_chart(com.revolut.retail.feature.ratedetails.impl.database.rates_plot.candlesticks.CandleSticksCryptoCommoditiesChartEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(7);
        map6.put("timestampStart", new TableInfo.Column("timestampStart", "INTEGER", true, 1, null, 1));
        map6.put("timestampEnd", new TableInfo.Column("timestampEnd", "INTEGER", true, 0, null, 1));
        map6.put("open", new TableInfo.Column("open", "TEXT", true, 0, null, 1));
        map6.put("close", new TableInfo.Column("close", "TEXT", true, 0, null, 1));
        map6.put("high", new TableInfo.Column("high", "TEXT", true, 0, null, 1));
        map6.put("low", new TableInfo.Column("low", "TEXT", true, 0, null, 1));
        HashSet hashSetS2 = o.s(map6, "graph_id", new TableInfo.Column("graph_id", "INTEGER", true, 0, null, 1), 1);
        TableInfo tableInfo11 = new TableInfo("candles_cryptocommodities_point", map6, hashSetS2, r6.b.l(hashSetS2, new TableInfo.ForeignKey("candles_cryptocommodities_chart", "CASCADE", "NO ACTION", Arrays.asList("graph_id"), Arrays.asList("graph_id")), 0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "candles_cryptocommodities_point");
        return !tableInfo11.equals(tableInfo12) ? new RoomOpenDelegate.ValidationResult(false, o.o("candles_cryptocommodities_point(com.revolut.retail.feature.ratedetails.impl.database.rates_plot.candlesticks.CandleSticksCryptoCommoditiesPointEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
