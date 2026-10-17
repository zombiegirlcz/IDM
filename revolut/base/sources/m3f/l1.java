package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class l1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l1 f202444c = new l1();

    private l1() {
        super(18, 19);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `portfolios`", "CREATE TABLE IF NOT EXISTS `portfolios` (\n    `id` TEXT NOT NULL,\n    `state` TEXT NOT NULL,\n    `asset_types` TEXT NOT NULL,\n    `balance` TEXT,\n    `kyc` TEXT NOT NULL,\n    `disclosures` TEXT NOT NULL,\n    `info` TEXT NOT NULL,\n    PRIMARY KEY(`id`)\n)");
    }
}
