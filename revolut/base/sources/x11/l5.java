package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class l5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l5 f301917c = new l5();

    private l5() {
        super(239, 240);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `salary_advance_remainder_salary` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `salary_advance_remainder_advanced` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `salary_advance_remainder_fee` INTEGER DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `salary_advance_remainder_currency` TEXT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `salary_advance_remainder_payCycleId` TEXT DEFAULT NULL");
    }
}
