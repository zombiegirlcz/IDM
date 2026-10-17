package i3f;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.trading.impl.data.database.TradingDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;
import r6.b;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TradingDatabase_Impl f158201a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TradingDatabase_Impl tradingDatabase_Impl) {
        super(155, "d21a6009e9cfae652e85b51a86debf63", "31b9b1af740e70b00d4463096efb1c07");
        this.f158201a = tradingDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `holdings` (`id` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `creation_date` INTEGER, `holding_state` TEXT NOT NULL, `name` TEXT NOT NULL, `currency` TEXT NOT NULL, `cash_holding` TEXT, `stock_holding` TEXT, PRIMARY KEY(`id`, `portfolio_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `portfolios` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `asset_types` TEXT NOT NULL, `balance` TEXT, `kyc` TEXT NOT NULL, `disclosures` TEXT NOT NULL, `info` TEXT NOT NULL, `onboardedDate` INTEGER, `offboardedDate` INTEGER, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `trading_trades` (`trade_id` TEXT NOT NULL, `compound_id` TEXT, `ref` TEXT NOT NULL, `holding_id` TEXT NOT NULL, `state` TEXT NOT NULL, `completed_at` INTEGER, `updated_at` INTEGER, `created_at` INTEGER NOT NULL, `stock_trade` TEXT, `cash_trade` TEXT, `dividend_trade` TEXT, `coupon` TEXT, `redemption` TEXT, `custody_fees` TEXT, `margin_trade` TEXT, `commodity_trade` TEXT, `exchange_trade` TEXT, `stock_transfer_trade` TEXT, `cash_transfer_trade` TEXT, `fee_trade` TEXT, `fund_trade` TEXT, `value` TEXT NOT NULL, `settlementDate` INTEGER, `slip_transaction` INTEGER NOT NULL, `stock_transfer_fee` INTEGER NOT NULL, `commission_refund` INTEGER NOT NULL, `refund` TEXT, `overnight_fee` TEXT, `standing_order_id` TEXT, `client_order_id` TEXT, `account_type` TEXT NOT NULL, `portfolio_id` TEXT, `price_adjustment` TEXT, `base_instrument_currency` TEXT, `counter_instrument_currency` TEXT, `badge` TEXT, `deficit_adjustment` INTEGER NOT NULL, `stock_promotion_clawback` INTEGER NOT NULL, `transfer_request_id` TEXT, `merger` TEXT, `spin_off` TEXT, `stock_split` TEXT, `initiated_by` TEXT, `account_holder_type` TEXT NOT NULL, `awaiting_settlement` INTEGER, `currency_pair_first` TEXT, `currency_pair_second` TEXT, PRIMARY KEY(`trade_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_trading_trades_holding_id_created_at` ON `trading_trades` (`holding_id`, `created_at`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_trading_trades_created_at` ON `trading_trades` (`created_at`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_trading_trades_account_type_completed_at_updated_at_created_at` ON `trading_trades` (`account_type`, `completed_at`, `updated_at`, `created_at`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_trading_trades_compound_id` ON `trading_trades` (`compound_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_trading_trades_holding_id` ON `trading_trades` (`holding_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `reports` (`portfolioId` TEXT NOT NULL, `from` INTEGER NOT NULL, `to` INTEGER NOT NULL, PRIMARY KEY(`portfolioId`, `from`, `to`), FOREIGN KEY(`portfolioId`) REFERENCES `portfolios`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `us_reports` (`portfolioId` TEXT NOT NULL, `from` INTEGER NOT NULL, `to` INTEGER NOT NULL, PRIMARY KEY(`portfolioId`, `from`, `to`), FOREIGN KEY(`portfolioId`) REFERENCES `portfolios`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `entities_adt` (`id` TEXT NOT NULL, `completed_date` TEXT NOT NULL, `updated_date` TEXT NOT NULL, `trade_symbol` TEXT, `trade_ref` TEXT, `trade_amount` TEXT, `trade_quantity` REAL, `trade_fees` TEXT, `trade_commission` TEXT, `trade_executed_price` TEXT, `trade_side` TEXT, `cash_amount` TEXT, `cash_side` TEXT, `divident_symbol` TEXT, `divident_ref` TEXT, `divident_amount` TEXT, `divident_tax_symbol` TEXT, `divident_tax_ref` TEXT, `divident_tax_fees` TEXT, `custody_fees` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_entities_adt_completed_date` ON `entities_adt` (`completed_date`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_entities_adt_updated_date` ON `entities_adt` (`updated_date`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd21a6009e9cfae652e85b51a86debf63')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `holdings`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `portfolios`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `trading_trades`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `reports`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `us_reports`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `entities_adt`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = TradingDatabase_Impl.o;
        this.f158201a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(8);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 2, null, 1));
        map.put("creation_date", new TableInfo.Column("creation_date", "INTEGER", false, 0, null, 1));
        map.put("holding_state", new TableInfo.Column("holding_state", "TEXT", true, 0, null, 1));
        map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map.put("cash_holding", new TableInfo.Column("cash_holding", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("holdings", map, o.s(map, "stock_holding", new TableInfo.Column("stock_holding", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "holdings");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("holdings(com.revolut.feature.trading.impl.data.database.model.holdings.HoldingDeprecatedEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(9);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map2.put("asset_types", new TableInfo.Column("asset_types", "TEXT", true, 0, null, 1));
        map2.put("balance", new TableInfo.Column("balance", "TEXT", false, 0, null, 1));
        map2.put("kyc", new TableInfo.Column("kyc", "TEXT", true, 0, null, 1));
        map2.put("disclosures", new TableInfo.Column("disclosures", "TEXT", true, 0, null, 1));
        map2.put("info", new TableInfo.Column("info", "TEXT", true, 0, null, 1));
        map2.put("onboardedDate", new TableInfo.Column("onboardedDate", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("portfolios", map2, o.s(map2, "offboardedDate", new TableInfo.Column("offboardedDate", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "portfolios");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("portfolios(com.revolut.feature.trading.impl.data.database.model.portfolio.PortfolioDeprecatedEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(47);
        map3.put("trade_id", new TableInfo.Column("trade_id", "TEXT", true, 1, null, 1));
        map3.put("compound_id", new TableInfo.Column("compound_id", "TEXT", false, 0, null, 1));
        map3.put("ref", new TableInfo.Column("ref", "TEXT", true, 0, null, 1));
        map3.put("holding_id", new TableInfo.Column("holding_id", "TEXT", true, 0, null, 1));
        map3.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map3.put("completed_at", new TableInfo.Column("completed_at", "INTEGER", false, 0, null, 1));
        map3.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", false, 0, null, 1));
        map3.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, 1));
        map3.put("stock_trade", new TableInfo.Column("stock_trade", "TEXT", false, 0, null, 1));
        map3.put("cash_trade", new TableInfo.Column("cash_trade", "TEXT", false, 0, null, 1));
        map3.put("dividend_trade", new TableInfo.Column("dividend_trade", "TEXT", false, 0, null, 1));
        map3.put("coupon", new TableInfo.Column("coupon", "TEXT", false, 0, null, 1));
        map3.put("redemption", new TableInfo.Column("redemption", "TEXT", false, 0, null, 1));
        map3.put("custody_fees", new TableInfo.Column("custody_fees", "TEXT", false, 0, null, 1));
        map3.put("margin_trade", new TableInfo.Column("margin_trade", "TEXT", false, 0, null, 1));
        map3.put("commodity_trade", new TableInfo.Column("commodity_trade", "TEXT", false, 0, null, 1));
        map3.put("exchange_trade", new TableInfo.Column("exchange_trade", "TEXT", false, 0, null, 1));
        map3.put("stock_transfer_trade", new TableInfo.Column("stock_transfer_trade", "TEXT", false, 0, null, 1));
        map3.put("cash_transfer_trade", new TableInfo.Column("cash_transfer_trade", "TEXT", false, 0, null, 1));
        map3.put("fee_trade", new TableInfo.Column("fee_trade", "TEXT", false, 0, null, 1));
        map3.put("fund_trade", new TableInfo.Column("fund_trade", "TEXT", false, 0, null, 1));
        map3.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
        map3.put("settlementDate", new TableInfo.Column("settlementDate", "INTEGER", false, 0, null, 1));
        map3.put("slip_transaction", new TableInfo.Column("slip_transaction", "INTEGER", true, 0, null, 1));
        map3.put("stock_transfer_fee", new TableInfo.Column("stock_transfer_fee", "INTEGER", true, 0, null, 1));
        map3.put("commission_refund", new TableInfo.Column("commission_refund", "INTEGER", true, 0, null, 1));
        map3.put("refund", new TableInfo.Column("refund", "TEXT", false, 0, null, 1));
        map3.put("overnight_fee", new TableInfo.Column("overnight_fee", "TEXT", false, 0, null, 1));
        map3.put("standing_order_id", new TableInfo.Column("standing_order_id", "TEXT", false, 0, null, 1));
        map3.put("client_order_id", new TableInfo.Column("client_order_id", "TEXT", false, 0, null, 1));
        map3.put("account_type", new TableInfo.Column("account_type", "TEXT", true, 0, null, 1));
        map3.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", false, 0, null, 1));
        map3.put("price_adjustment", new TableInfo.Column("price_adjustment", "TEXT", false, 0, null, 1));
        map3.put("base_instrument_currency", new TableInfo.Column("base_instrument_currency", "TEXT", false, 0, null, 1));
        map3.put("counter_instrument_currency", new TableInfo.Column("counter_instrument_currency", "TEXT", false, 0, null, 1));
        map3.put("badge", new TableInfo.Column("badge", "TEXT", false, 0, null, 1));
        map3.put("deficit_adjustment", new TableInfo.Column("deficit_adjustment", "INTEGER", true, 0, null, 1));
        map3.put("stock_promotion_clawback", new TableInfo.Column("stock_promotion_clawback", "INTEGER", true, 0, null, 1));
        map3.put("transfer_request_id", new TableInfo.Column("transfer_request_id", "TEXT", false, 0, null, 1));
        map3.put("merger", new TableInfo.Column("merger", "TEXT", false, 0, null, 1));
        map3.put("spin_off", new TableInfo.Column("spin_off", "TEXT", false, 0, null, 1));
        map3.put("stock_split", new TableInfo.Column("stock_split", "TEXT", false, 0, null, 1));
        map3.put("initiated_by", new TableInfo.Column("initiated_by", "TEXT", false, 0, null, 1));
        map3.put("account_holder_type", new TableInfo.Column("account_holder_type", "TEXT", true, 0, null, 1));
        map3.put("awaiting_settlement", new TableInfo.Column("awaiting_settlement", "INTEGER", false, 0, null, 1));
        map3.put("currency_pair_first", new TableInfo.Column("currency_pair_first", "TEXT", false, 0, null, 1));
        HashSet hashSetS = o.s(map3, "currency_pair_second", new TableInfo.Column("currency_pair_second", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet = new HashSet(5);
        hashSet.add(new TableInfo.Index("index_trading_trades_holding_id_created_at", false, Arrays.asList("holding_id", "created_at"), Arrays.asList("ASC", "ASC")));
        hashSet.add(new TableInfo.Index("index_trading_trades_created_at", false, Arrays.asList("created_at"), Arrays.asList("ASC")));
        hashSet.add(new TableInfo.Index("index_trading_trades_account_type_completed_at_updated_at_created_at", false, Arrays.asList("account_type", "completed_at", "updated_at", "created_at"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
        hashSet.add(new TableInfo.Index("index_trading_trades_compound_id", false, Arrays.asList("compound_id"), Arrays.asList("ASC")));
        hashSet.add(new TableInfo.Index("index_trading_trades_holding_id", false, Arrays.asList("holding_id"), Arrays.asList("ASC")));
        TableInfo tableInfo5 = new TableInfo("trading_trades", map3, hashSetS, hashSet);
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "trading_trades");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("trading_trades(com.revolut.feature.trading.impl.data.database.model.TradeEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(3);
        map4.put("portfolioId", new TableInfo.Column("portfolioId", "TEXT", true, 1, null, 1));
        map4.put("from", new TableInfo.Column("from", "INTEGER", true, 2, null, 1));
        HashSet hashSetS2 = o.s(map4, "to", new TableInfo.Column("to", "INTEGER", true, 3, null, 1), 1);
        TableInfo tableInfo7 = new TableInfo("reports", map4, hashSetS2, b.l(hashSetS2, new TableInfo.ForeignKey("portfolios", "CASCADE", "NO ACTION", Arrays.asList("portfolioId"), Arrays.asList("id")), 0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "reports");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("reports(com.revolut.feature.trading.impl.data.database.model.reports.ReportEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(3);
        map5.put("portfolioId", new TableInfo.Column("portfolioId", "TEXT", true, 1, null, 1));
        map5.put("from", new TableInfo.Column("from", "INTEGER", true, 2, null, 1));
        HashSet hashSetS3 = o.s(map5, "to", new TableInfo.Column("to", "INTEGER", true, 3, null, 1), 1);
        TableInfo tableInfo9 = new TableInfo("us_reports", map5, hashSetS3, b.l(hashSetS3, new TableInfo.ForeignKey("portfolios", "CASCADE", "NO ACTION", Arrays.asList("portfolioId"), Arrays.asList("id")), 0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "us_reports");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("us_reports(com.revolut.feature.trading.impl.data.database.model.reports.UsReportEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(20);
        map6.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map6.put("completed_date", new TableInfo.Column("completed_date", "TEXT", true, 0, null, 1));
        map6.put("updated_date", new TableInfo.Column("updated_date", "TEXT", true, 0, null, 1));
        map6.put("trade_symbol", new TableInfo.Column("trade_symbol", "TEXT", false, 0, null, 1));
        map6.put("trade_ref", new TableInfo.Column("trade_ref", "TEXT", false, 0, null, 1));
        map6.put("trade_amount", new TableInfo.Column("trade_amount", "TEXT", false, 0, null, 1));
        map6.put("trade_quantity", new TableInfo.Column("trade_quantity", "REAL", false, 0, null, 1));
        map6.put("trade_fees", new TableInfo.Column("trade_fees", "TEXT", false, 0, null, 1));
        map6.put("trade_commission", new TableInfo.Column("trade_commission", "TEXT", false, 0, null, 1));
        map6.put("trade_executed_price", new TableInfo.Column("trade_executed_price", "TEXT", false, 0, null, 1));
        map6.put("trade_side", new TableInfo.Column("trade_side", "TEXT", false, 0, null, 1));
        map6.put("cash_amount", new TableInfo.Column("cash_amount", "TEXT", false, 0, null, 1));
        map6.put("cash_side", new TableInfo.Column("cash_side", "TEXT", false, 0, null, 1));
        map6.put("divident_symbol", new TableInfo.Column("divident_symbol", "TEXT", false, 0, null, 1));
        map6.put("divident_ref", new TableInfo.Column("divident_ref", "TEXT", false, 0, null, 1));
        map6.put("divident_amount", new TableInfo.Column("divident_amount", "TEXT", false, 0, null, 1));
        map6.put("divident_tax_symbol", new TableInfo.Column("divident_tax_symbol", "TEXT", false, 0, null, 1));
        map6.put("divident_tax_ref", new TableInfo.Column("divident_tax_ref", "TEXT", false, 0, null, 1));
        map6.put("divident_tax_fees", new TableInfo.Column("divident_tax_fees", "TEXT", false, 0, null, 1));
        HashSet hashSetS4 = o.s(map6, "custody_fees", new TableInfo.Column("custody_fees", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new TableInfo.Index("index_entities_adt_completed_date", false, Arrays.asList("completed_date"), Arrays.asList("ASC")));
        hashSet2.add(new TableInfo.Index("index_entities_adt_updated_date", false, Arrays.asList("updated_date"), Arrays.asList("ASC")));
        TableInfo tableInfo11 = new TableInfo("entities_adt", map6, hashSetS4, hashSet2);
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "entities_adt");
        return !tableInfo11.equals(tableInfo12) ? new RoomOpenDelegate.ValidationResult(false, o.o("entities_adt(com.revolut.feature.trading.impl.data.database.model.TradingEventAdtDeprecatedEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
