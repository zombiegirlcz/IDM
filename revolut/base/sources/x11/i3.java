package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i3 f301879c = new i3();

    private i3() {
        super(194, 195);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `amount_breakdown_original_amount` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `amount_breakdown_original_currency` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `amount_breakdown_surcharge_amount` INTEGER DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `amount_breakdown_surcharge_currency` TEXT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `amount_breakdown_exchange_rate` REAL DEFAULT NULL");
    }
}
