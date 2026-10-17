package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class r0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f202479c = new r0();

    private r0() {
        super(13, 14);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `trading_investments`", "CREATE TABLE IF NOT EXISTS `trading_investments` (\n    `type` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `investment` TEXT NOT NULL,\n    `lastTransactionDate` INTEGER NOT NULL,\n    `averagePrice` TEXT NOT NULL,\n    PRIMARY KEY(`type`, `currency`)\n)");
    }
}
