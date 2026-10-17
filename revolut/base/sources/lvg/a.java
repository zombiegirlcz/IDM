package lvg;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;
import r6.b;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WealthAnalyticsDatabase_Impl f200377a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WealthAnalyticsDatabase_Impl wealthAnalyticsDatabase_Impl) {
        super(44, "756052b63e1a4043ba58d98c3ea59ee3", "b43355997c73469f9db0a60778022b85");
        this.f200377a = wealthAnalyticsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `portfolio_performance_points` (`key` TEXT NOT NULL, `period` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `returns` TEXT NOT NULL, `totalReturns` TEXT NOT NULL, PRIMARY KEY(`key`, `period`, `timestamp`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `portfolio_details_chart` (`chart_key` TEXT NOT NULL, `chart_period` TEXT NOT NULL, `currency` TEXT NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_portfolio_details_chart_chart_key_chart_period_currency` ON `portfolio_details_chart` (`chart_key`, `chart_period`, `currency`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_portfolio_details_chart_chart_key_chart_period` ON `portfolio_details_chart` (`chart_key`, `chart_period`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `portfolio_details_chart_point` (`timestamp` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`, `amount`, `id`), FOREIGN KEY(`id`) REFERENCES `portfolio_details_chart`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `contributors` (`key` TEXT NOT NULL, `period` TEXT NOT NULL, `name` TEXT NOT NULL, `pnl` TEXT NOT NULL, `returns` REAL NOT NULL, `periodStartValue` TEXT NOT NULL, `asset_state` TEXT NOT NULL, PRIMARY KEY(`key`, `period`, `name`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_contributors_key_period` ON `contributors` (`key`, `period`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_contributors` (`asset_type` TEXT NOT NULL, `time_span` TEXT NOT NULL, `method` TEXT NOT NULL, `sector` INTEGER NOT NULL, `portfolio_id` TEXT NOT NULL, `currency` TEXT NOT NULL, `asset` TEXT NOT NULL, `pnl` TEXT NOT NULL, `returns` REAL NOT NULL, `returnOnInitialMargin` REAL, `closedOn` TEXT, `ref` TEXT, `openingPrice` TEXT, `positionId` TEXT, `quantity` TEXT, PRIMARY KEY(`asset_type`, `time_span`, `method`, `sector`, `portfolio_id`, `asset`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_complex_analytics_contributors_asset_type_time_span_method_sector_portfolio_id` ON `complex_analytics_contributors` (`asset_type`, `time_span`, `method`, `sector`, `portfolio_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_contributors` (`asset_type` TEXT NOT NULL, `time_span` TEXT NOT NULL, `method` TEXT NOT NULL, `sector` INTEGER NOT NULL, `currency` TEXT NOT NULL, `asset` TEXT NOT NULL, `pnl` TEXT NOT NULL, `returns` REAL NOT NULL, `returnOnInitialMargin` REAL, `closedOn` TEXT, `ref` TEXT, `openingPrice` TEXT, `positionId` TEXT, `quantity` TEXT, PRIMARY KEY(`asset_type`, `time_span`, `method`, `sector`, `currency`, `asset`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_complex_analytics_combined_contributors_asset_type_time_span_method_sector_currency` ON `complex_analytics_combined_contributors` (`asset_type`, `time_span`, `method`, `sector`, `currency`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_allocations` (`assetType` TEXT NOT NULL, `sector` INTEGER NOT NULL, `currency` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `total_value` TEXT NOT NULL, PRIMARY KEY(`assetType`, `sector`, `currency`, `portfolio_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_allocations_cash` (`assetType` TEXT NOT NULL, `sector` INTEGER NOT NULL, `currency` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `asset` TEXT NOT NULL, `value` TEXT NOT NULL, `allocation` REAL NOT NULL, PRIMARY KEY(`assetType`, `sector`, `currency`, `portfolio_id`, `asset`), FOREIGN KEY(`assetType`, `sector`, `currency`, `portfolio_id`) REFERENCES `complex_analytics_allocations`(`assetType`, `sector`, `currency`, `portfolio_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_allocations_assets` (`assetType` TEXT NOT NULL, `sector` INTEGER NOT NULL, `currency` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `asset` TEXT NOT NULL, `quantity` TEXT NOT NULL, `value` TEXT NOT NULL, `allocation` REAL NOT NULL, `ref` TEXT, `openingPrice` TEXT, `currentPrice` TEXT, `positionId` TEXT, `leverage` TEXT, PRIMARY KEY(`assetType`, `sector`, `currency`, `portfolio_id`, `asset`), FOREIGN KEY(`assetType`, `sector`, `currency`, `portfolio_id`) REFERENCES `complex_analytics_allocations`(`assetType`, `sector`, `currency`, `portfolio_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_realised_pnl` (`asset_type` TEXT NOT NULL, `time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `asset` TEXT NOT NULL, `sell_date` TEXT NOT NULL, `pnl_fifo` TEXT NOT NULL, `pnl_average` TEXT NOT NULL, `ref` TEXT, `openingPrice` TEXT, `quantity` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_complex_analytics_realised_pnl_asset_type_time_span_currency_portfolio_id` ON `complex_analytics_realised_pnl` (`asset_type`, `time_span`, `currency`, `portfolio_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_realised_pnl` (`request_product_types` TEXT NOT NULL, `item_product_type` TEXT NOT NULL, `time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `asset` TEXT NOT NULL, `sell_date` TEXT NOT NULL, `pnl_fifo` TEXT NOT NULL, `pnl_average` TEXT NOT NULL, `ref` TEXT, `opening_price` TEXT, `quantity` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_complex_analytics_combined_realised_pnl_request_product_types_time_span_currency` ON `complex_analytics_combined_realised_pnl` (`request_product_types`, `time_span`, `currency`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_total_value_chart` (`asset_type` TEXT NOT NULL, `time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, `net_top_up` TEXT, `total_return` TEXT, `chart_details_type` TEXT NOT NULL, PRIMARY KEY(`asset_type`, `time_span`, `currency`, `portfolio_id`, `chart_details_type`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_total_value_chart_point` (`asset_type` TEXT NOT NULL, `time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `amount` TEXT NOT NULL, `cumulative_net_top_up` TEXT, `chart_details_type` TEXT NOT NULL, PRIMARY KEY(`asset_type`, `time_span`, `currency`, `portfolio_id`, `timestamp`, `chart_details_type`), FOREIGN KEY(`asset_type`, `time_span`, `currency`, `portfolio_id`, `chart_details_type`) REFERENCES `complex_analytics_total_value_chart`(`asset_type`, `time_span`, `currency`, `portfolio_id`, `chart_details_type`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_performance_chart` (`asset_type` TEXT NOT NULL, `time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `method` TEXT NOT NULL, `benchmark` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, `last_modified` INTEGER NOT NULL, PRIMARY KEY(`asset_type`, `time_span`, `currency`, `method`, `benchmark`, `portfolio_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_performance_chart_point` (`asset_type` TEXT NOT NULL, `time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `method` TEXT NOT NULL, `benchmark_ref` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `returns` REAL NOT NULL, `totalReturns` REAL NOT NULL, `benchmark` REAL, `pnl` TEXT NOT NULL, PRIMARY KEY(`asset_type`, `time_span`, `currency`, `method`, `benchmark_ref`, `portfolio_id`, `timestamp`), FOREIGN KEY(`asset_type`, `time_span`, `currency`, `method`, `benchmark_ref`, `portfolio_id`) REFERENCES `complex_analytics_performance_chart`(`asset_type`, `time_span`, `currency`, `method`, `benchmark`, `portfolio_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_pnl` (`asset_type` TEXT NOT NULL, `time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `interval` TEXT NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, `last_modified` TEXT, PRIMARY KEY(`asset_type`, `time_span`, `currency`, `portfolio_id`, `interval`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_pnl_point` (`asset_type` TEXT NOT NULL, `time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `interval` TEXT NOT NULL, `point_start` INTEGER NOT NULL, `point_end` INTEGER NOT NULL, `net_sell` TEXT NOT NULL, `dividends` TEXT, `cumulative` TEXT NOT NULL, PRIMARY KEY(`asset_type`, `time_span`, `currency`, `portfolio_id`, `interval`, `point_start`, `point_end`), FOREIGN KEY(`asset_type`, `time_span`, `currency`, `portfolio_id`, `interval`) REFERENCES `complex_analytics_pnl`(`asset_type`, `time_span`, `currency`, `portfolio_id`, `interval`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_sector_allocations` (`assetType` TEXT NOT NULL, `sector` TEXT NOT NULL, `currency` TEXT NOT NULL, `total_value` TEXT NOT NULL, PRIMARY KEY(`assetType`, `sector`, `currency`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_sector_allocations_assets` (`assetType` TEXT NOT NULL, `sector` TEXT NOT NULL, `currency` TEXT NOT NULL, `asset` TEXT NOT NULL, `quantity` TEXT NOT NULL, `value` TEXT NOT NULL, `allocation` REAL NOT NULL, `ref` TEXT, PRIMARY KEY(`assetType`, `sector`, `currency`, `asset`), FOREIGN KEY(`assetType`, `sector`, `currency`) REFERENCES `complex_analytics_sector_allocations`(`assetType`, `sector`, `currency`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_sector_contributors` (`asset_type` TEXT NOT NULL, `time_span` TEXT NOT NULL, `method` TEXT NOT NULL, `sector` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `currency` TEXT NOT NULL, `asset` TEXT NOT NULL, `pnl` TEXT NOT NULL, `returns` REAL NOT NULL, `closedOn` TEXT, `ref` TEXT, PRIMARY KEY(`asset_type`, `time_span`, `method`, `sector`, `portfolio_id`, `currency`, `asset`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_complex_analytics_sector_contributors_asset_type_time_span_method_sector_portfolio_id_currency` ON `complex_analytics_sector_contributors` (`asset_type`, `time_span`, `method`, `sector`, `portfolio_id`, `currency`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_performance_chart` (`time_span` TEXT NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, `last_modified` INTEGER NOT NULL, `asset_types_id` TEXT NOT NULL, `currency` TEXT NOT NULL, `method` TEXT NOT NULL, `benchmark` TEXT NOT NULL, PRIMARY KEY(`asset_types_id`, `time_span`, `currency`, `method`, `benchmark`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_performance_chart_point` (`time_span` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `returns` REAL NOT NULL, `totalReturns` REAL NOT NULL, `benchmark` REAL, `pnl` TEXT NOT NULL, `asset_types_id` TEXT NOT NULL, `currency` TEXT NOT NULL, `method` TEXT NOT NULL, `benchmark_ref` TEXT NOT NULL, PRIMARY KEY(`time_span`, `timestamp`, `asset_types_id`, `currency`, `method`, `benchmark_ref`), FOREIGN KEY(`time_span`, `asset_types_id`, `currency`, `method`, `benchmark_ref`) REFERENCES `complex_analytics_combined_performance_chart`(`time_span`, `asset_types_id`, `currency`, `method`, `benchmark`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_total_value_chart` (`user_id` TEXT NOT NULL, `asset_types_id` TEXT NOT NULL, `time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, `net_top_up` TEXT, `total_return` TEXT, `chart_details_type` TEXT NOT NULL, PRIMARY KEY(`user_id`, `asset_types_id`, `time_span`, `currency`, `chart_details_type`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_total_value_chart_point` (`user_id` TEXT NOT NULL, `asset_types_id` TEXT NOT NULL, `time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `amount` TEXT NOT NULL, `cumulative_net_top_up` TEXT, `chart_details_type` TEXT NOT NULL, PRIMARY KEY(`user_id`, `asset_types_id`, `time_span`, `currency`, `timestamp`, `chart_details_type`), FOREIGN KEY(`user_id`, `asset_types_id`, `time_span`, `currency`, `chart_details_type`) REFERENCES `complex_analytics_combined_total_value_chart`(`user_id`, `asset_types_id`, `time_span`, `currency`, `chart_details_type`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_pnl_chart` (`user_id` TEXT NOT NULL, `asset_types_id` TEXT NOT NULL, `time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, PRIMARY KEY(`user_id`, `asset_types_id`, `time_span`, `currency`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_pnl_chart_point` (`user_id` TEXT NOT NULL, `asset_types_id` TEXT NOT NULL, `time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `point_start` INTEGER NOT NULL, `point_end` INTEGER NOT NULL, `net_sell` TEXT NOT NULL, `dividends` TEXT, `cumulative` TEXT NOT NULL, PRIMARY KEY(`user_id`, `asset_types_id`, `time_span`, `currency`), FOREIGN KEY(`user_id`, `asset_types_id`, `time_span`, `currency`) REFERENCES `complex_analytics_combined_pnl_chart`(`user_id`, `asset_types_id`, `time_span`, `currency`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_dividends` (`time_span` TEXT NOT NULL, `currency` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `account_types` TEXT, `date` TEXT NOT NULL, `symbol` TEXT NOT NULL, `ref` TEXT NOT NULL, `amount` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_complex_analytics_dividends_time_span_currency_portfolio_id` ON `complex_analytics_dividends` (`time_span`, `currency`, `portfolio_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_complex_analytics_dividends_time_span_currency_portfolio_id_ref` ON `complex_analytics_dividends` (`time_span`, `currency`, `portfolio_id`, `ref`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_complex_analytics_dividends_time_span_currency_portfolio_id_account_types` ON `complex_analytics_dividends` (`time_span`, `currency`, `portfolio_id`, `account_types`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_allocations` (`account_types_combined` TEXT NOT NULL, `sector` INTEGER NOT NULL, `currency` TEXT NOT NULL, `total_value` TEXT NOT NULL, PRIMARY KEY(`account_types_combined`, `sector`, `currency`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_allocations_cash` (`account_types_combined` TEXT NOT NULL, `asset_type` TEXT NOT NULL, `sector` INTEGER NOT NULL, `currency` TEXT NOT NULL, `asset` TEXT NOT NULL, `value` TEXT NOT NULL, `allocation` REAL NOT NULL, PRIMARY KEY(`account_types_combined`, `sector`, `currency`, `asset`, `asset_type`), FOREIGN KEY(`account_types_combined`, `sector`, `currency`) REFERENCES `complex_analytics_combined_allocations`(`account_types_combined`, `sector`, `currency`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_complex_analytics_combined_allocations_cash_account_types_combined_sector_currency` ON `complex_analytics_combined_allocations_cash` (`account_types_combined`, `sector`, `currency`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_allocations_assets` (`account_types_combined` TEXT NOT NULL, `asset_type` TEXT NOT NULL, `sector` INTEGER NOT NULL, `currency` TEXT NOT NULL, `asset` TEXT NOT NULL, `quantity` TEXT NOT NULL, `value` TEXT NOT NULL, `allocation` REAL NOT NULL, `ref` TEXT, `opening_price` TEXT, `current_price` TEXT, `position_id` TEXT, `leverage` TEXT, PRIMARY KEY(`account_types_combined`, `sector`, `currency`, `asset`, `asset_type`), FOREIGN KEY(`account_types_combined`, `sector`, `currency`) REFERENCES `complex_analytics_combined_allocations`(`account_types_combined`, `sector`, `currency`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_complex_analytics_combined_allocations_assets_account_types_combined_sector_currency` ON `complex_analytics_combined_allocations_assets` (`account_types_combined`, `sector`, `currency`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '756052b63e1a4043ba58d98c3ea59ee3')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `portfolio_performance_points`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `portfolio_details_chart`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `portfolio_details_chart_point`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `contributors`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_contributors`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_combined_contributors`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_allocations`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_allocations_cash`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_allocations_assets`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_realised_pnl`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_combined_realised_pnl`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_total_value_chart`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_total_value_chart_point`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_performance_chart`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_performance_chart_point`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_pnl`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_pnl_point`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_sector_allocations`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_sector_allocations_assets`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_sector_contributors`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_combined_performance_chart`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_combined_performance_chart_point`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_combined_total_value_chart`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_combined_total_value_chart_point`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_combined_pnl_chart`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_combined_pnl_chart_point`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_dividends`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_combined_allocations`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_combined_allocations_cash`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `complex_analytics_combined_allocations_assets`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = WealthAnalyticsDatabase_Impl.f94973y;
        this.f200377a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(5);
        map.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
        map.put("period", new TableInfo.Column("period", "TEXT", true, 2, null, 1));
        map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 3, null, 1));
        map.put("returns", new TableInfo.Column("returns", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("portfolio_performance_points", map, o.s(map, "totalReturns", new TableInfo.Column("totalReturns", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "portfolio_performance_points");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("portfolio_performance_points(com.revolut.feature.wealth.analytics.data.database.models.PortfolioPerformancePointEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(6);
        map2.put("chart_key", new TableInfo.Column("chart_key", "TEXT", true, 0, null, 1));
        map2.put("chart_period", new TableInfo.Column("chart_period", "TEXT", true, 0, null, 1));
        map2.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map2.put("start", new TableInfo.Column("start", "INTEGER", true, 0, null, 1));
        map2.put("end", new TableInfo.Column("end", "INTEGER", true, 0, null, 1));
        HashSet hashSetS = o.s(map2, "id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1), 0);
        HashSet hashSet = new HashSet(2);
        hashSet.add(new TableInfo.Index("index_portfolio_details_chart_chart_key_chart_period_currency", true, Arrays.asList("chart_key", "chart_period", "currency"), Arrays.asList("ASC", "ASC", "ASC")));
        hashSet.add(new TableInfo.Index("index_portfolio_details_chart_chart_key_chart_period", false, Arrays.asList("chart_key", "chart_period"), Arrays.asList("ASC", "ASC")));
        TableInfo tableInfo3 = new TableInfo("portfolio_details_chart", map2, hashSetS, hashSet);
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "portfolio_details_chart");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("portfolio_details_chart(com.revolut.feature.wealth.analytics.data.database.models.PortfolioDetailsChartEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(3);
        map3.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
        map3.put("amount", new TableInfo.Column("amount", "INTEGER", true, 2, null, 1));
        HashSet hashSetS2 = o.s(map3, "id", new TableInfo.Column("id", "INTEGER", true, 3, null, 1), 1);
        TableInfo tableInfo5 = new TableInfo("portfolio_details_chart_point", map3, hashSetS2, b.l(hashSetS2, new TableInfo.ForeignKey("portfolio_details_chart", "CASCADE", "NO ACTION", Arrays.asList("id"), Arrays.asList("id")), 0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "portfolio_details_chart_point");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("portfolio_details_chart_point(com.revolut.feature.wealth.analytics.data.database.models.PortfolioDetailsChartPointEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(7);
        map4.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
        map4.put("period", new TableInfo.Column("period", "TEXT", true, 2, null, 1));
        map4.put("name", new TableInfo.Column("name", "TEXT", true, 3, null, 1));
        map4.put("pnl", new TableInfo.Column("pnl", "TEXT", true, 0, null, 1));
        map4.put("returns", new TableInfo.Column("returns", "REAL", true, 0, null, 1));
        map4.put("periodStartValue", new TableInfo.Column("periodStartValue", "TEXT", true, 0, null, 1));
        HashSet hashSetS3 = o.s(map4, "asset_state", new TableInfo.Column("asset_state", "TEXT", true, 0, null, 1), 0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new TableInfo.Index("index_contributors_key_period", false, Arrays.asList("key", "period"), Arrays.asList("ASC", "ASC")));
        TableInfo tableInfo7 = new TableInfo("contributors", map4, hashSetS3, hashSet2);
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "contributors");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("contributors(com.revolut.feature.wealth.analytics.data.database.models.ContributorsEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(15);
        map5.put("asset_type", new TableInfo.Column("asset_type", "TEXT", true, 1, null, 1));
        map5.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 2, null, 1));
        map5.put("method", new TableInfo.Column("method", "TEXT", true, 3, null, 1));
        map5.put("sector", new TableInfo.Column("sector", "INTEGER", true, 4, null, 1));
        map5.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 5, null, 1));
        map5.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map5.put("asset", new TableInfo.Column("asset", "TEXT", true, 6, null, 1));
        map5.put("pnl", new TableInfo.Column("pnl", "TEXT", true, 0, null, 1));
        map5.put("returns", new TableInfo.Column("returns", "REAL", true, 0, null, 1));
        map5.put("returnOnInitialMargin", new TableInfo.Column("returnOnInitialMargin", "REAL", false, 0, null, 1));
        map5.put("closedOn", new TableInfo.Column("closedOn", "TEXT", false, 0, null, 1));
        map5.put("ref", new TableInfo.Column("ref", "TEXT", false, 0, null, 1));
        map5.put("openingPrice", new TableInfo.Column("openingPrice", "TEXT", false, 0, null, 1));
        map5.put("positionId", new TableInfo.Column("positionId", "TEXT", false, 0, null, 1));
        HashSet hashSetS4 = o.s(map5, "quantity", new TableInfo.Column("quantity", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(new TableInfo.Index("index_complex_analytics_contributors_asset_type_time_span_method_sector_portfolio_id", false, Arrays.asList("asset_type", "time_span", "method", "sector", "portfolio_id"), Arrays.asList("ASC", "ASC", "ASC", "ASC", "ASC")));
        TableInfo tableInfo9 = new TableInfo("complex_analytics_contributors", map5, hashSetS4, hashSet3);
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "complex_analytics_contributors");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_contributors(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsContributorsEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(14);
        map6.put("asset_type", new TableInfo.Column("asset_type", "TEXT", true, 1, null, 1));
        map6.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 2, null, 1));
        map6.put("method", new TableInfo.Column("method", "TEXT", true, 3, null, 1));
        map6.put("sector", new TableInfo.Column("sector", "INTEGER", true, 4, null, 1));
        map6.put("currency", new TableInfo.Column("currency", "TEXT", true, 5, null, 1));
        map6.put("asset", new TableInfo.Column("asset", "TEXT", true, 6, null, 1));
        map6.put("pnl", new TableInfo.Column("pnl", "TEXT", true, 0, null, 1));
        map6.put("returns", new TableInfo.Column("returns", "REAL", true, 0, null, 1));
        map6.put("returnOnInitialMargin", new TableInfo.Column("returnOnInitialMargin", "REAL", false, 0, null, 1));
        map6.put("closedOn", new TableInfo.Column("closedOn", "TEXT", false, 0, null, 1));
        map6.put("ref", new TableInfo.Column("ref", "TEXT", false, 0, null, 1));
        map6.put("openingPrice", new TableInfo.Column("openingPrice", "TEXT", false, 0, null, 1));
        map6.put("positionId", new TableInfo.Column("positionId", "TEXT", false, 0, null, 1));
        HashSet hashSetS5 = o.s(map6, "quantity", new TableInfo.Column("quantity", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet4 = new HashSet(1);
        hashSet4.add(new TableInfo.Index("index_complex_analytics_combined_contributors_asset_type_time_span_method_sector_currency", false, Arrays.asList("asset_type", "time_span", "method", "sector", "currency"), Arrays.asList("ASC", "ASC", "ASC", "ASC", "ASC")));
        TableInfo tableInfo11 = new TableInfo("complex_analytics_combined_contributors", map6, hashSetS5, hashSet4);
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "complex_analytics_combined_contributors");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_combined_contributors(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsCombinedContributorsEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(5);
        map7.put("assetType", new TableInfo.Column("assetType", "TEXT", true, 1, null, 1));
        map7.put("sector", new TableInfo.Column("sector", "INTEGER", true, 2, null, 1));
        map7.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map7.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 4, null, 1));
        TableInfo tableInfo13 = new TableInfo("complex_analytics_allocations", map7, o.s(map7, "total_value", new TableInfo.Column("total_value", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "complex_analytics_allocations");
        if (!tableInfo13.equals(tableInfo14)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_allocations(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsAllocationsEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14));
        }
        HashMap map8 = new HashMap(7);
        map8.put("assetType", new TableInfo.Column("assetType", "TEXT", true, 1, null, 1));
        map8.put("sector", new TableInfo.Column("sector", "INTEGER", true, 2, null, 1));
        map8.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map8.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 4, null, 1));
        map8.put("asset", new TableInfo.Column("asset", "TEXT", true, 5, null, 1));
        map8.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
        HashSet hashSetS6 = o.s(map8, "allocation", new TableInfo.Column("allocation", "REAL", true, 0, null, 1), 1);
        TableInfo tableInfo15 = new TableInfo("complex_analytics_allocations_cash", map8, hashSetS6, b.l(hashSetS6, new TableInfo.ForeignKey("complex_analytics_allocations", "CASCADE", "NO ACTION", Arrays.asList("assetType", "sector", "currency", "portfolio_id"), Arrays.asList("assetType", "sector", "currency", "portfolio_id")), 0));
        TableInfo tableInfo16 = TableInfo.read(sQLiteConnection, "complex_analytics_allocations_cash");
        if (!tableInfo15.equals(tableInfo16)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_allocations_cash(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsAllocationsCashEntity).\n Expected:\n", tableInfo15, "\n Found:\n", tableInfo16));
        }
        HashMap map9 = new HashMap(13);
        map9.put("assetType", new TableInfo.Column("assetType", "TEXT", true, 1, null, 1));
        map9.put("sector", new TableInfo.Column("sector", "INTEGER", true, 2, null, 1));
        map9.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map9.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 4, null, 1));
        map9.put("asset", new TableInfo.Column("asset", "TEXT", true, 5, null, 1));
        map9.put("quantity", new TableInfo.Column("quantity", "TEXT", true, 0, null, 1));
        map9.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
        map9.put("allocation", new TableInfo.Column("allocation", "REAL", true, 0, null, 1));
        map9.put("ref", new TableInfo.Column("ref", "TEXT", false, 0, null, 1));
        map9.put("openingPrice", new TableInfo.Column("openingPrice", "TEXT", false, 0, null, 1));
        map9.put("currentPrice", new TableInfo.Column("currentPrice", "TEXT", false, 0, null, 1));
        map9.put("positionId", new TableInfo.Column("positionId", "TEXT", false, 0, null, 1));
        HashSet hashSetS7 = o.s(map9, "leverage", new TableInfo.Column("leverage", "TEXT", false, 0, null, 1), 1);
        TableInfo tableInfo17 = new TableInfo("complex_analytics_allocations_assets", map9, hashSetS7, b.l(hashSetS7, new TableInfo.ForeignKey("complex_analytics_allocations", "CASCADE", "NO ACTION", Arrays.asList("assetType", "sector", "currency", "portfolio_id"), Arrays.asList("assetType", "sector", "currency", "portfolio_id")), 0));
        TableInfo tableInfo18 = TableInfo.read(sQLiteConnection, "complex_analytics_allocations_assets");
        if (!tableInfo17.equals(tableInfo18)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_allocations_assets(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsAllocationsAssetEntity).\n Expected:\n", tableInfo17, "\n Found:\n", tableInfo18));
        }
        HashMap map10 = new HashMap(12);
        map10.put("asset_type", new TableInfo.Column("asset_type", "TEXT", true, 0, null, 1));
        map10.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 0, null, 1));
        map10.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map10.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 0, null, 1));
        map10.put("asset", new TableInfo.Column("asset", "TEXT", true, 0, null, 1));
        map10.put("sell_date", new TableInfo.Column("sell_date", "TEXT", true, 0, null, 1));
        map10.put("pnl_fifo", new TableInfo.Column("pnl_fifo", "TEXT", true, 0, null, 1));
        map10.put("pnl_average", new TableInfo.Column("pnl_average", "TEXT", true, 0, null, 1));
        map10.put("ref", new TableInfo.Column("ref", "TEXT", false, 0, null, 1));
        map10.put("openingPrice", new TableInfo.Column("openingPrice", "TEXT", false, 0, null, 1));
        map10.put("quantity", new TableInfo.Column("quantity", "TEXT", false, 0, null, 1));
        HashSet hashSetS8 = o.s(map10, "id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1), 0);
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new TableInfo.Index("index_complex_analytics_realised_pnl_asset_type_time_span_currency_portfolio_id", false, Arrays.asList("asset_type", "time_span", "currency", "portfolio_id"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
        TableInfo tableInfo19 = new TableInfo("complex_analytics_realised_pnl", map10, hashSetS8, hashSet5);
        TableInfo tableInfo20 = TableInfo.read(sQLiteConnection, "complex_analytics_realised_pnl");
        if (!tableInfo19.equals(tableInfo20)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_realised_pnl(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsRealisedPnlEntity).\n Expected:\n", tableInfo19, "\n Found:\n", tableInfo20));
        }
        HashMap map11 = new HashMap(12);
        map11.put("request_product_types", new TableInfo.Column("request_product_types", "TEXT", true, 0, null, 1));
        map11.put("item_product_type", new TableInfo.Column("item_product_type", "TEXT", true, 0, null, 1));
        map11.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 0, null, 1));
        map11.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map11.put("asset", new TableInfo.Column("asset", "TEXT", true, 0, null, 1));
        map11.put("sell_date", new TableInfo.Column("sell_date", "TEXT", true, 0, null, 1));
        map11.put("pnl_fifo", new TableInfo.Column("pnl_fifo", "TEXT", true, 0, null, 1));
        map11.put("pnl_average", new TableInfo.Column("pnl_average", "TEXT", true, 0, null, 1));
        map11.put("ref", new TableInfo.Column("ref", "TEXT", false, 0, null, 1));
        map11.put("opening_price", new TableInfo.Column("opening_price", "TEXT", false, 0, null, 1));
        map11.put("quantity", new TableInfo.Column("quantity", "TEXT", false, 0, null, 1));
        HashSet hashSetS9 = o.s(map11, "id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1), 0);
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new TableInfo.Index("index_complex_analytics_combined_realised_pnl_request_product_types_time_span_currency", false, Arrays.asList("request_product_types", "time_span", "currency"), Arrays.asList("ASC", "ASC", "ASC")));
        TableInfo tableInfo21 = new TableInfo("complex_analytics_combined_realised_pnl", map11, hashSetS9, hashSet6);
        TableInfo tableInfo22 = TableInfo.read(sQLiteConnection, "complex_analytics_combined_realised_pnl");
        if (!tableInfo21.equals(tableInfo22)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_combined_realised_pnl(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsCombinedRealisedPnlEntity).\n Expected:\n", tableInfo21, "\n Found:\n", tableInfo22));
        }
        HashMap map12 = new HashMap(9);
        map12.put("asset_type", new TableInfo.Column("asset_type", "TEXT", true, 1, null, 1));
        map12.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 2, null, 1));
        map12.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map12.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 4, null, 1));
        map12.put("start", new TableInfo.Column("start", "INTEGER", true, 0, null, 1));
        map12.put("end", new TableInfo.Column("end", "INTEGER", true, 0, null, 1));
        map12.put("net_top_up", new TableInfo.Column("net_top_up", "TEXT", false, 0, null, 1));
        map12.put("total_return", new TableInfo.Column("total_return", "TEXT", false, 0, null, 1));
        TableInfo tableInfo23 = new TableInfo("complex_analytics_total_value_chart", map12, o.s(map12, "chart_details_type", new TableInfo.Column("chart_details_type", "TEXT", true, 5, null, 1), 0), new HashSet(0));
        TableInfo tableInfo24 = TableInfo.read(sQLiteConnection, "complex_analytics_total_value_chart");
        if (!tableInfo23.equals(tableInfo24)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_total_value_chart(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsTotalValueEntity).\n Expected:\n", tableInfo23, "\n Found:\n", tableInfo24));
        }
        HashMap map13 = new HashMap(8);
        map13.put("asset_type", new TableInfo.Column("asset_type", "TEXT", true, 1, null, 1));
        map13.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 2, null, 1));
        map13.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map13.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 4, null, 1));
        map13.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 5, null, 1));
        map13.put("amount", new TableInfo.Column("amount", "TEXT", true, 0, null, 1));
        map13.put("cumulative_net_top_up", new TableInfo.Column("cumulative_net_top_up", "TEXT", false, 0, null, 1));
        HashSet hashSetS10 = o.s(map13, "chart_details_type", new TableInfo.Column("chart_details_type", "TEXT", true, 6, null, 1), 1);
        TableInfo tableInfo25 = new TableInfo("complex_analytics_total_value_chart_point", map13, hashSetS10, b.l(hashSetS10, new TableInfo.ForeignKey("complex_analytics_total_value_chart", "CASCADE", "NO ACTION", Arrays.asList("asset_type", "time_span", "currency", "portfolio_id", "chart_details_type"), Arrays.asList("asset_type", "time_span", "currency", "portfolio_id", "chart_details_type")), 0));
        TableInfo tableInfo26 = TableInfo.read(sQLiteConnection, "complex_analytics_total_value_chart_point");
        if (!tableInfo25.equals(tableInfo26)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_total_value_chart_point(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsTotalValueChartPointEntity).\n Expected:\n", tableInfo25, "\n Found:\n", tableInfo26));
        }
        HashMap map14 = new HashMap(9);
        map14.put("asset_type", new TableInfo.Column("asset_type", "TEXT", true, 1, null, 1));
        map14.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 2, null, 1));
        map14.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map14.put("method", new TableInfo.Column("method", "TEXT", true, 4, null, 1));
        map14.put("benchmark", new TableInfo.Column("benchmark", "TEXT", true, 5, null, 1));
        map14.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 6, null, 1));
        map14.put("start", new TableInfo.Column("start", "INTEGER", true, 0, null, 1));
        map14.put("end", new TableInfo.Column("end", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo27 = new TableInfo("complex_analytics_performance_chart", map14, o.s(map14, "last_modified", new TableInfo.Column("last_modified", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo28 = TableInfo.read(sQLiteConnection, "complex_analytics_performance_chart");
        if (!tableInfo27.equals(tableInfo28)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_performance_chart(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsPerformanceChartEntity).\n Expected:\n", tableInfo27, "\n Found:\n", tableInfo28));
        }
        HashMap map15 = new HashMap(11);
        map15.put("asset_type", new TableInfo.Column("asset_type", "TEXT", true, 1, null, 1));
        map15.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 2, null, 1));
        map15.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map15.put("method", new TableInfo.Column("method", "TEXT", true, 4, null, 1));
        map15.put("benchmark_ref", new TableInfo.Column("benchmark_ref", "TEXT", true, 5, null, 1));
        map15.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 6, null, 1));
        map15.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 7, null, 1));
        map15.put("returns", new TableInfo.Column("returns", "REAL", true, 0, null, 1));
        map15.put("totalReturns", new TableInfo.Column("totalReturns", "REAL", true, 0, null, 1));
        map15.put("benchmark", new TableInfo.Column("benchmark", "REAL", false, 0, null, 1));
        HashSet hashSetS11 = o.s(map15, "pnl", new TableInfo.Column("pnl", "TEXT", true, 0, null, 1), 1);
        TableInfo tableInfo29 = new TableInfo("complex_analytics_performance_chart_point", map15, hashSetS11, b.l(hashSetS11, new TableInfo.ForeignKey("complex_analytics_performance_chart", "CASCADE", "NO ACTION", Arrays.asList("asset_type", "time_span", "currency", "method", "benchmark_ref", "portfolio_id"), Arrays.asList("asset_type", "time_span", "currency", "method", "benchmark", "portfolio_id")), 0));
        TableInfo tableInfo30 = TableInfo.read(sQLiteConnection, "complex_analytics_performance_chart_point");
        if (!tableInfo29.equals(tableInfo30)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_performance_chart_point(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsPerformanceChartPointEntity).\n Expected:\n", tableInfo29, "\n Found:\n", tableInfo30));
        }
        HashMap map16 = new HashMap(8);
        map16.put("asset_type", new TableInfo.Column("asset_type", "TEXT", true, 1, null, 1));
        map16.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 2, null, 1));
        map16.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map16.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 4, null, 1));
        map16.put("interval", new TableInfo.Column("interval", "TEXT", true, 5, null, 1));
        map16.put("start", new TableInfo.Column("start", "INTEGER", true, 0, null, 1));
        map16.put("end", new TableInfo.Column("end", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo31 = new TableInfo("complex_analytics_pnl", map16, o.s(map16, "last_modified", new TableInfo.Column("last_modified", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo32 = TableInfo.read(sQLiteConnection, "complex_analytics_pnl");
        if (!tableInfo31.equals(tableInfo32)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_pnl(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsPnlEntity).\n Expected:\n", tableInfo31, "\n Found:\n", tableInfo32));
        }
        HashMap map17 = new HashMap(10);
        map17.put("asset_type", new TableInfo.Column("asset_type", "TEXT", true, 1, null, 1));
        map17.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 2, null, 1));
        map17.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map17.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 4, null, 1));
        map17.put("interval", new TableInfo.Column("interval", "TEXT", true, 5, null, 1));
        map17.put("point_start", new TableInfo.Column("point_start", "INTEGER", true, 6, null, 1));
        map17.put("point_end", new TableInfo.Column("point_end", "INTEGER", true, 7, null, 1));
        map17.put("net_sell", new TableInfo.Column("net_sell", "TEXT", true, 0, null, 1));
        map17.put("dividends", new TableInfo.Column("dividends", "TEXT", false, 0, null, 1));
        HashSet hashSetS12 = o.s(map17, "cumulative", new TableInfo.Column("cumulative", "TEXT", true, 0, null, 1), 1);
        TableInfo tableInfo33 = new TableInfo("complex_analytics_pnl_point", map17, hashSetS12, b.l(hashSetS12, new TableInfo.ForeignKey("complex_analytics_pnl", "CASCADE", "NO ACTION", Arrays.asList("asset_type", "time_span", "currency", "portfolio_id", "interval"), Arrays.asList("asset_type", "time_span", "currency", "portfolio_id", "interval")), 0));
        TableInfo tableInfo34 = TableInfo.read(sQLiteConnection, "complex_analytics_pnl_point");
        if (!tableInfo33.equals(tableInfo34)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_pnl_point(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsPnlPointEntity).\n Expected:\n", tableInfo33, "\n Found:\n", tableInfo34));
        }
        HashMap map18 = new HashMap(4);
        map18.put("assetType", new TableInfo.Column("assetType", "TEXT", true, 1, null, 1));
        map18.put("sector", new TableInfo.Column("sector", "TEXT", true, 2, null, 1));
        map18.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        TableInfo tableInfo35 = new TableInfo("complex_analytics_sector_allocations", map18, o.s(map18, "total_value", new TableInfo.Column("total_value", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo36 = TableInfo.read(sQLiteConnection, "complex_analytics_sector_allocations");
        if (!tableInfo35.equals(tableInfo36)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_sector_allocations(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsSectorAllocationsEntity).\n Expected:\n", tableInfo35, "\n Found:\n", tableInfo36));
        }
        HashMap map19 = new HashMap(8);
        map19.put("assetType", new TableInfo.Column("assetType", "TEXT", true, 1, null, 1));
        map19.put("sector", new TableInfo.Column("sector", "TEXT", true, 2, null, 1));
        map19.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map19.put("asset", new TableInfo.Column("asset", "TEXT", true, 4, null, 1));
        map19.put("quantity", new TableInfo.Column("quantity", "TEXT", true, 0, null, 1));
        map19.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
        map19.put("allocation", new TableInfo.Column("allocation", "REAL", true, 0, null, 1));
        HashSet hashSetS13 = o.s(map19, "ref", new TableInfo.Column("ref", "TEXT", false, 0, null, 1), 1);
        TableInfo tableInfo37 = new TableInfo("complex_analytics_sector_allocations_assets", map19, hashSetS13, b.l(hashSetS13, new TableInfo.ForeignKey("complex_analytics_sector_allocations", "CASCADE", "NO ACTION", Arrays.asList("assetType", "sector", "currency"), Arrays.asList("assetType", "sector", "currency")), 0));
        TableInfo tableInfo38 = TableInfo.read(sQLiteConnection, "complex_analytics_sector_allocations_assets");
        if (!tableInfo37.equals(tableInfo38)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_sector_allocations_assets(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsSectorAllocationsAssetEntity).\n Expected:\n", tableInfo37, "\n Found:\n", tableInfo38));
        }
        HashMap map20 = new HashMap(11);
        map20.put("asset_type", new TableInfo.Column("asset_type", "TEXT", true, 1, null, 1));
        map20.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 2, null, 1));
        map20.put("method", new TableInfo.Column("method", "TEXT", true, 3, null, 1));
        map20.put("sector", new TableInfo.Column("sector", "TEXT", true, 4, null, 1));
        map20.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 5, null, 1));
        map20.put("currency", new TableInfo.Column("currency", "TEXT", true, 6, null, 1));
        map20.put("asset", new TableInfo.Column("asset", "TEXT", true, 7, null, 1));
        map20.put("pnl", new TableInfo.Column("pnl", "TEXT", true, 0, null, 1));
        map20.put("returns", new TableInfo.Column("returns", "REAL", true, 0, null, 1));
        map20.put("closedOn", new TableInfo.Column("closedOn", "TEXT", false, 0, null, 1));
        HashSet hashSetS14 = o.s(map20, "ref", new TableInfo.Column("ref", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new TableInfo.Index("index_complex_analytics_sector_contributors_asset_type_time_span_method_sector_portfolio_id_currency", false, Arrays.asList("asset_type", "time_span", "method", "sector", "portfolio_id", "currency"), Arrays.asList("ASC", "ASC", "ASC", "ASC", "ASC", "ASC")));
        TableInfo tableInfo39 = new TableInfo("complex_analytics_sector_contributors", map20, hashSetS14, hashSet7);
        TableInfo tableInfo40 = TableInfo.read(sQLiteConnection, "complex_analytics_sector_contributors");
        if (!tableInfo39.equals(tableInfo40)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_sector_contributors(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsSectorContributorsEntity).\n Expected:\n", tableInfo39, "\n Found:\n", tableInfo40));
        }
        HashMap map21 = new HashMap(8);
        map21.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 2, null, 1));
        map21.put("start", new TableInfo.Column("start", "INTEGER", true, 0, null, 1));
        map21.put("end", new TableInfo.Column("end", "INTEGER", true, 0, null, 1));
        map21.put("last_modified", new TableInfo.Column("last_modified", "INTEGER", true, 0, null, 1));
        map21.put("asset_types_id", new TableInfo.Column("asset_types_id", "TEXT", true, 1, null, 1));
        map21.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map21.put("method", new TableInfo.Column("method", "TEXT", true, 4, null, 1));
        TableInfo tableInfo41 = new TableInfo("complex_analytics_combined_performance_chart", map21, o.s(map21, "benchmark", new TableInfo.Column("benchmark", "TEXT", true, 5, null, 1), 0), new HashSet(0));
        TableInfo tableInfo42 = TableInfo.read(sQLiteConnection, "complex_analytics_combined_performance_chart");
        if (!tableInfo41.equals(tableInfo42)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_combined_performance_chart(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsCombinedPerformanceChartEntity).\n Expected:\n", tableInfo41, "\n Found:\n", tableInfo42));
        }
        HashMap map22 = new HashMap(10);
        map22.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 1, null, 1));
        map22.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 2, null, 1));
        map22.put("returns", new TableInfo.Column("returns", "REAL", true, 0, null, 1));
        map22.put("totalReturns", new TableInfo.Column("totalReturns", "REAL", true, 0, null, 1));
        map22.put("benchmark", new TableInfo.Column("benchmark", "REAL", false, 0, null, 1));
        map22.put("pnl", new TableInfo.Column("pnl", "TEXT", true, 0, null, 1));
        map22.put("asset_types_id", new TableInfo.Column("asset_types_id", "TEXT", true, 3, null, 1));
        map22.put("currency", new TableInfo.Column("currency", "TEXT", true, 4, null, 1));
        map22.put("method", new TableInfo.Column("method", "TEXT", true, 5, null, 1));
        HashSet hashSetS15 = o.s(map22, "benchmark_ref", new TableInfo.Column("benchmark_ref", "TEXT", true, 6, null, 1), 1);
        TableInfo tableInfo43 = new TableInfo("complex_analytics_combined_performance_chart_point", map22, hashSetS15, b.l(hashSetS15, new TableInfo.ForeignKey("complex_analytics_combined_performance_chart", "CASCADE", "NO ACTION", Arrays.asList("time_span", "asset_types_id", "currency", "method", "benchmark_ref"), Arrays.asList("time_span", "asset_types_id", "currency", "method", "benchmark")), 0));
        TableInfo tableInfo44 = TableInfo.read(sQLiteConnection, "complex_analytics_combined_performance_chart_point");
        if (!tableInfo43.equals(tableInfo44)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_combined_performance_chart_point(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsCombinedPerformanceChartPointEntity).\n Expected:\n", tableInfo43, "\n Found:\n", tableInfo44));
        }
        HashMap map23 = new HashMap(9);
        map23.put("user_id", new TableInfo.Column("user_id", "TEXT", true, 1, null, 1));
        map23.put("asset_types_id", new TableInfo.Column("asset_types_id", "TEXT", true, 2, null, 1));
        map23.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 3, null, 1));
        map23.put("currency", new TableInfo.Column("currency", "TEXT", true, 4, null, 1));
        map23.put("start", new TableInfo.Column("start", "INTEGER", true, 0, null, 1));
        map23.put("end", new TableInfo.Column("end", "INTEGER", true, 0, null, 1));
        map23.put("net_top_up", new TableInfo.Column("net_top_up", "TEXT", false, 0, null, 1));
        map23.put("total_return", new TableInfo.Column("total_return", "TEXT", false, 0, null, 1));
        TableInfo tableInfo45 = new TableInfo("complex_analytics_combined_total_value_chart", map23, o.s(map23, "chart_details_type", new TableInfo.Column("chart_details_type", "TEXT", true, 5, null, 1), 0), new HashSet(0));
        TableInfo tableInfo46 = TableInfo.read(sQLiteConnection, "complex_analytics_combined_total_value_chart");
        if (!tableInfo45.equals(tableInfo46)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_combined_total_value_chart(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsCombinedTotalValueEntity).\n Expected:\n", tableInfo45, "\n Found:\n", tableInfo46));
        }
        HashMap map24 = new HashMap(8);
        map24.put("user_id", new TableInfo.Column("user_id", "TEXT", true, 1, null, 1));
        map24.put("asset_types_id", new TableInfo.Column("asset_types_id", "TEXT", true, 2, null, 1));
        map24.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 3, null, 1));
        map24.put("currency", new TableInfo.Column("currency", "TEXT", true, 4, null, 1));
        map24.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 5, null, 1));
        map24.put("amount", new TableInfo.Column("amount", "TEXT", true, 0, null, 1));
        map24.put("cumulative_net_top_up", new TableInfo.Column("cumulative_net_top_up", "TEXT", false, 0, null, 1));
        HashSet hashSetS16 = o.s(map24, "chart_details_type", new TableInfo.Column("chart_details_type", "TEXT", true, 6, null, 1), 1);
        TableInfo tableInfo47 = new TableInfo("complex_analytics_combined_total_value_chart_point", map24, hashSetS16, b.l(hashSetS16, new TableInfo.ForeignKey("complex_analytics_combined_total_value_chart", "CASCADE", "NO ACTION", Arrays.asList("user_id", "asset_types_id", "time_span", "currency", "chart_details_type"), Arrays.asList("user_id", "asset_types_id", "time_span", "currency", "chart_details_type")), 0));
        TableInfo tableInfo48 = TableInfo.read(sQLiteConnection, "complex_analytics_combined_total_value_chart_point");
        if (!tableInfo47.equals(tableInfo48)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_combined_total_value_chart_point(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsCombinedTotalValuePointEntity).\n Expected:\n", tableInfo47, "\n Found:\n", tableInfo48));
        }
        HashMap map25 = new HashMap(6);
        map25.put("user_id", new TableInfo.Column("user_id", "TEXT", true, 1, null, 1));
        map25.put("asset_types_id", new TableInfo.Column("asset_types_id", "TEXT", true, 2, null, 1));
        map25.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 3, null, 1));
        map25.put("currency", new TableInfo.Column("currency", "TEXT", true, 4, null, 1));
        map25.put("start", new TableInfo.Column("start", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo49 = new TableInfo("complex_analytics_combined_pnl_chart", map25, o.s(map25, "end", new TableInfo.Column("end", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo50 = TableInfo.read(sQLiteConnection, "complex_analytics_combined_pnl_chart");
        if (!tableInfo49.equals(tableInfo50)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_combined_pnl_chart(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsCombinedPnlEntity).\n Expected:\n", tableInfo49, "\n Found:\n", tableInfo50));
        }
        HashMap map26 = new HashMap(9);
        map26.put("user_id", new TableInfo.Column("user_id", "TEXT", true, 1, null, 1));
        map26.put("asset_types_id", new TableInfo.Column("asset_types_id", "TEXT", true, 2, null, 1));
        map26.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 3, null, 1));
        map26.put("currency", new TableInfo.Column("currency", "TEXT", true, 4, null, 1));
        map26.put("point_start", new TableInfo.Column("point_start", "INTEGER", true, 0, null, 1));
        map26.put("point_end", new TableInfo.Column("point_end", "INTEGER", true, 0, null, 1));
        map26.put("net_sell", new TableInfo.Column("net_sell", "TEXT", true, 0, null, 1));
        map26.put("dividends", new TableInfo.Column("dividends", "TEXT", false, 0, null, 1));
        HashSet hashSetS17 = o.s(map26, "cumulative", new TableInfo.Column("cumulative", "TEXT", true, 0, null, 1), 1);
        TableInfo tableInfo51 = new TableInfo("complex_analytics_combined_pnl_chart_point", map26, hashSetS17, b.l(hashSetS17, new TableInfo.ForeignKey("complex_analytics_combined_pnl_chart", "CASCADE", "NO ACTION", Arrays.asList("user_id", "asset_types_id", "time_span", "currency"), Arrays.asList("user_id", "asset_types_id", "time_span", "currency")), 0));
        TableInfo tableInfo52 = TableInfo.read(sQLiteConnection, "complex_analytics_combined_pnl_chart_point");
        if (!tableInfo51.equals(tableInfo52)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_combined_pnl_chart_point(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsCombinedPnlPointEntity).\n Expected:\n", tableInfo51, "\n Found:\n", tableInfo52));
        }
        HashMap map27 = new HashMap(9);
        map27.put("time_span", new TableInfo.Column("time_span", "TEXT", true, 0, null, 1));
        map27.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map27.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 0, null, 1));
        map27.put("account_types", new TableInfo.Column("account_types", "TEXT", false, 0, null, 1));
        map27.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
        map27.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map27.put("ref", new TableInfo.Column("ref", "TEXT", true, 0, null, 1));
        map27.put("amount", new TableInfo.Column("amount", "TEXT", true, 0, null, 1));
        HashSet hashSetS18 = o.s(map27, "id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1), 0);
        HashSet hashSet8 = new HashSet(3);
        hashSet8.add(new TableInfo.Index("index_complex_analytics_dividends_time_span_currency_portfolio_id", false, Arrays.asList("time_span", "currency", "portfolio_id"), Arrays.asList("ASC", "ASC", "ASC")));
        hashSet8.add(new TableInfo.Index("index_complex_analytics_dividends_time_span_currency_portfolio_id_ref", false, Arrays.asList("time_span", "currency", "portfolio_id", "ref"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
        hashSet8.add(new TableInfo.Index("index_complex_analytics_dividends_time_span_currency_portfolio_id_account_types", false, Arrays.asList("time_span", "currency", "portfolio_id", "account_types"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
        TableInfo tableInfo53 = new TableInfo("complex_analytics_dividends", map27, hashSetS18, hashSet8);
        TableInfo tableInfo54 = TableInfo.read(sQLiteConnection, "complex_analytics_dividends");
        if (!tableInfo53.equals(tableInfo54)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_dividends(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsDividendEntity).\n Expected:\n", tableInfo53, "\n Found:\n", tableInfo54));
        }
        HashMap map28 = new HashMap(4);
        map28.put("account_types_combined", new TableInfo.Column("account_types_combined", "TEXT", true, 1, null, 1));
        map28.put("sector", new TableInfo.Column("sector", "INTEGER", true, 2, null, 1));
        map28.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        TableInfo tableInfo55 = new TableInfo("complex_analytics_combined_allocations", map28, o.s(map28, "total_value", new TableInfo.Column("total_value", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo56 = TableInfo.read(sQLiteConnection, "complex_analytics_combined_allocations");
        if (!tableInfo55.equals(tableInfo56)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_combined_allocations(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsCombinedAllocationsEntity).\n Expected:\n", tableInfo55, "\n Found:\n", tableInfo56));
        }
        HashMap map29 = new HashMap(7);
        map29.put("account_types_combined", new TableInfo.Column("account_types_combined", "TEXT", true, 1, null, 1));
        map29.put("asset_type", new TableInfo.Column("asset_type", "TEXT", true, 5, null, 1));
        map29.put("sector", new TableInfo.Column("sector", "INTEGER", true, 2, null, 1));
        map29.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map29.put("asset", new TableInfo.Column("asset", "TEXT", true, 4, null, 1));
        map29.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
        HashSet hashSetS19 = o.s(map29, "allocation", new TableInfo.Column("allocation", "REAL", true, 0, null, 1), 1);
        HashSet hashSetL = b.l(hashSetS19, new TableInfo.ForeignKey("complex_analytics_combined_allocations", "CASCADE", "NO ACTION", Arrays.asList("account_types_combined", "sector", "currency"), Arrays.asList("account_types_combined", "sector", "currency")), 1);
        hashSetL.add(new TableInfo.Index("index_complex_analytics_combined_allocations_cash_account_types_combined_sector_currency", false, Arrays.asList("account_types_combined", "sector", "currency"), Arrays.asList("ASC", "ASC", "ASC")));
        TableInfo tableInfo57 = new TableInfo("complex_analytics_combined_allocations_cash", map29, hashSetS19, hashSetL);
        TableInfo tableInfo58 = TableInfo.read(sQLiteConnection, "complex_analytics_combined_allocations_cash");
        if (!tableInfo57.equals(tableInfo58)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_combined_allocations_cash(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsCombinedAllocationsCashEntity).\n Expected:\n", tableInfo57, "\n Found:\n", tableInfo58));
        }
        HashMap map30 = new HashMap(13);
        map30.put("account_types_combined", new TableInfo.Column("account_types_combined", "TEXT", true, 1, null, 1));
        map30.put("asset_type", new TableInfo.Column("asset_type", "TEXT", true, 5, null, 1));
        map30.put("sector", new TableInfo.Column("sector", "INTEGER", true, 2, null, 1));
        map30.put("currency", new TableInfo.Column("currency", "TEXT", true, 3, null, 1));
        map30.put("asset", new TableInfo.Column("asset", "TEXT", true, 4, null, 1));
        map30.put("quantity", new TableInfo.Column("quantity", "TEXT", true, 0, null, 1));
        map30.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
        map30.put("allocation", new TableInfo.Column("allocation", "REAL", true, 0, null, 1));
        map30.put("ref", new TableInfo.Column("ref", "TEXT", false, 0, null, 1));
        map30.put("opening_price", new TableInfo.Column("opening_price", "TEXT", false, 0, null, 1));
        map30.put("current_price", new TableInfo.Column("current_price", "TEXT", false, 0, null, 1));
        map30.put("position_id", new TableInfo.Column("position_id", "TEXT", false, 0, null, 1));
        HashSet hashSetS20 = o.s(map30, "leverage", new TableInfo.Column("leverage", "TEXT", false, 0, null, 1), 1);
        HashSet hashSetL2 = b.l(hashSetS20, new TableInfo.ForeignKey("complex_analytics_combined_allocations", "CASCADE", "NO ACTION", Arrays.asList("account_types_combined", "sector", "currency"), Arrays.asList("account_types_combined", "sector", "currency")), 1);
        hashSetL2.add(new TableInfo.Index("index_complex_analytics_combined_allocations_assets_account_types_combined_sector_currency", false, Arrays.asList("account_types_combined", "sector", "currency"), Arrays.asList("ASC", "ASC", "ASC")));
        TableInfo tableInfo59 = new TableInfo("complex_analytics_combined_allocations_assets", map30, hashSetS20, hashSetL2);
        TableInfo tableInfo60 = TableInfo.read(sQLiteConnection, "complex_analytics_combined_allocations_assets");
        return !tableInfo59.equals(tableInfo60) ? new RoomOpenDelegate.ValidationResult(false, o.o("complex_analytics_combined_allocations_assets(com.revolut.feature.wealth.analytics.data.database.models.complex_analytics.ComplexAnalyticsCombinedAllocationsAssetEntity).\n Expected:\n", tableInfo59, "\n Found:\n", tableInfo60)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
