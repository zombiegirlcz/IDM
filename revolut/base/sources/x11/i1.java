package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i1 f301877c = new i1();

    private i1() {
        super(150, ISO7816.TAG_SM_EXPECTED_LENGTH);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "\n                CREATE TABLE IF NOT EXISTS `entities_adt` (\n                    `id` TEXT NOT NULL,\n                    `completed_date` INTEGER NOT NULL,\n                    `updated_date` INTEGER NOT NULL,\n                    `trade_symbol` TEXT,\n                    `trade_amount` TEXT,\n                    `trade_quantity` REAL,\n                    `trade_fees` TEXT,\n                    `trade_commission` TEXT,\n                    `trade_side` TEXT,\n                    `cash_amount` TEXT,\n                    `cash_side` TEXT,\n                    `divident_symbol` TEXT,\n                    `divident_amount` TEXT,\n                    `divident_tax_symbol` TEXT,\n                    `divident_tax_fees` TEXT,\n                    `custody_fees` TEXT,\n                    PRIMARY KEY(`id`))\n                ", "\n                    CREATE INDEX IF NOT EXISTS `index_entities_adt_completed_date` ON `entities_adt` (`completed_date`)\n                    ", "\n                    CREATE INDEX IF NOT EXISTS `index_entities_adt_updated_date` ON `entities_adt` (`updated_date`)\n                    ");
    }
}
