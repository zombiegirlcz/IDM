package ahl;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.CorporateEventsDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CorporateEventsDatabase_Impl f5133a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CorporateEventsDatabase_Impl corporateEventsDatabase_Impl) {
        super(13, "3f936457630576d1d8d456742a2f64d1", "f53e905993d19e682b0353ff88430de2");
        this.f5133a = corporateEventsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `upcoming_events` (`eventId` TEXT NOT NULL, `type` TEXT NOT NULL, `effective_date` TEXT NOT NULL, `market_holiday_holiday` TEXT, `market_holiday_name` TEXT, `market_holiday_marketClosed` INTEGER, `market_holiday_marketOpenTime` INTEGER, `market_holiday_marketCloseTime` INTEGER, `cash_dividend_symbol` TEXT, `cash_dividend_ref` TEXT, `cash_dividend_exDividendDate` TEXT, `cash_dividend_amount` TEXT, `stock_dividend_symbol` TEXT, `stock_dividend_ref` TEXT, `stock_dividend_exDividendDate` TEXT, `stock_dividend_quantity` REAL, `listing_status_symbol` TEXT, `listing_status_ref` TEXT, `listing_status_status` TEXT, `symbol_change_symbol` TEXT, `symbol_change_ref` TEXT, `symbol_change_oldSymbol` TEXT, `symbol_change_newSymbol` TEXT, `stock_split_symbol` TEXT, `stock_split_ref` TEXT, `stock_split_exDividendDate` TEXT, `stock_split_paymentDate` TEXT, `stock_split_before` INTEGER, `stock_split_after` INTEGER, `earnings_call_symbol` TEXT, `earnings_call_ref` TEXT, `earnings_call_webcastStartDate` INTEGER, `earnings_call_webcastEndDate` INTEGER, `earnings_call_webcastUri` TEXT, `earnings_call_replayWebcastUri` TEXT, `earnings_call_transcriptUri` TEXT, `ex_dividend_symbol` TEXT, `ex_dividend_ref` TEXT, `ex_dividend_paymentDate` TEXT, `ex_dividend_amount` TEXT, `merger_symbol` TEXT, `merger_ref` TEXT, `merger_details` TEXT, `spinoff_symbol` TEXT, `spinoff_ref` TEXT, `spinoff_details` TEXT, `bankruptcy_symbol` TEXT, `bankruptcy_ref` TEXT, `bond_coupon_symbol` TEXT, `bond_coupon_ref` TEXT, `bond_coupon_paymentDate` TEXT, `bond_coupon_couponAmount` TEXT, `interest_payment_symbol` TEXT, `interest_payment_ref` TEXT, `interest_payment_paymentDate` TEXT, `interest_payment_observationDate` TEXT, `interest_payment_amountPerNominal` TEXT, `interest_payment_isConfirmed` INTEGER, `early_redemption_symbol` TEXT, `early_redemption_ref` TEXT, `early_redemption_paymentDate` TEXT, `early_redemption_observationDate` TEXT, `early_redemption_amountPerNominal` TEXT, `early_redemption_isConfirmed` INTEGER, `maturity_redemption_symbol` TEXT, `maturity_redemption_ref` TEXT, `maturity_redemption_paymentDate` TEXT, `maturity_redemption_observationDate` TEXT, `maturity_redemption_amountPerNominal` TEXT, `maturity_redemption_isConfirmed` INTEGER, PRIMARY KEY(`eventId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `calendar_events` (`eventId` TEXT NOT NULL, `type` TEXT NOT NULL, `effective_date` TEXT NOT NULL, `is_my_event` INTEGER NOT NULL, `market_holiday_holiday` TEXT, `market_holiday_name` TEXT, `market_holiday_marketClosed` INTEGER, `market_holiday_marketOpenTime` INTEGER, `market_holiday_marketCloseTime` INTEGER, `cash_dividend_symbol` TEXT, `cash_dividend_ref` TEXT, `cash_dividend_exDividendDate` TEXT, `cash_dividend_amount` TEXT, `stock_dividend_symbol` TEXT, `stock_dividend_ref` TEXT, `stock_dividend_exDividendDate` TEXT, `stock_dividend_quantity` REAL, `listing_status_symbol` TEXT, `listing_status_ref` TEXT, `listing_status_status` TEXT, `symbol_change_symbol` TEXT, `symbol_change_ref` TEXT, `symbol_change_oldSymbol` TEXT, `symbol_change_newSymbol` TEXT, `stock_split_symbol` TEXT, `stock_split_ref` TEXT, `stock_split_exDividendDate` TEXT, `stock_split_paymentDate` TEXT, `stock_split_before` INTEGER, `stock_split_after` INTEGER, `earnings_call_symbol` TEXT, `earnings_call_ref` TEXT, `earnings_call_webcastStartDate` INTEGER, `earnings_call_webcastEndDate` INTEGER, `earnings_call_webcastUri` TEXT, `earnings_call_replayWebcastUri` TEXT, `earnings_call_transcriptUri` TEXT, `ex_dividend_symbol` TEXT, `ex_dividend_ref` TEXT, `ex_dividend_paymentDate` TEXT, `ex_dividend_amount` TEXT, `merger_symbol` TEXT, `merger_ref` TEXT, `merger_details` TEXT, `spinoff_symbol` TEXT, `spinoff_ref` TEXT, `spinoff_details` TEXT, `bankruptcy_symbol` TEXT, `bankruptcy_ref` TEXT, `bond_coupon_symbol` TEXT, `bond_coupon_ref` TEXT, `bond_coupon_paymentDate` TEXT, `bond_coupon_couponAmount` TEXT, `interest_payment_symbol` TEXT, `interest_payment_ref` TEXT, `interest_payment_paymentDate` TEXT, `interest_payment_observationDate` TEXT, `interest_payment_amountPerNominal` TEXT, `interest_payment_isConfirmed` INTEGER, `early_redemption_symbol` TEXT, `early_redemption_ref` TEXT, `early_redemption_paymentDate` TEXT, `early_redemption_observationDate` TEXT, `early_redemption_amountPerNominal` TEXT, `early_redemption_isConfirmed` INTEGER, `maturity_redemption_symbol` TEXT, `maturity_redemption_ref` TEXT, `maturity_redemption_paymentDate` TEXT, `maturity_redemption_observationDate` TEXT, `maturity_redemption_amountPerNominal` TEXT, `maturity_redemption_isConfirmed` INTEGER, PRIMARY KEY(`eventId`, `is_my_event`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_calendar_events_effective_date_is_my_event` ON `calendar_events` (`effective_date`, `is_my_event`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3f936457630576d1d8d456742a2f64d1')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `upcoming_events`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `calendar_events`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = CorporateEventsDatabase_Impl.f105367l;
        this.f5133a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(70);
        map.put("eventId", new TableInfo.Column("eventId", "TEXT", true, 1, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("effective_date", new TableInfo.Column("effective_date", "TEXT", true, 0, null, 1));
        map.put("market_holiday_holiday", new TableInfo.Column("market_holiday_holiday", "TEXT", false, 0, null, 1));
        map.put("market_holiday_name", new TableInfo.Column("market_holiday_name", "TEXT", false, 0, null, 1));
        map.put("market_holiday_marketClosed", new TableInfo.Column("market_holiday_marketClosed", "INTEGER", false, 0, null, 1));
        map.put("market_holiday_marketOpenTime", new TableInfo.Column("market_holiday_marketOpenTime", "INTEGER", false, 0, null, 1));
        map.put("market_holiday_marketCloseTime", new TableInfo.Column("market_holiday_marketCloseTime", "INTEGER", false, 0, null, 1));
        map.put("cash_dividend_symbol", new TableInfo.Column("cash_dividend_symbol", "TEXT", false, 0, null, 1));
        map.put("cash_dividend_ref", new TableInfo.Column("cash_dividend_ref", "TEXT", false, 0, null, 1));
        map.put("cash_dividend_exDividendDate", new TableInfo.Column("cash_dividend_exDividendDate", "TEXT", false, 0, null, 1));
        map.put("cash_dividend_amount", new TableInfo.Column("cash_dividend_amount", "TEXT", false, 0, null, 1));
        map.put("stock_dividend_symbol", new TableInfo.Column("stock_dividend_symbol", "TEXT", false, 0, null, 1));
        map.put("stock_dividend_ref", new TableInfo.Column("stock_dividend_ref", "TEXT", false, 0, null, 1));
        map.put("stock_dividend_exDividendDate", new TableInfo.Column("stock_dividend_exDividendDate", "TEXT", false, 0, null, 1));
        map.put("stock_dividend_quantity", new TableInfo.Column("stock_dividend_quantity", "REAL", false, 0, null, 1));
        map.put("listing_status_symbol", new TableInfo.Column("listing_status_symbol", "TEXT", false, 0, null, 1));
        map.put("listing_status_ref", new TableInfo.Column("listing_status_ref", "TEXT", false, 0, null, 1));
        map.put("listing_status_status", new TableInfo.Column("listing_status_status", "TEXT", false, 0, null, 1));
        map.put("symbol_change_symbol", new TableInfo.Column("symbol_change_symbol", "TEXT", false, 0, null, 1));
        map.put("symbol_change_ref", new TableInfo.Column("symbol_change_ref", "TEXT", false, 0, null, 1));
        map.put("symbol_change_oldSymbol", new TableInfo.Column("symbol_change_oldSymbol", "TEXT", false, 0, null, 1));
        map.put("symbol_change_newSymbol", new TableInfo.Column("symbol_change_newSymbol", "TEXT", false, 0, null, 1));
        map.put("stock_split_symbol", new TableInfo.Column("stock_split_symbol", "TEXT", false, 0, null, 1));
        map.put("stock_split_ref", new TableInfo.Column("stock_split_ref", "TEXT", false, 0, null, 1));
        map.put("stock_split_exDividendDate", new TableInfo.Column("stock_split_exDividendDate", "TEXT", false, 0, null, 1));
        map.put("stock_split_paymentDate", new TableInfo.Column("stock_split_paymentDate", "TEXT", false, 0, null, 1));
        map.put("stock_split_before", new TableInfo.Column("stock_split_before", "INTEGER", false, 0, null, 1));
        map.put("stock_split_after", new TableInfo.Column("stock_split_after", "INTEGER", false, 0, null, 1));
        map.put("earnings_call_symbol", new TableInfo.Column("earnings_call_symbol", "TEXT", false, 0, null, 1));
        map.put("earnings_call_ref", new TableInfo.Column("earnings_call_ref", "TEXT", false, 0, null, 1));
        map.put("earnings_call_webcastStartDate", new TableInfo.Column("earnings_call_webcastStartDate", "INTEGER", false, 0, null, 1));
        map.put("earnings_call_webcastEndDate", new TableInfo.Column("earnings_call_webcastEndDate", "INTEGER", false, 0, null, 1));
        map.put("earnings_call_webcastUri", new TableInfo.Column("earnings_call_webcastUri", "TEXT", false, 0, null, 1));
        map.put("earnings_call_replayWebcastUri", new TableInfo.Column("earnings_call_replayWebcastUri", "TEXT", false, 0, null, 1));
        map.put("earnings_call_transcriptUri", new TableInfo.Column("earnings_call_transcriptUri", "TEXT", false, 0, null, 1));
        map.put("ex_dividend_symbol", new TableInfo.Column("ex_dividend_symbol", "TEXT", false, 0, null, 1));
        map.put("ex_dividend_ref", new TableInfo.Column("ex_dividend_ref", "TEXT", false, 0, null, 1));
        map.put("ex_dividend_paymentDate", new TableInfo.Column("ex_dividend_paymentDate", "TEXT", false, 0, null, 1));
        map.put("ex_dividend_amount", new TableInfo.Column("ex_dividend_amount", "TEXT", false, 0, null, 1));
        map.put("merger_symbol", new TableInfo.Column("merger_symbol", "TEXT", false, 0, null, 1));
        map.put("merger_ref", new TableInfo.Column("merger_ref", "TEXT", false, 0, null, 1));
        map.put("merger_details", new TableInfo.Column("merger_details", "TEXT", false, 0, null, 1));
        map.put("spinoff_symbol", new TableInfo.Column("spinoff_symbol", "TEXT", false, 0, null, 1));
        map.put("spinoff_ref", new TableInfo.Column("spinoff_ref", "TEXT", false, 0, null, 1));
        map.put("spinoff_details", new TableInfo.Column("spinoff_details", "TEXT", false, 0, null, 1));
        map.put("bankruptcy_symbol", new TableInfo.Column("bankruptcy_symbol", "TEXT", false, 0, null, 1));
        map.put("bankruptcy_ref", new TableInfo.Column("bankruptcy_ref", "TEXT", false, 0, null, 1));
        map.put("bond_coupon_symbol", new TableInfo.Column("bond_coupon_symbol", "TEXT", false, 0, null, 1));
        map.put("bond_coupon_ref", new TableInfo.Column("bond_coupon_ref", "TEXT", false, 0, null, 1));
        map.put("bond_coupon_paymentDate", new TableInfo.Column("bond_coupon_paymentDate", "TEXT", false, 0, null, 1));
        map.put("bond_coupon_couponAmount", new TableInfo.Column("bond_coupon_couponAmount", "TEXT", false, 0, null, 1));
        map.put("interest_payment_symbol", new TableInfo.Column("interest_payment_symbol", "TEXT", false, 0, null, 1));
        map.put("interest_payment_ref", new TableInfo.Column("interest_payment_ref", "TEXT", false, 0, null, 1));
        map.put("interest_payment_paymentDate", new TableInfo.Column("interest_payment_paymentDate", "TEXT", false, 0, null, 1));
        map.put("interest_payment_observationDate", new TableInfo.Column("interest_payment_observationDate", "TEXT", false, 0, null, 1));
        map.put("interest_payment_amountPerNominal", new TableInfo.Column("interest_payment_amountPerNominal", "TEXT", false, 0, null, 1));
        map.put("interest_payment_isConfirmed", new TableInfo.Column("interest_payment_isConfirmed", "INTEGER", false, 0, null, 1));
        map.put("early_redemption_symbol", new TableInfo.Column("early_redemption_symbol", "TEXT", false, 0, null, 1));
        map.put("early_redemption_ref", new TableInfo.Column("early_redemption_ref", "TEXT", false, 0, null, 1));
        map.put("early_redemption_paymentDate", new TableInfo.Column("early_redemption_paymentDate", "TEXT", false, 0, null, 1));
        map.put("early_redemption_observationDate", new TableInfo.Column("early_redemption_observationDate", "TEXT", false, 0, null, 1));
        map.put("early_redemption_amountPerNominal", new TableInfo.Column("early_redemption_amountPerNominal", "TEXT", false, 0, null, 1));
        map.put("early_redemption_isConfirmed", new TableInfo.Column("early_redemption_isConfirmed", "INTEGER", false, 0, null, 1));
        map.put("maturity_redemption_symbol", new TableInfo.Column("maturity_redemption_symbol", "TEXT", false, 0, null, 1));
        map.put("maturity_redemption_ref", new TableInfo.Column("maturity_redemption_ref", "TEXT", false, 0, null, 1));
        map.put("maturity_redemption_paymentDate", new TableInfo.Column("maturity_redemption_paymentDate", "TEXT", false, 0, null, 1));
        map.put("maturity_redemption_observationDate", new TableInfo.Column("maturity_redemption_observationDate", "TEXT", false, 0, null, 1));
        map.put("maturity_redemption_amountPerNominal", new TableInfo.Column("maturity_redemption_amountPerNominal", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("upcoming_events", map, o.s(map, "maturity_redemption_isConfirmed", new TableInfo.Column("maturity_redemption_isConfirmed", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "upcoming_events");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("upcoming_events(com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.model.UpcomingEventEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(71);
        map2.put("eventId", new TableInfo.Column("eventId", "TEXT", true, 1, null, 1));
        map2.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map2.put("effective_date", new TableInfo.Column("effective_date", "TEXT", true, 0, null, 1));
        map2.put("is_my_event", new TableInfo.Column("is_my_event", "INTEGER", true, 2, null, 1));
        map2.put("market_holiday_holiday", new TableInfo.Column("market_holiday_holiday", "TEXT", false, 0, null, 1));
        map2.put("market_holiday_name", new TableInfo.Column("market_holiday_name", "TEXT", false, 0, null, 1));
        map2.put("market_holiday_marketClosed", new TableInfo.Column("market_holiday_marketClosed", "INTEGER", false, 0, null, 1));
        map2.put("market_holiday_marketOpenTime", new TableInfo.Column("market_holiday_marketOpenTime", "INTEGER", false, 0, null, 1));
        map2.put("market_holiday_marketCloseTime", new TableInfo.Column("market_holiday_marketCloseTime", "INTEGER", false, 0, null, 1));
        map2.put("cash_dividend_symbol", new TableInfo.Column("cash_dividend_symbol", "TEXT", false, 0, null, 1));
        map2.put("cash_dividend_ref", new TableInfo.Column("cash_dividend_ref", "TEXT", false, 0, null, 1));
        map2.put("cash_dividend_exDividendDate", new TableInfo.Column("cash_dividend_exDividendDate", "TEXT", false, 0, null, 1));
        map2.put("cash_dividend_amount", new TableInfo.Column("cash_dividend_amount", "TEXT", false, 0, null, 1));
        map2.put("stock_dividend_symbol", new TableInfo.Column("stock_dividend_symbol", "TEXT", false, 0, null, 1));
        map2.put("stock_dividend_ref", new TableInfo.Column("stock_dividend_ref", "TEXT", false, 0, null, 1));
        map2.put("stock_dividend_exDividendDate", new TableInfo.Column("stock_dividend_exDividendDate", "TEXT", false, 0, null, 1));
        map2.put("stock_dividend_quantity", new TableInfo.Column("stock_dividend_quantity", "REAL", false, 0, null, 1));
        map2.put("listing_status_symbol", new TableInfo.Column("listing_status_symbol", "TEXT", false, 0, null, 1));
        map2.put("listing_status_ref", new TableInfo.Column("listing_status_ref", "TEXT", false, 0, null, 1));
        map2.put("listing_status_status", new TableInfo.Column("listing_status_status", "TEXT", false, 0, null, 1));
        map2.put("symbol_change_symbol", new TableInfo.Column("symbol_change_symbol", "TEXT", false, 0, null, 1));
        map2.put("symbol_change_ref", new TableInfo.Column("symbol_change_ref", "TEXT", false, 0, null, 1));
        map2.put("symbol_change_oldSymbol", new TableInfo.Column("symbol_change_oldSymbol", "TEXT", false, 0, null, 1));
        map2.put("symbol_change_newSymbol", new TableInfo.Column("symbol_change_newSymbol", "TEXT", false, 0, null, 1));
        map2.put("stock_split_symbol", new TableInfo.Column("stock_split_symbol", "TEXT", false, 0, null, 1));
        map2.put("stock_split_ref", new TableInfo.Column("stock_split_ref", "TEXT", false, 0, null, 1));
        map2.put("stock_split_exDividendDate", new TableInfo.Column("stock_split_exDividendDate", "TEXT", false, 0, null, 1));
        map2.put("stock_split_paymentDate", new TableInfo.Column("stock_split_paymentDate", "TEXT", false, 0, null, 1));
        map2.put("stock_split_before", new TableInfo.Column("stock_split_before", "INTEGER", false, 0, null, 1));
        map2.put("stock_split_after", new TableInfo.Column("stock_split_after", "INTEGER", false, 0, null, 1));
        map2.put("earnings_call_symbol", new TableInfo.Column("earnings_call_symbol", "TEXT", false, 0, null, 1));
        map2.put("earnings_call_ref", new TableInfo.Column("earnings_call_ref", "TEXT", false, 0, null, 1));
        map2.put("earnings_call_webcastStartDate", new TableInfo.Column("earnings_call_webcastStartDate", "INTEGER", false, 0, null, 1));
        map2.put("earnings_call_webcastEndDate", new TableInfo.Column("earnings_call_webcastEndDate", "INTEGER", false, 0, null, 1));
        map2.put("earnings_call_webcastUri", new TableInfo.Column("earnings_call_webcastUri", "TEXT", false, 0, null, 1));
        map2.put("earnings_call_replayWebcastUri", new TableInfo.Column("earnings_call_replayWebcastUri", "TEXT", false, 0, null, 1));
        map2.put("earnings_call_transcriptUri", new TableInfo.Column("earnings_call_transcriptUri", "TEXT", false, 0, null, 1));
        map2.put("ex_dividend_symbol", new TableInfo.Column("ex_dividend_symbol", "TEXT", false, 0, null, 1));
        map2.put("ex_dividend_ref", new TableInfo.Column("ex_dividend_ref", "TEXT", false, 0, null, 1));
        map2.put("ex_dividend_paymentDate", new TableInfo.Column("ex_dividend_paymentDate", "TEXT", false, 0, null, 1));
        map2.put("ex_dividend_amount", new TableInfo.Column("ex_dividend_amount", "TEXT", false, 0, null, 1));
        map2.put("merger_symbol", new TableInfo.Column("merger_symbol", "TEXT", false, 0, null, 1));
        map2.put("merger_ref", new TableInfo.Column("merger_ref", "TEXT", false, 0, null, 1));
        map2.put("merger_details", new TableInfo.Column("merger_details", "TEXT", false, 0, null, 1));
        map2.put("spinoff_symbol", new TableInfo.Column("spinoff_symbol", "TEXT", false, 0, null, 1));
        map2.put("spinoff_ref", new TableInfo.Column("spinoff_ref", "TEXT", false, 0, null, 1));
        map2.put("spinoff_details", new TableInfo.Column("spinoff_details", "TEXT", false, 0, null, 1));
        map2.put("bankruptcy_symbol", new TableInfo.Column("bankruptcy_symbol", "TEXT", false, 0, null, 1));
        map2.put("bankruptcy_ref", new TableInfo.Column("bankruptcy_ref", "TEXT", false, 0, null, 1));
        map2.put("bond_coupon_symbol", new TableInfo.Column("bond_coupon_symbol", "TEXT", false, 0, null, 1));
        map2.put("bond_coupon_ref", new TableInfo.Column("bond_coupon_ref", "TEXT", false, 0, null, 1));
        map2.put("bond_coupon_paymentDate", new TableInfo.Column("bond_coupon_paymentDate", "TEXT", false, 0, null, 1));
        map2.put("bond_coupon_couponAmount", new TableInfo.Column("bond_coupon_couponAmount", "TEXT", false, 0, null, 1));
        map2.put("interest_payment_symbol", new TableInfo.Column("interest_payment_symbol", "TEXT", false, 0, null, 1));
        map2.put("interest_payment_ref", new TableInfo.Column("interest_payment_ref", "TEXT", false, 0, null, 1));
        map2.put("interest_payment_paymentDate", new TableInfo.Column("interest_payment_paymentDate", "TEXT", false, 0, null, 1));
        map2.put("interest_payment_observationDate", new TableInfo.Column("interest_payment_observationDate", "TEXT", false, 0, null, 1));
        map2.put("interest_payment_amountPerNominal", new TableInfo.Column("interest_payment_amountPerNominal", "TEXT", false, 0, null, 1));
        map2.put("interest_payment_isConfirmed", new TableInfo.Column("interest_payment_isConfirmed", "INTEGER", false, 0, null, 1));
        map2.put("early_redemption_symbol", new TableInfo.Column("early_redemption_symbol", "TEXT", false, 0, null, 1));
        map2.put("early_redemption_ref", new TableInfo.Column("early_redemption_ref", "TEXT", false, 0, null, 1));
        map2.put("early_redemption_paymentDate", new TableInfo.Column("early_redemption_paymentDate", "TEXT", false, 0, null, 1));
        map2.put("early_redemption_observationDate", new TableInfo.Column("early_redemption_observationDate", "TEXT", false, 0, null, 1));
        map2.put("early_redemption_amountPerNominal", new TableInfo.Column("early_redemption_amountPerNominal", "TEXT", false, 0, null, 1));
        map2.put("early_redemption_isConfirmed", new TableInfo.Column("early_redemption_isConfirmed", "INTEGER", false, 0, null, 1));
        map2.put("maturity_redemption_symbol", new TableInfo.Column("maturity_redemption_symbol", "TEXT", false, 0, null, 1));
        map2.put("maturity_redemption_ref", new TableInfo.Column("maturity_redemption_ref", "TEXT", false, 0, null, 1));
        map2.put("maturity_redemption_paymentDate", new TableInfo.Column("maturity_redemption_paymentDate", "TEXT", false, 0, null, 1));
        map2.put("maturity_redemption_observationDate", new TableInfo.Column("maturity_redemption_observationDate", "TEXT", false, 0, null, 1));
        map2.put("maturity_redemption_amountPerNominal", new TableInfo.Column("maturity_redemption_amountPerNominal", "TEXT", false, 0, null, 1));
        HashSet hashSetS = o.s(map2, "maturity_redemption_isConfirmed", new TableInfo.Column("maturity_redemption_isConfirmed", "INTEGER", false, 0, null, 1), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new TableInfo.Index("index_calendar_events_effective_date_is_my_event", false, Arrays.asList("effective_date", "is_my_event"), Arrays.asList("ASC", "ASC")));
        TableInfo tableInfo3 = new TableInfo("calendar_events", map2, hashSetS, hashSet);
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "calendar_events");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("calendar_events(com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.model.CalendarEventEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
