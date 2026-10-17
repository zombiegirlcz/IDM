package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class u1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u1 f202498c = new u1();

    private u1() {
        super(26, 27);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `instrument_details` ADD COLUMN `esgScores` TEXT", "ALTER TABLE `etf_details` ADD COLUMN `esgScores` TEXT");
    }
}
