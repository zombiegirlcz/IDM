package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f230202c = new k();

    private k() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("CREATE TABLE IF NOT EXISTS `entities_adt` (\n    `id` TEXT NOT NULL,\n    `completed_date` INTEGER NOT NULL,\n    `updated_date` INTEGER NOT NULL,\n    `trade_symbol` TEXT,\n    `trade_amount` TEXT,\n    `trade_quantity` REAL,\n    `trade_fees` TEXT,\n    `trade_commission` TEXT,\n    `trade_side` TEXT,\n    `cash_amount` TEXT,\n    `cash_side` TEXT,\n    `divident_symbol` TEXT,\n    `divident_amount` TEXT,\n    `divident_tax_symbol` TEXT,\n    `divident_tax_fees` TEXT,\n    `custody_fees` TEXT,\n    PRIMARY KEY(`id`)\n)");
        database.execSQL("CREATE INDEX IF NOT EXISTS `index_entities_adt_completed_date` ON `entities_adt` (`completed_date`)");
        database.execSQL("CREATE INDEX IF NOT EXISTS `index_entities_adt_updated_date` ON `entities_adt` (`updated_date`)");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
