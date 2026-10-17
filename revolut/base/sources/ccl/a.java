package ccl;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WealthDomainDatabase_Impl f23126a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WealthDomainDatabase_Impl wealthDomainDatabase_Impl) {
        super(24, "2f083e96ec12311144487965be247b13", "85a06da26e5bf11676e9237656e98ebd");
        this.f23126a = wealthDomainDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `recently_viewed_instrument` (`ref` TEXT NOT NULL, `last_seen` INTEGER NOT NULL, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `instruments` (`id` TEXT NOT NULL, `ref` TEXT NOT NULL, `type` TEXT NOT NULL, `name` TEXT NOT NULL, `symbol` TEXT NOT NULL, `stateDetails` TEXT NOT NULL, `requiredProducts` TEXT, `typeSpecificProperties` TEXT, `currency` TEXT NOT NULL, `sortOrder` INTEGER, `isin` TEXT, `exchange` TEXT NOT NULL, `shortOverview` TEXT, `quantityDecimalPlaces` INTEGER NOT NULL, `priceDecimalPlaces` INTEGER, `allSymbols` TEXT NOT NULL, `underlying_currency` TEXT, `promotion_campaigns` TEXT, `list_status` TEXT, `state_reason` TEXT, `delist_date` INTEGER, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_instruments_symbol` ON `instruments` (`symbol`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `instrument_tickers` (`ref` TEXT NOT NULL, `symbol` TEXT NOT NULL, `type` TEXT NOT NULL, `price` TEXT NOT NULL, `pricePrecise` TEXT, `lastClean` TEXT, `halted` INTEGER NOT NULL, `status` TEXT NOT NULL, `delayed` INTEGER NOT NULL, `previous` TEXT, `previousPrecise` TEXT, `next_open_utc_timestamp` INTEGER, `updatedAt` INTEGER NOT NULL, `previousClose` TEXT, `previousClosePrecise` TEXT, `baseline` TEXT, `lastClose` TEXT, `lastClosePrecise` TEXT, `lastBid` TEXT, `lastAsk` TEXT, `tradingSession` TEXT NOT NULL, `lastYtm` TEXT, `lastCloseYtm` TEXT, `previousYtm` TEXT, `previousCloseYtm` TEXT, `tickerType` TEXT, `lastFmv` TEXT, `fmvUpdatedAt` INTEGER, `lastMid` TEXT, `lastBidSize` INTEGER, `lastAskSize` INTEGER, `dayVolume` INTEGER, `openInterest` INTEGER, `impliedVolatility` TEXT, `delta` TEXT, `gamma` TEXT, `theta` TEXT, `vega` TEXT, `probabilityOfProfit` TEXT, `breakEven` TEXT, `effectiveLeverage` TEXT, `contractSize` INTEGER, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `instrument_tickers_summary` (`ref` TEXT NOT NULL, `volume` TEXT, `unitVolume` INTEGER, `dailyRange` TEXT, `fiftyTwoWeekRange` TEXT, `fiveYearRange` TEXT, `highlyVolatile` INTEGER, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `portfolioSettings` (`portfolioId` TEXT NOT NULL, `stockBuyBlockState` TEXT NOT NULL, `stockBuyBlockDeactivationTime` INTEGER, PRIMARY KEY(`portfolioId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `reports` (`portfolioId` TEXT NOT NULL, `fromEpochDay` INTEGER NOT NULL, `toEpochDay` INTEGER NOT NULL, PRIMARY KEY(`portfolioId`, `fromEpochDay`, `toEpochDay`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `us_reports` (`portfolioId` TEXT NOT NULL, `fromEpochDay` INTEGER NOT NULL, `toEpochDay` INTEGER NOT NULL, PRIMARY KEY(`portfolioId`, `fromEpochDay`, `toEpochDay`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `portfolios` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `asset_types` TEXT NOT NULL, `balance` TEXT, `kyc` TEXT NOT NULL, `disclosures` TEXT NOT NULL, `info` TEXT NOT NULL, `onboardedDate` INTEGER, `offboardedDate` INTEGER, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `holdings` (`id` TEXT NOT NULL, `portfolio_id` TEXT NOT NULL, `creation_date` INTEGER, `holding_state` TEXT NOT NULL, `name` TEXT NOT NULL, `currency` TEXT NOT NULL, `cash_holding` TEXT, `stock_holding` TEXT, PRIMARY KEY(`id`, `portfolio_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `bond_details` (`ref` TEXT NOT NULL, `symbol` TEXT NOT NULL, `stock_exchange_code` TEXT NOT NULL, `issue` TEXT NOT NULL, `issuer` TEXT NOT NULL, `coupon` TEXT NOT NULL, `primary_stats` TEXT NOT NULL, `ratings` TEXT, `callability` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `cfd_details` (`ref` TEXT NOT NULL, `symbol` TEXT NOT NULL, `stock_exchange_code` TEXT NOT NULL, `description` TEXT, `kidUrl` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `etf_details` (`ref` TEXT NOT NULL, `symbol` TEXT NOT NULL, `description` TEXT, `stockExchangeCode` TEXT NOT NULL, `stats` TEXT, `exposure` TEXT, `prospectusUrl` TEXT, `kidUrl` TEXT, `tags` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `instrument_details` (`ref` TEXT NOT NULL, `symbol` TEXT NOT NULL, `description` TEXT, `stockExchangeCode` TEXT NOT NULL, `stats` TEXT, `sector` TEXT NOT NULL, `type` TEXT NOT NULL, `analystsSummary` TEXT, `tags` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `fund_details` (`ref` TEXT NOT NULL, `symbol` TEXT NOT NULL, `exchange` TEXT NOT NULL, `fundHouse` TEXT, `fundManager` TEXT, `performance` TEXT, `documents` TEXT, `keyDetails` TEXT, `exposure` TEXT, `concentration` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `mutual_fund_details` (`ref` TEXT NOT NULL, `symbol` TEXT NOT NULL, `exchange` TEXT NOT NULL, `documents` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `instrument_details_recommendations` (`ref` TEXT NOT NULL, `recommendations` TEXT NOT NULL, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `instrument_governance` (`ref` TEXT NOT NULL, `targetMarket` TEXT NOT NULL, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `stocks_historical_rates` (`ref` TEXT NOT NULL, `period` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `valueType` TEXT NOT NULL, `price` TEXT, `percentageYtm` TEXT, PRIMARY KEY(`ref`, `period`, `timestamp`, `valueType`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `candle_sticks` (`ref` TEXT NOT NULL, `period` TEXT NOT NULL, `open` TEXT NOT NULL, `close` TEXT NOT NULL, `high` TEXT NOT NULL, `low` TEXT NOT NULL, `volume` INTEGER NOT NULL, `from` INTEGER NOT NULL, `to` INTEGER NOT NULL, `startClose` TEXT NOT NULL, `endClose` TEXT NOT NULL, `baseline` TEXT, PRIMARY KEY(`ref`, `period`, `from`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `instrument_drawdown` (`ref` TEXT NOT NULL, `timespan` TEXT NOT NULL, `interval` TEXT NOT NULL, `drawdownMax` TEXT NOT NULL, `referenceDrawdownMax` TEXT, PRIMARY KEY(`ref`, `timespan`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `bond_stats` (`ref` TEXT NOT NULL, `price` TEXT NOT NULL, `primaryStats` TEXT NOT NULL, `yieldStats` TEXT NOT NULL, `riskStats` TEXT NOT NULL, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `etf_stats` (`ref` TEXT NOT NULL, `price` TEXT, `marketCapitalization` TEXT, `dividends` TEXT, `expenseRatios` TEXT, `managementFees` TEXT, `charges` TEXT, `riskRating` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `instrument_stats` (`ref` TEXT NOT NULL, `price` TEXT NOT NULL, `volume` TEXT NOT NULL, `marketCap` TEXT NOT NULL, `perShare` TEXT NOT NULL, `dividend` TEXT NOT NULL, `valuation` TEXT NOT NULL, `profitability` TEXT NOT NULL, `managementEffectiveness` TEXT NOT NULL, `listingData` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `note_details` (`ref` TEXT NOT NULL, `symbol` TEXT NOT NULL, `stock_exchange_code` TEXT NOT NULL, `description` TEXT, `lifecycle` TEXT NOT NULL, `coupon` TEXT, `call` TEXT, `capital_protection` TEXT, `final_payout` TEXT, `key_drivers` TEXT NOT NULL, `underlying_assets` TEXT NOT NULL, `issuer` TEXT NOT NULL, `main_indicators` TEXT, `payout_scenarios` TEXT, `payout_scenarios_graph` TEXT, `performance_trackers` TEXT, `loss_probability` TEXT, `reference_asset` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `ipo_instrument_details` (`ref` TEXT NOT NULL, `launchDate` INTEGER NOT NULL, `cancellationDeadline` INTEGER, `disclaimerWorkflowId` TEXT, `acknowledgementWorkflowId` TEXT, `priceRangeLow` TEXT NOT NULL, `priceRangeHigh` TEXT NOT NULL, `bookBuildingAvailable` INTEGER NOT NULL DEFAULT 0, `documents` TEXT NOT NULL, `details` TEXT NOT NULL, `sections` TEXT NOT NULL, `finalPriceDate` INTEGER, `barChartDetails` TEXT, `lineChartDetails` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `ipo_instrument_summary` (`ref` TEXT NOT NULL, `launchDate` INTEGER NOT NULL, `cancellationDeadline` INTEGER, `disclaimerWorkflowId` TEXT, `acknowledgementWorkflowId` TEXT, `priceRangeLow` TEXT NOT NULL, `priceRangeHigh` TEXT NOT NULL, `finalPriceDate` INTEGER, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2f083e96ec12311144487965be247b13')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `recently_viewed_instrument`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `instruments`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `instrument_tickers`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `instrument_tickers_summary`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `portfolioSettings`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `reports`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `us_reports`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `portfolios`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `holdings`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `bond_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `cfd_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `etf_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `instrument_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `fund_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `mutual_fund_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `instrument_details_recommendations`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `instrument_governance`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `stocks_historical_rates`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `candle_sticks`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `instrument_drawdown`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `bond_stats`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `etf_stats`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `instrument_stats`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `note_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `ipo_instrument_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `ipo_instrument_summary`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = WealthDomainDatabase_Impl.I;
        this.f23126a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(2);
        map.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        TableInfo tableInfo = new TableInfo("recently_viewed_instrument", map, o.s(map, "last_seen", new TableInfo.Column("last_seen", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "recently_viewed_instrument");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("recently_viewed_instrument(com.revolut.shared.feature.wealth.domain.impl.data.database.model.RecentlyViewedStockEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(21);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("ref", new TableInfo.Column("ref", "TEXT", true, 0, null, 1));
        map2.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map2.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map2.put("stateDetails", new TableInfo.Column("stateDetails", "TEXT", true, 0, null, 1));
        map2.put("requiredProducts", new TableInfo.Column("requiredProducts", "TEXT", false, 0, null, 1));
        map2.put("typeSpecificProperties", new TableInfo.Column("typeSpecificProperties", "TEXT", false, 0, null, 1));
        map2.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map2.put("sortOrder", new TableInfo.Column("sortOrder", "INTEGER", false, 0, null, 1));
        map2.put("isin", new TableInfo.Column("isin", "TEXT", false, 0, null, 1));
        map2.put("exchange", new TableInfo.Column("exchange", "TEXT", true, 0, null, 1));
        map2.put("shortOverview", new TableInfo.Column("shortOverview", "TEXT", false, 0, null, 1));
        map2.put("quantityDecimalPlaces", new TableInfo.Column("quantityDecimalPlaces", "INTEGER", true, 0, null, 1));
        map2.put("priceDecimalPlaces", new TableInfo.Column("priceDecimalPlaces", "INTEGER", false, 0, null, 1));
        map2.put("allSymbols", new TableInfo.Column("allSymbols", "TEXT", true, 0, null, 1));
        map2.put("underlying_currency", new TableInfo.Column("underlying_currency", "TEXT", false, 0, null, 1));
        map2.put("promotion_campaigns", new TableInfo.Column("promotion_campaigns", "TEXT", false, 0, null, 1));
        map2.put("list_status", new TableInfo.Column("list_status", "TEXT", false, 0, null, 1));
        map2.put("state_reason", new TableInfo.Column("state_reason", "TEXT", false, 0, null, 1));
        HashSet hashSetS = o.s(map2, "delist_date", new TableInfo.Column("delist_date", "INTEGER", false, 0, null, 1), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new TableInfo.Index("index_instruments_symbol", false, Arrays.asList("symbol"), Arrays.asList("ASC")));
        TableInfo tableInfo3 = new TableInfo("instruments", map2, hashSetS, hashSet);
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "instruments");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("instruments(com.revolut.shared.feature.wealth.domain.impl.data.database.model.InstrumentEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(42);
        map3.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map3.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map3.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map3.put("price", new TableInfo.Column("price", "TEXT", true, 0, null, 1));
        map3.put("pricePrecise", new TableInfo.Column("pricePrecise", "TEXT", false, 0, null, 1));
        map3.put("lastClean", new TableInfo.Column("lastClean", "TEXT", false, 0, null, 1));
        map3.put("halted", new TableInfo.Column("halted", "INTEGER", true, 0, null, 1));
        map3.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
        map3.put("delayed", new TableInfo.Column("delayed", "INTEGER", true, 0, null, 1));
        map3.put("previous", new TableInfo.Column("previous", "TEXT", false, 0, null, 1));
        map3.put("previousPrecise", new TableInfo.Column("previousPrecise", "TEXT", false, 0, null, 1));
        map3.put("next_open_utc_timestamp", new TableInfo.Column("next_open_utc_timestamp", "INTEGER", false, 0, null, 1));
        map3.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, 1));
        map3.put("previousClose", new TableInfo.Column("previousClose", "TEXT", false, 0, null, 1));
        map3.put("previousClosePrecise", new TableInfo.Column("previousClosePrecise", "TEXT", false, 0, null, 1));
        map3.put("baseline", new TableInfo.Column("baseline", "TEXT", false, 0, null, 1));
        map3.put("lastClose", new TableInfo.Column("lastClose", "TEXT", false, 0, null, 1));
        map3.put("lastClosePrecise", new TableInfo.Column("lastClosePrecise", "TEXT", false, 0, null, 1));
        map3.put("lastBid", new TableInfo.Column("lastBid", "TEXT", false, 0, null, 1));
        map3.put("lastAsk", new TableInfo.Column("lastAsk", "TEXT", false, 0, null, 1));
        map3.put("tradingSession", new TableInfo.Column("tradingSession", "TEXT", true, 0, null, 1));
        map3.put("lastYtm", new TableInfo.Column("lastYtm", "TEXT", false, 0, null, 1));
        map3.put("lastCloseYtm", new TableInfo.Column("lastCloseYtm", "TEXT", false, 0, null, 1));
        map3.put("previousYtm", new TableInfo.Column("previousYtm", "TEXT", false, 0, null, 1));
        map3.put("previousCloseYtm", new TableInfo.Column("previousCloseYtm", "TEXT", false, 0, null, 1));
        map3.put("tickerType", new TableInfo.Column("tickerType", "TEXT", false, 0, null, 1));
        map3.put("lastFmv", new TableInfo.Column("lastFmv", "TEXT", false, 0, null, 1));
        map3.put("fmvUpdatedAt", new TableInfo.Column("fmvUpdatedAt", "INTEGER", false, 0, null, 1));
        map3.put("lastMid", new TableInfo.Column("lastMid", "TEXT", false, 0, null, 1));
        map3.put("lastBidSize", new TableInfo.Column("lastBidSize", "INTEGER", false, 0, null, 1));
        map3.put("lastAskSize", new TableInfo.Column("lastAskSize", "INTEGER", false, 0, null, 1));
        map3.put("dayVolume", new TableInfo.Column("dayVolume", "INTEGER", false, 0, null, 1));
        map3.put("openInterest", new TableInfo.Column("openInterest", "INTEGER", false, 0, null, 1));
        map3.put("impliedVolatility", new TableInfo.Column("impliedVolatility", "TEXT", false, 0, null, 1));
        map3.put("delta", new TableInfo.Column("delta", "TEXT", false, 0, null, 1));
        map3.put("gamma", new TableInfo.Column("gamma", "TEXT", false, 0, null, 1));
        map3.put("theta", new TableInfo.Column("theta", "TEXT", false, 0, null, 1));
        map3.put("vega", new TableInfo.Column("vega", "TEXT", false, 0, null, 1));
        map3.put("probabilityOfProfit", new TableInfo.Column("probabilityOfProfit", "TEXT", false, 0, null, 1));
        map3.put("breakEven", new TableInfo.Column("breakEven", "TEXT", false, 0, null, 1));
        map3.put("effectiveLeverage", new TableInfo.Column("effectiveLeverage", "TEXT", false, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("instrument_tickers", map3, o.s(map3, "contractSize", new TableInfo.Column("contractSize", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "instrument_tickers");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("instrument_tickers(com.revolut.shared.feature.wealth.domain.impl.data.database.model.InstrumentTickerEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(7);
        map4.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map4.put("volume", new TableInfo.Column("volume", "TEXT", false, 0, null, 1));
        map4.put("unitVolume", new TableInfo.Column("unitVolume", "INTEGER", false, 0, null, 1));
        map4.put("dailyRange", new TableInfo.Column("dailyRange", "TEXT", false, 0, null, 1));
        map4.put("fiftyTwoWeekRange", new TableInfo.Column("fiftyTwoWeekRange", "TEXT", false, 0, null, 1));
        map4.put("fiveYearRange", new TableInfo.Column("fiveYearRange", "TEXT", false, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("instrument_tickers_summary", map4, o.s(map4, "highlyVolatile", new TableInfo.Column("highlyVolatile", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "instrument_tickers_summary");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("instrument_tickers_summary(com.revolut.shared.feature.wealth.domain.impl.data.database.model.InstrumentTickerSummaryEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(3);
        map5.put("portfolioId", new TableInfo.Column("portfolioId", "TEXT", true, 1, null, 1));
        map5.put("stockBuyBlockState", new TableInfo.Column("stockBuyBlockState", "TEXT", true, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("portfolioSettings", map5, o.s(map5, "stockBuyBlockDeactivationTime", new TableInfo.Column("stockBuyBlockDeactivationTime", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "portfolioSettings");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("portfolioSettings(com.revolut.shared.feature.wealth.domain.impl.data.database.model.settings.PortfolioSettingsEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(3);
        map6.put("portfolioId", new TableInfo.Column("portfolioId", "TEXT", true, 1, null, 1));
        map6.put("fromEpochDay", new TableInfo.Column("fromEpochDay", "INTEGER", true, 2, null, 1));
        TableInfo tableInfo11 = new TableInfo("reports", map6, o.s(map6, "toEpochDay", new TableInfo.Column("toEpochDay", "INTEGER", true, 3, null, 1), 0), new HashSet(0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "reports");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("reports(com.revolut.shared.feature.wealth.domain.impl.data.database.model.reports.ReportEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(3);
        map7.put("portfolioId", new TableInfo.Column("portfolioId", "TEXT", true, 1, null, 1));
        map7.put("fromEpochDay", new TableInfo.Column("fromEpochDay", "INTEGER", true, 2, null, 1));
        TableInfo tableInfo13 = new TableInfo("us_reports", map7, o.s(map7, "toEpochDay", new TableInfo.Column("toEpochDay", "INTEGER", true, 3, null, 1), 0), new HashSet(0));
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "us_reports");
        if (!tableInfo13.equals(tableInfo14)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("us_reports(com.revolut.shared.feature.wealth.domain.impl.data.database.model.reports.UsReportEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14));
        }
        HashMap map8 = new HashMap(9);
        map8.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map8.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map8.put("asset_types", new TableInfo.Column("asset_types", "TEXT", true, 0, null, 1));
        map8.put("balance", new TableInfo.Column("balance", "TEXT", false, 0, null, 1));
        map8.put("kyc", new TableInfo.Column("kyc", "TEXT", true, 0, null, 1));
        map8.put("disclosures", new TableInfo.Column("disclosures", "TEXT", true, 0, null, 1));
        map8.put("info", new TableInfo.Column("info", "TEXT", true, 0, null, 1));
        map8.put("onboardedDate", new TableInfo.Column("onboardedDate", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo15 = new TableInfo("portfolios", map8, o.s(map8, "offboardedDate", new TableInfo.Column("offboardedDate", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo16 = TableInfo.read(sQLiteConnection, "portfolios");
        if (!tableInfo15.equals(tableInfo16)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("portfolios(com.revolut.shared.feature.wealth.domain.impl.data.database.model.portfolio.PortfolioEntity).\n Expected:\n", tableInfo15, "\n Found:\n", tableInfo16));
        }
        HashMap map9 = new HashMap(8);
        map9.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map9.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 2, null, 1));
        map9.put("creation_date", new TableInfo.Column("creation_date", "INTEGER", false, 0, null, 1));
        map9.put("holding_state", new TableInfo.Column("holding_state", "TEXT", true, 0, null, 1));
        map9.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map9.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map9.put("cash_holding", new TableInfo.Column("cash_holding", "TEXT", false, 0, null, 1));
        TableInfo tableInfo17 = new TableInfo("holdings", map9, o.s(map9, "stock_holding", new TableInfo.Column("stock_holding", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo18 = TableInfo.read(sQLiteConnection, "holdings");
        if (!tableInfo17.equals(tableInfo18)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("holdings(com.revolut.shared.feature.wealth.domain.impl.data.database.model.holdings.HoldingEntity).\n Expected:\n", tableInfo17, "\n Found:\n", tableInfo18));
        }
        HashMap map10 = new HashMap(9);
        map10.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map10.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map10.put("stock_exchange_code", new TableInfo.Column("stock_exchange_code", "TEXT", true, 0, null, 1));
        map10.put("issue", new TableInfo.Column("issue", "TEXT", true, 0, null, 1));
        map10.put("issuer", new TableInfo.Column("issuer", "TEXT", true, 0, null, 1));
        map10.put("coupon", new TableInfo.Column("coupon", "TEXT", true, 0, null, 1));
        map10.put("primary_stats", new TableInfo.Column("primary_stats", "TEXT", true, 0, null, 1));
        map10.put("ratings", new TableInfo.Column("ratings", "TEXT", false, 0, null, 1));
        TableInfo tableInfo19 = new TableInfo("bond_details", map10, o.s(map10, "callability", new TableInfo.Column("callability", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo20 = TableInfo.read(sQLiteConnection, "bond_details");
        if (!tableInfo19.equals(tableInfo20)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("bond_details(com.revolut.shared.feature.wealth.domain.impl.data.database.model.BondDetailsEntity).\n Expected:\n", tableInfo19, "\n Found:\n", tableInfo20));
        }
        HashMap map11 = new HashMap(5);
        map11.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map11.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map11.put("stock_exchange_code", new TableInfo.Column("stock_exchange_code", "TEXT", true, 0, null, 1));
        map11.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        TableInfo tableInfo21 = new TableInfo("cfd_details", map11, o.s(map11, "kidUrl", new TableInfo.Column("kidUrl", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo22 = TableInfo.read(sQLiteConnection, "cfd_details");
        if (!tableInfo21.equals(tableInfo22)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("cfd_details(com.revolut.shared.feature.wealth.domain.impl.data.database.model.CfdDetailsEntity).\n Expected:\n", tableInfo21, "\n Found:\n", tableInfo22));
        }
        HashMap map12 = new HashMap(9);
        map12.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map12.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map12.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map12.put("stockExchangeCode", new TableInfo.Column("stockExchangeCode", "TEXT", true, 0, null, 1));
        map12.put("stats", new TableInfo.Column("stats", "TEXT", false, 0, null, 1));
        map12.put("exposure", new TableInfo.Column("exposure", "TEXT", false, 0, null, 1));
        map12.put("prospectusUrl", new TableInfo.Column("prospectusUrl", "TEXT", false, 0, null, 1));
        map12.put("kidUrl", new TableInfo.Column("kidUrl", "TEXT", false, 0, null, 1));
        TableInfo tableInfo23 = new TableInfo("etf_details", map12, o.s(map12, "tags", new TableInfo.Column("tags", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo24 = TableInfo.read(sQLiteConnection, "etf_details");
        if (!tableInfo23.equals(tableInfo24)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("etf_details(com.revolut.shared.feature.wealth.domain.impl.data.database.model.EtfDetailsEntity).\n Expected:\n", tableInfo23, "\n Found:\n", tableInfo24));
        }
        HashMap map13 = new HashMap(9);
        map13.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map13.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map13.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map13.put("stockExchangeCode", new TableInfo.Column("stockExchangeCode", "TEXT", true, 0, null, 1));
        map13.put("stats", new TableInfo.Column("stats", "TEXT", false, 0, null, 1));
        map13.put("sector", new TableInfo.Column("sector", "TEXT", true, 0, null, 1));
        map13.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map13.put("analystsSummary", new TableInfo.Column("analystsSummary", "TEXT", false, 0, null, 1));
        TableInfo tableInfo25 = new TableInfo("instrument_details", map13, o.s(map13, "tags", new TableInfo.Column("tags", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo26 = TableInfo.read(sQLiteConnection, "instrument_details");
        if (!tableInfo25.equals(tableInfo26)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("instrument_details(com.revolut.shared.feature.wealth.domain.impl.data.database.model.InstrumentDetailsEntity).\n Expected:\n", tableInfo25, "\n Found:\n", tableInfo26));
        }
        HashMap map14 = new HashMap(10);
        map14.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map14.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map14.put("exchange", new TableInfo.Column("exchange", "TEXT", true, 0, null, 1));
        map14.put("fundHouse", new TableInfo.Column("fundHouse", "TEXT", false, 0, null, 1));
        map14.put("fundManager", new TableInfo.Column("fundManager", "TEXT", false, 0, null, 1));
        map14.put("performance", new TableInfo.Column("performance", "TEXT", false, 0, null, 1));
        map14.put("documents", new TableInfo.Column("documents", "TEXT", false, 0, null, 1));
        map14.put("keyDetails", new TableInfo.Column("keyDetails", "TEXT", false, 0, null, 1));
        map14.put("exposure", new TableInfo.Column("exposure", "TEXT", false, 0, null, 1));
        TableInfo tableInfo27 = new TableInfo("fund_details", map14, o.s(map14, "concentration", new TableInfo.Column("concentration", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo28 = TableInfo.read(sQLiteConnection, "fund_details");
        if (!tableInfo27.equals(tableInfo28)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("fund_details(com.revolut.shared.feature.wealth.domain.impl.data.database.model.FundDetailsEntity).\n Expected:\n", tableInfo27, "\n Found:\n", tableInfo28));
        }
        HashMap map15 = new HashMap(4);
        map15.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map15.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map15.put("exchange", new TableInfo.Column("exchange", "TEXT", true, 0, null, 1));
        TableInfo tableInfo29 = new TableInfo("mutual_fund_details", map15, o.s(map15, "documents", new TableInfo.Column("documents", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo30 = TableInfo.read(sQLiteConnection, "mutual_fund_details");
        if (!tableInfo29.equals(tableInfo30)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("mutual_fund_details(com.revolut.shared.feature.wealth.domain.impl.data.database.model.MutualFundDetailsEntity).\n Expected:\n", tableInfo29, "\n Found:\n", tableInfo30));
        }
        HashMap map16 = new HashMap(2);
        map16.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        TableInfo tableInfo31 = new TableInfo("instrument_details_recommendations", map16, o.s(map16, "recommendations", new TableInfo.Column("recommendations", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo32 = TableInfo.read(sQLiteConnection, "instrument_details_recommendations");
        if (!tableInfo31.equals(tableInfo32)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("instrument_details_recommendations(com.revolut.shared.feature.wealth.domain.impl.data.database.model.InstrumentRecommendationsEntity).\n Expected:\n", tableInfo31, "\n Found:\n", tableInfo32));
        }
        HashMap map17 = new HashMap(2);
        map17.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        TableInfo tableInfo33 = new TableInfo("instrument_governance", map17, o.s(map17, "targetMarket", new TableInfo.Column("targetMarket", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo34 = TableInfo.read(sQLiteConnection, "instrument_governance");
        if (!tableInfo33.equals(tableInfo34)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("instrument_governance(com.revolut.shared.feature.wealth.domain.impl.data.database.model.InstrumentTargetMarketEntity).\n Expected:\n", tableInfo33, "\n Found:\n", tableInfo34));
        }
        HashMap map18 = new HashMap(6);
        map18.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map18.put("period", new TableInfo.Column("period", "TEXT", true, 2, null, 1));
        map18.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 3, null, 1));
        map18.put("valueType", new TableInfo.Column("valueType", "TEXT", true, 4, null, 1));
        map18.put("price", new TableInfo.Column("price", "TEXT", false, 0, null, 1));
        TableInfo tableInfo35 = new TableInfo("stocks_historical_rates", map18, o.s(map18, "percentageYtm", new TableInfo.Column("percentageYtm", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo36 = TableInfo.read(sQLiteConnection, "stocks_historical_rates");
        if (!tableInfo35.equals(tableInfo36)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("stocks_historical_rates(com.revolut.shared.feature.wealth.domain.impl.data.database.model.chart.InstrumentHistoricalPriceEntity).\n Expected:\n", tableInfo35, "\n Found:\n", tableInfo36));
        }
        HashMap map19 = new HashMap(12);
        map19.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map19.put("period", new TableInfo.Column("period", "TEXT", true, 2, null, 1));
        map19.put("open", new TableInfo.Column("open", "TEXT", true, 0, null, 1));
        map19.put("close", new TableInfo.Column("close", "TEXT", true, 0, null, 1));
        map19.put("high", new TableInfo.Column("high", "TEXT", true, 0, null, 1));
        map19.put("low", new TableInfo.Column("low", "TEXT", true, 0, null, 1));
        map19.put("volume", new TableInfo.Column("volume", "INTEGER", true, 0, null, 1));
        map19.put("from", new TableInfo.Column("from", "INTEGER", true, 3, null, 1));
        map19.put("to", new TableInfo.Column("to", "INTEGER", true, 0, null, 1));
        map19.put("startClose", new TableInfo.Column("startClose", "TEXT", true, 0, null, 1));
        map19.put("endClose", new TableInfo.Column("endClose", "TEXT", true, 0, null, 1));
        TableInfo tableInfo37 = new TableInfo("candle_sticks", map19, o.s(map19, "baseline", new TableInfo.Column("baseline", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo38 = TableInfo.read(sQLiteConnection, "candle_sticks");
        if (!tableInfo37.equals(tableInfo38)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("candle_sticks(com.revolut.shared.feature.wealth.domain.impl.data.database.model.chart.InstrumentCandlestickChartEntity).\n Expected:\n", tableInfo37, "\n Found:\n", tableInfo38));
        }
        HashMap map20 = new HashMap(5);
        map20.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map20.put("timespan", new TableInfo.Column("timespan", "TEXT", true, 2, null, 1));
        map20.put("interval", new TableInfo.Column("interval", "TEXT", true, 0, null, 1));
        map20.put("drawdownMax", new TableInfo.Column("drawdownMax", "TEXT", true, 0, null, 1));
        TableInfo tableInfo39 = new TableInfo("instrument_drawdown", map20, o.s(map20, "referenceDrawdownMax", new TableInfo.Column("referenceDrawdownMax", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo40 = TableInfo.read(sQLiteConnection, "instrument_drawdown");
        if (!tableInfo39.equals(tableInfo40)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("instrument_drawdown(com.revolut.shared.feature.wealth.domain.impl.data.database.model.InstrumentDrawdownEntity).\n Expected:\n", tableInfo39, "\n Found:\n", tableInfo40));
        }
        HashMap map21 = new HashMap(5);
        map21.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map21.put("price", new TableInfo.Column("price", "TEXT", true, 0, null, 1));
        map21.put("primaryStats", new TableInfo.Column("primaryStats", "TEXT", true, 0, null, 1));
        map21.put("yieldStats", new TableInfo.Column("yieldStats", "TEXT", true, 0, null, 1));
        TableInfo tableInfo41 = new TableInfo("bond_stats", map21, o.s(map21, "riskStats", new TableInfo.Column("riskStats", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo42 = TableInfo.read(sQLiteConnection, "bond_stats");
        if (!tableInfo41.equals(tableInfo42)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("bond_stats(com.revolut.shared.feature.wealth.domain.impl.data.database.model.stats.BondStatsEntity).\n Expected:\n", tableInfo41, "\n Found:\n", tableInfo42));
        }
        HashMap map22 = new HashMap(8);
        map22.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map22.put("price", new TableInfo.Column("price", "TEXT", false, 0, null, 1));
        map22.put("marketCapitalization", new TableInfo.Column("marketCapitalization", "TEXT", false, 0, null, 1));
        map22.put("dividends", new TableInfo.Column("dividends", "TEXT", false, 0, null, 1));
        map22.put("expenseRatios", new TableInfo.Column("expenseRatios", "TEXT", false, 0, null, 1));
        map22.put("managementFees", new TableInfo.Column("managementFees", "TEXT", false, 0, null, 1));
        map22.put("charges", new TableInfo.Column("charges", "TEXT", false, 0, null, 1));
        TableInfo tableInfo43 = new TableInfo("etf_stats", map22, o.s(map22, "riskRating", new TableInfo.Column("riskRating", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo44 = TableInfo.read(sQLiteConnection, "etf_stats");
        if (!tableInfo43.equals(tableInfo44)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("etf_stats(com.revolut.shared.feature.wealth.domain.impl.data.database.model.stats.EtfStatsEntity).\n Expected:\n", tableInfo43, "\n Found:\n", tableInfo44));
        }
        HashMap map23 = new HashMap(10);
        map23.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map23.put("price", new TableInfo.Column("price", "TEXT", true, 0, null, 1));
        map23.put("volume", new TableInfo.Column("volume", "TEXT", true, 0, null, 1));
        map23.put("marketCap", new TableInfo.Column("marketCap", "TEXT", true, 0, null, 1));
        map23.put("perShare", new TableInfo.Column("perShare", "TEXT", true, 0, null, 1));
        map23.put("dividend", new TableInfo.Column("dividend", "TEXT", true, 0, null, 1));
        map23.put("valuation", new TableInfo.Column("valuation", "TEXT", true, 0, null, 1));
        map23.put("profitability", new TableInfo.Column("profitability", "TEXT", true, 0, null, 1));
        map23.put("managementEffectiveness", new TableInfo.Column("managementEffectiveness", "TEXT", true, 0, null, 1));
        TableInfo tableInfo45 = new TableInfo("instrument_stats", map23, o.s(map23, "listingData", new TableInfo.Column("listingData", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo46 = TableInfo.read(sQLiteConnection, "instrument_stats");
        if (!tableInfo45.equals(tableInfo46)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("instrument_stats(com.revolut.shared.feature.wealth.domain.impl.data.database.model.stats.InstrumentStatsEntity).\n Expected:\n", tableInfo45, "\n Found:\n", tableInfo46));
        }
        HashMap map24 = new HashMap(18);
        map24.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map24.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map24.put("stock_exchange_code", new TableInfo.Column("stock_exchange_code", "TEXT", true, 0, null, 1));
        map24.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map24.put("lifecycle", new TableInfo.Column("lifecycle", "TEXT", true, 0, null, 1));
        map24.put("coupon", new TableInfo.Column("coupon", "TEXT", false, 0, null, 1));
        map24.put("call", new TableInfo.Column("call", "TEXT", false, 0, null, 1));
        map24.put("capital_protection", new TableInfo.Column("capital_protection", "TEXT", false, 0, null, 1));
        map24.put("final_payout", new TableInfo.Column("final_payout", "TEXT", false, 0, null, 1));
        map24.put("key_drivers", new TableInfo.Column("key_drivers", "TEXT", true, 0, null, 1));
        map24.put("underlying_assets", new TableInfo.Column("underlying_assets", "TEXT", true, 0, null, 1));
        map24.put("issuer", new TableInfo.Column("issuer", "TEXT", true, 0, null, 1));
        map24.put("main_indicators", new TableInfo.Column("main_indicators", "TEXT", false, 0, null, 1));
        map24.put("payout_scenarios", new TableInfo.Column("payout_scenarios", "TEXT", false, 0, null, 1));
        map24.put("payout_scenarios_graph", new TableInfo.Column("payout_scenarios_graph", "TEXT", false, 0, null, 1));
        map24.put("performance_trackers", new TableInfo.Column("performance_trackers", "TEXT", false, 0, null, 1));
        map24.put("loss_probability", new TableInfo.Column("loss_probability", "TEXT", false, 0, null, 1));
        TableInfo tableInfo47 = new TableInfo("note_details", map24, o.s(map24, "reference_asset", new TableInfo.Column("reference_asset", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo48 = TableInfo.read(sQLiteConnection, "note_details");
        if (!tableInfo47.equals(tableInfo48)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("note_details(com.revolut.shared.feature.wealth.domain.impl.data.database.model.NoteDetailsEntity).\n Expected:\n", tableInfo47, "\n Found:\n", tableInfo48));
        }
        HashMap map25 = new HashMap(14);
        map25.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map25.put("launchDate", new TableInfo.Column("launchDate", "INTEGER", true, 0, null, 1));
        map25.put("cancellationDeadline", new TableInfo.Column("cancellationDeadline", "INTEGER", false, 0, null, 1));
        map25.put("disclaimerWorkflowId", new TableInfo.Column("disclaimerWorkflowId", "TEXT", false, 0, null, 1));
        map25.put("acknowledgementWorkflowId", new TableInfo.Column("acknowledgementWorkflowId", "TEXT", false, 0, null, 1));
        map25.put("priceRangeLow", new TableInfo.Column("priceRangeLow", "TEXT", true, 0, null, 1));
        map25.put("priceRangeHigh", new TableInfo.Column("priceRangeHigh", "TEXT", true, 0, null, 1));
        map25.put("bookBuildingAvailable", new TableInfo.Column("bookBuildingAvailable", "INTEGER", true, 0, "0", 1));
        map25.put("documents", new TableInfo.Column("documents", "TEXT", true, 0, null, 1));
        map25.put("details", new TableInfo.Column("details", "TEXT", true, 0, null, 1));
        map25.put("sections", new TableInfo.Column("sections", "TEXT", true, 0, null, 1));
        map25.put("finalPriceDate", new TableInfo.Column("finalPriceDate", "INTEGER", false, 0, null, 1));
        map25.put("barChartDetails", new TableInfo.Column("barChartDetails", "TEXT", false, 0, null, 1));
        TableInfo tableInfo49 = new TableInfo("ipo_instrument_details", map25, o.s(map25, "lineChartDetails", new TableInfo.Column("lineChartDetails", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo50 = TableInfo.read(sQLiteConnection, "ipo_instrument_details");
        if (!tableInfo49.equals(tableInfo50)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("ipo_instrument_details(com.revolut.shared.feature.wealth.domain.impl.data.database.model.IpoInstrumentDetailsEntity).\n Expected:\n", tableInfo49, "\n Found:\n", tableInfo50));
        }
        HashMap map26 = new HashMap(8);
        map26.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map26.put("launchDate", new TableInfo.Column("launchDate", "INTEGER", true, 0, null, 1));
        map26.put("cancellationDeadline", new TableInfo.Column("cancellationDeadline", "INTEGER", false, 0, null, 1));
        map26.put("disclaimerWorkflowId", new TableInfo.Column("disclaimerWorkflowId", "TEXT", false, 0, null, 1));
        map26.put("acknowledgementWorkflowId", new TableInfo.Column("acknowledgementWorkflowId", "TEXT", false, 0, null, 1));
        map26.put("priceRangeLow", new TableInfo.Column("priceRangeLow", "TEXT", true, 0, null, 1));
        map26.put("priceRangeHigh", new TableInfo.Column("priceRangeHigh", "TEXT", true, 0, null, 1));
        TableInfo tableInfo51 = new TableInfo("ipo_instrument_summary", map26, o.s(map26, "finalPriceDate", new TableInfo.Column("finalPriceDate", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo52 = TableInfo.read(sQLiteConnection, "ipo_instrument_summary");
        return !tableInfo51.equals(tableInfo52) ? new RoomOpenDelegate.ValidationResult(false, o.o("ipo_instrument_summary(com.revolut.shared.feature.wealth.domain.impl.data.database.model.IpoInstrumentSummaryEntity).\n Expected:\n", tableInfo51, "\n Found:\n", tableInfo52)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
