package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class p0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p0 f230213c = new p0();

    private p0() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `complex_analytics_dividends` (\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `portfolio_id` TEXT NOT NULL,\n    `date` TEXT NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `amount` TEXT NOT NULL,\n    PRIMARY KEY(`time_span`, `currency`, `portfolio_id`, `date`, `symbol`)\n)", "CREATE INDEX IF NOT EXISTS `index_complex_analytics_dividends_time_span_currency_portfolio_id` \nON `complex_analytics_dividends` (`time_span`, `currency`, `portfolio_id`)");
    }
}
