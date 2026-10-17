package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f142536c = new h();

    private h() {
        super(17, 18);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `instruments` ADD COLUMN `state_reason` TEXT DEFAULT null", "ALTER TABLE `instruments` ADD COLUMN `delist_date` INTEGER DEFAULT null");
    }
}
