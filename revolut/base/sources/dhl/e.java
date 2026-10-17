package dhl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f114844c = new e();

    private e() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `calendar_events`", "DROP TABLE IF EXISTS `upcoming_events`", "    CREATE TABLE IF NOT EXISTS `upcoming_events` (\n    `eventId` TEXT NOT NULL,\n    `type` TEXT NOT NULL,\n    `effective_date` INTEGER NOT NULL,\n    `market_holiday_holiday` TEXT,\n    `market_holiday_name` TEXT,\n    `market_holiday_marketClosed` INTEGER,\n    `market_holiday_marketOpenTime` INTEGER,\n    `market_holiday_marketCloseTime` INTEGER,\n    `cash_dividend_symbol` TEXT,\n    `cash_dividend_exDividendDate` INTEGER,\n    `cash_dividend_amount` TEXT,\n    `stock_dividend_symbol` TEXT,\n    `stock_dividend_exDividendDate` INTEGER,\n    `stock_dividend_quantity` REAL,\n    `listing_symbol` TEXT,\n    `de_listing_symbol` TEXT,\n    `symbol_change_symbol` TEXT,\n    `symbol_change_oldSymbol` TEXT,\n    `symbol_change_newSymbol` TEXT,\n    `stock_split_symbol` TEXT,\n    `stock_split_exDividendDate` INTEGER,\n    `stock_split_paymentDate` INTEGER,\n    `stock_split_before` INTEGER,\n    `stock_split_after` INTEGER,\n    PRIMARY KEY(`eventId`)\n)");
        supportSQLiteDatabase.execSQL("    CREATE TABLE IF NOT EXISTS `calendar_events` (\n    `eventId` TEXT NOT NULL,\n    `type` TEXT NOT NULL,\n    `effective_date` INTEGER NOT NULL,\n    `is_my_event` INTEGER NOT NULL,\n    `market_holiday_holiday` TEXT,\n    `market_holiday_name` TEXT,\n    `market_holiday_marketClosed` INTEGER,\n    `market_holiday_marketOpenTime` INTEGER,\n    `market_holiday_marketCloseTime` INTEGER,\n    `cash_dividend_symbol` TEXT,\n    `cash_dividend_exDividendDate` INTEGER,\n    `cash_dividend_amount` TEXT,\n    `stock_dividend_symbol` TEXT,\n    `stock_dividend_exDividendDate` INTEGER,\n    `stock_dividend_quantity` REAL,\n    `listing_symbol` TEXT,\n    `de_listing_symbol` TEXT, \n    `symbol_change_symbol` TEXT,\n    `symbol_change_oldSymbol` TEXT,\n    `symbol_change_newSymbol` TEXT,\n    `stock_split_symbol` TEXT,\n    `stock_split_exDividendDate` INTEGER,\n    `stock_split_paymentDate` INTEGER,\n    `stock_split_before` INTEGER,\n    `stock_split_after` INTEGER,\n    PRIMARY KEY(`eventId`, `is_my_event`)\n)");
        supportSQLiteDatabase.execSQL("    CREATE INDEX IF NOT EXISTS `index_calendar_events_effective_date_is_my_event` ON `calendar_events` (\n    `effective_date`,\n    `is_my_event`\n)");
    }
}
