package yo3;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f315551c = new a();

    private a() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        f315551c.getClass();
        db8.execSQL("DROP TABLE IF EXISTS `upcoming_events`");
        db8.execSQL("CREATE TABLE IF NOT EXISTS `upcoming_events` (\n`eventId` TEXT NOT NULL,\n`type` TEXT NOT NULL,\n`effective_date` TEXT NOT NULL,\n`market_holiday_holiday` TEXT,\n`market_holiday_name` TEXT,\n`market_holiday_marketClosed` INTEGER,\n`market_holiday_marketOpenTime` INTEGER,\n`market_holiday_marketCloseTime` INTEGER,\n`cash_dividend_symbol` TEXT,\n`cash_dividend_ref` TEXT,\n`cash_dividend_exDividendDate` TEXT,\n`cash_dividend_amount` TEXT,\n`stock_dividend_symbol` TEXT,\n`stock_dividend_ref` TEXT,\n`stock_dividend_exDividendDate` TEXT,\n`stock_dividend_quantity` REAL,\n`listing_status_symbol` TEXT,\n`listing_status_ref` TEXT,\n`listing_status_status` TEXT,\n`symbol_change_symbol` TEXT,\n`symbol_change_ref` TEXT,\n`symbol_change_oldSymbol` TEXT,\n`symbol_change_newSymbol` TEXT,\n`stock_split_symbol` TEXT,\n`stock_split_ref` TEXT,\n`stock_split_exDividendDate` TEXT,\n`stock_split_paymentDate` TEXT,\n`stock_split_before` INTEGER,\n`stock_split_after` INTEGER,\n`earnings_call_symbol` TEXT,\n`earnings_call_ref` TEXT,\n`earnings_call_webcastStartDate` INTEGER,\n`earnings_call_webcastEndDate` INTEGER,\n`earnings_call_webcastUri` TEXT,\n`earnings_call_replayWebcastUri` TEXT,\n`earnings_call_transcriptUri` TEXT,\n`ex_dividend_symbol` TEXT,\n`ex_dividend_ref` TEXT,\n`ex_dividend_paymentDate` TEXT,\n`ex_dividend_amount` TEXT,\n`merger_symbol` TEXT,\n`merger_ref` TEXT,\n`merger_details` TEXT,\n`spinoff_symbol` TEXT,\n`spinoff_ref` TEXT,\n`spinoff_details` TEXT,\n`bankruptcy_symbol` TEXT,\n`bankruptcy_ref` TEXT,\nPRIMARY KEY(`eventId`))");
        db8.execSQL("DROP TABLE IF EXISTS `calendar_events`");
        db8.execSQL("CREATE TABLE IF NOT EXISTS `calendar_events` (\n`eventId` TEXT NOT NULL,\n`type` TEXT NOT NULL,\n`effective_date` TEXT NOT NULL,\n`is_my_event` INTEGER NOT NULL,\n`market_holiday_holiday` TEXT,\n`market_holiday_name` TEXT,\n`market_holiday_marketClosed` INTEGER,\n`market_holiday_marketOpenTime` INTEGER,\n`market_holiday_marketCloseTime` INTEGER,\n`cash_dividend_symbol` TEXT,\n`cash_dividend_ref` TEXT,\n`cash_dividend_exDividendDate` TEXT,\n`cash_dividend_amount` TEXT,\n`stock_dividend_symbol` TEXT,\n`stock_dividend_ref` TEXT,\n`stock_dividend_exDividendDate` TEXT,\n`stock_dividend_quantity` REAL,\n`listing_status_symbol` TEXT,\n`listing_status_ref` TEXT,\n`listing_status_status` TEXT,\n`symbol_change_symbol` TEXT,\n`symbol_change_ref` TEXT,\n`symbol_change_oldSymbol` TEXT,\n`symbol_change_newSymbol` TEXT,\n`stock_split_symbol` TEXT,\n`stock_split_ref` TEXT,\n`stock_split_exDividendDate` TEXT,\n`stock_split_paymentDate` TEXT,\n`stock_split_before` INTEGER,\n`stock_split_after` INTEGER,\n`earnings_call_symbol` TEXT,\n`earnings_call_ref` TEXT,\n`earnings_call_webcastStartDate` INTEGER,\n`earnings_call_webcastEndDate` INTEGER,\n`earnings_call_webcastUri` TEXT,\n`earnings_call_replayWebcastUri` TEXT,\n`earnings_call_transcriptUri` TEXT,\n`ex_dividend_symbol` TEXT,\n`ex_dividend_ref` TEXT,\n`ex_dividend_paymentDate` TEXT,\n`ex_dividend_amount` TEXT,\n`merger_symbol` TEXT,\n`merger_ref` TEXT,\n`merger_details` TEXT,\n`spinoff_symbol` TEXT,\n`spinoff_ref` TEXT,\n`spinoff_details` TEXT,\n`bankruptcy_symbol` TEXT,\n`bankruptcy_ref` TEXT,\nPRIMARY KEY(`eventId`, `is_my_event`))");
        db8.execSQL("CREATE INDEX IF NOT EXISTS `index_calendar_events_effective_date_is_my_event` ON `calendar_events` (`effective_date`, `is_my_event`)");
    }
}
