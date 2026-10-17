package so5;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f264783c = new h();

    private h() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "ALTER TABLE `crypto_addresses` ADD COLUMN `isRevolutAddress` INTEGER NOT NULL DEFAULT 0", "DELETE FROM `crypto_addresses`");
    }
}
