package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class c2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2 f202391c = new c2();

    private c2() {
        super(33, 34);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DELETE FROM `etf_details`", "ALTER TABLE `etf_details` ADD COLUMN `stockExchangeCode` TEXT NOT NULL DEFAULT \"\"", "DELETE FROM `instrument_details`");
        supportSQLiteDatabase.execSQL("ALTER TABLE `instrument_details` ADD COLUMN `stockExchangeCode` TEXT NOT NULL DEFAULT \"\"");
    }
}
