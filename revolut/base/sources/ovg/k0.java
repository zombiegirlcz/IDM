package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f230203c = new k0();

    private k0() {
        super(43, 44);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `complex_analytics_dividends` ADD COLUMN `account_types` TEXT DEFAULT null", "CREATE INDEX IF NOT EXISTS `index_complex_analytics_dividends_time_span_currency_portfolio_id_account_types`\nON `complex_analytics_dividends` (`time_span`, `currency`, `portfolio_id`, `account_types`)");
    }
}
