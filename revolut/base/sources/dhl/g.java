package dhl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f114846c = new g();

    private g() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "ALTER TABLE `calendar_events` ADD COLUMN `earnings_call_symbol` TEXT DEFAULT null", "ALTER TABLE `calendar_events` ADD COLUMN `earnings_call_webcastStartDate` INTEGER DEFAULT null", "ALTER TABLE `calendar_events` ADD COLUMN `earnings_call_webcastEndDate` INTEGER DEFAULT null");
        o.D(supportSQLiteDatabase, "ALTER TABLE `calendar_events` ADD COLUMN `earnings_call_webcastUri` TEXT DEFAULT null", "ALTER TABLE `calendar_events` ADD COLUMN `earnings_call_replayWebcastUri` TEXT DEFAULT null", "ALTER TABLE `upcoming_events` ADD COLUMN `earnings_call_symbol` TEXT DEFAULT null", "ALTER TABLE `upcoming_events` ADD COLUMN `earnings_call_webcastStartDate` INTEGER DEFAULT null");
        o.C(supportSQLiteDatabase, "ALTER TABLE `upcoming_events` ADD COLUMN `earnings_call_webcastEndDate` INTEGER DEFAULT null", "ALTER TABLE `upcoming_events` ADD COLUMN `earnings_call_webcastUri` TEXT DEFAULT null", "ALTER TABLE `upcoming_events` ADD COLUMN `earnings_call_replayWebcastUri` TEXT DEFAULT null");
    }
}
