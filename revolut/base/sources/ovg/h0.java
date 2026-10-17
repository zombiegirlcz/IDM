package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f230197c = new h0();

    private h0() {
        super(40, 41);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_realised_pnl` (\n    `request_product_types` TEXT NOT NULL,\n    `item_product_type` TEXT NOT NULL,\n    `time_span` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `asset` TEXT NOT NULL,\n    `sell_date` TEXT NOT NULL,\n    `pnl_fifo` TEXT NOT NULL,\n    `pnl_average` TEXT NOT NULL,\n    `ref` TEXT,\n    `opening_price` TEXT,\n    `quantity` TEXT,\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL\n)", "CREATE INDEX IF NOT EXISTS `index_complex_analytics_combined_realised_pnl_request_product_types_time_span_currency`\nON `complex_analytics_combined_realised_pnl` (`request_product_types`, `time_span`, `currency`)");
    }
}
