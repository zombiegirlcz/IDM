package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f230189c = new d0();

    private d0() {
        super(37, 38);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `complex_analytics_revenue`", "CREATE TABLE IF NOT EXISTS `complex_analytics_dividends` (\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `portfolio_id` TEXT NOT NULL,\n    `date` TEXT NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `ref` TEXT NOT NULL, \n    `amount` TEXT NOT NULL,\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_complex_analytics_dividends_time_span_currency_portfolio_id`\nON `complex_analytics_dividends` (`time_span`, `currency`, `portfolio_id`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_complex_analytics_dividends_time_span_currency_portfolio_id_ref`\nON `complex_analytics_dividends` (`time_span`, `currency`, `portfolio_id`, `ref`)");
    }
}
