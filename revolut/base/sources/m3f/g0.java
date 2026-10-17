package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class g0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f202413c = new g0();

    private g0() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `crypto_investments`", "CREATE TABLE IF NOT EXISTS `trading_investments`(\n    `type` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `investment` TEXT NOT NULL,\n    `lastTransactionDate` INTEGER NOT NULL,\n     PRIMARY KEY(`type`)\n)");
    }
}
