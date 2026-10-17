package lrl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f199567c = new r();

    private r() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `trading_orders` ADD COLUMN `startDate` INTEGER", "ALTER TABLE `trading_orders` ADD COLUMN `period` TEXT", "ALTER TABLE `trading_orders` ADD COLUMN `autoTopUpPocketId` TEXT");
        supportSQLiteDatabase.execSQL("ALTER TABLE `trading_orders` ADD COLUMN `scheduledExecutionDate` INTEGER");
    }
}
