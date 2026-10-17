package so5;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f264786c = new k();

    private k() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "ALTER TABLE `crypto_addresses` ADD COLUMN `createdDate` INTEGER NOT NULL DEFAULT 1", "DELETE FROM `crypto_addresses`");
    }
}
