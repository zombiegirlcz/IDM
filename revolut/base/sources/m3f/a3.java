package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class a3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a3 f202380c = new a3();

    private a3() {
        super(55, 56);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `entities_adt`(\n    `id` TEXT NOT NULL,\n    `completed_date` TEXT NOT NULL,\n    `updated_date` TEXT NOT NULL,\n    `trade_symbol` TEXT,\n    `trade_amount` TEXT,\n    `trade_quantity` REAL,\n    `trade_fees` TEXT,\n    `trade_commission` TEXT,\n    `trade_side` TEXT,\n    `cash_amount` TEXT,\n    `cash_side` TEXT,\n    `divident_symbol` TEXT,\n    `divident_amount` TEXT,\n    `divident_tax_symbol` TEXT,\n    `divident_tax_fees` TEXT,\n    `custody_fees` TEXT,\n    PRIMARY KEY(`id`)\n)", "CREATE INDEX IF NOT EXISTS `index_entities_adt_completed_date` ON `entities_adt` (`completed_date`)", "CREATE INDEX IF NOT EXISTS `index_entities_adt_updated_date` ON `entities_adt` (`updated_date`)");
    }
}
