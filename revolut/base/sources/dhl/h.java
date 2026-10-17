package dhl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f114847c = new h();

    private h() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "ALTER TABLE `calendar_events` ADD COLUMN `earnings_call_transcriptUri` TEXT DEFAULT null", "ALTER TABLE `upcoming_events` ADD COLUMN `earnings_call_transcriptUri` TEXT DEFAULT null");
    }
}
