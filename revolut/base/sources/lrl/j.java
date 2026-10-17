package lrl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f199559c = new j();

    private j() {
        super(19, 20);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `invest_orders`", "\n                CREATE TABLE IF NOT EXISTS `invest_orders` (\n                    `id` TEXT NOT NULL,\n                    `account_type` TEXT NOT NULL,\n                    `compound_id` TEXT NOT NULL,\n                    `created_at` INTEGER NOT NULL,\n                    `updated_at` INTEGER NOT NULL,\n                    `completed_at` INTEGER,\n                    `side` TEXT NOT NULL,\n                    `state` TEXT NOT NULL,\n                    `order_type` TEXT NOT NULL,\n                    `currency_pair_first` TEXT NOT NULL,\n                    `currency_pair_second` TEXT NOT NULL,\n                    `symbol` TEXT,\n                    `instrument_type` TEXT NOT NULL,\n                    `stock_order` TEXT,\n                    `tax_advantaged_order` TEXT,\n                    `commodity_order` TEXT,\n                    `margin_order` TEXT,\n                    `fund_order` TEXT,\n                    `initiated_by` TEXT,\n                    `account_holder_type` TEXT NOT NULL,\n                    PRIMARY KEY(`id`)\n                )\n            ");
    }
}
