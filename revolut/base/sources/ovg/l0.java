package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f230205c = new l0();

    private l0() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `complex_analytics_realised_pnl` (\n    `asset_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `asset` TEXT NOT NULL,\n    `sell_date` TEXT NOT NULL,\n    `asset_amount` TEXT NOT NULL,\n    `sell_amount` TEXT NOT NULL,\n    `pnl_fifo` TEXT NOT NULL,\n    `pnl_average` TEXT NOT NULL,\n    PRIMARY KEY(`asset_type`, `time_span`, `currency`, `asset`)\n)", "CREATE INDEX IF NOT EXISTS `index_complex_analytics_realised_pnl_asset_type_time_span_currency`\nON `complex_analytics_realised_pnl` (`asset_type`, `time_span`, `currency`)");
    }
}
