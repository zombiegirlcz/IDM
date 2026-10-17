package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class g3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g3 f202416c = new g3();

    private g3() {
        super(60, 61);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DELETE FROM `portfolios`", "ALTER TABLE `portfolios` ADD COLUMN `initialTopupPerformed` INTEGER DEFAULT NULL");
    }
}
