package dhl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f114848c = new i();

    private i() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "ALTER TABLE `calendar_events` ADD COLUMN `ex_dividend_symbol` TEXT DEFAULT null", "ALTER TABLE `calendar_events` ADD COLUMN `ex_dividend_paymentDate` INTEGER DEFAULT null", "ALTER TABLE `calendar_events` ADD COLUMN `ex_dividend_amount` TEXT DEFAULT null");
        o.C(supportSQLiteDatabase, "ALTER TABLE `upcoming_events` ADD COLUMN `ex_dividend_symbol` TEXT DEFAULT null", "ALTER TABLE `upcoming_events` ADD COLUMN `ex_dividend_paymentDate` INTEGER DEFAULT null", "ALTER TABLE `upcoming_events` ADD COLUMN `ex_dividend_amount` TEXT DEFAULT null");
    }
}
