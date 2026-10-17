package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f202454c = new n();

    private n() {
        super(112, 113);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        f202454c.getClass();
        db8.execSQL("DROP TABLE IF EXISTS `entities_adt`");
        db8.execSQL(kotlin.text.t.e("\n                CREATE TABLE IF NOT EXISTS `entities_adt`(\n                    `id` TEXT NOT NULL,\n                    `completed_date` TEXT NOT NULL,\n                    `updated_date` TEXT NOT NULL,\n                    `trade_symbol` TEXT,\n                    `trade_ref` TEXT,\n                    `trade_amount` TEXT,\n                    `trade_quantity` REAL,\n                    `trade_fees` TEXT,\n                    `trade_commission` TEXT,\n                    `trade_side` TEXT,\n                    `cash_amount` TEXT,\n                    `cash_side` TEXT,\n                    `divident_symbol` TEXT,\n                    `divident_ref` TEXT,\n                    `divident_amount` TEXT,\n                    `divident_tax_symbol` TEXT,\n                    `divident_tax_ref` TEXT,\n                    `divident_tax_fees` TEXT,\n                    `custody_fees` TEXT,\n                    PRIMARY KEY(`id`)\n                )\n            "));
        db8.execSQL("CREATE INDEX IF NOT EXISTS `index_entities_adt_completed_date` ON `entities_adt` (`completed_date`)");
        db8.execSQL("CREATE INDEX IF NOT EXISTS `index_entities_adt_updated_date` ON `entities_adt` (`updated_date`)");
    }
}
