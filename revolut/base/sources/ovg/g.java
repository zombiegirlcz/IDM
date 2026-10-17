package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f230194c = new g();

    private g() {
        super(16, 17);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `complex_analytics_security_positions`", "CREATE TABLE IF NOT EXISTS `complex_analytics_security_positions` (\n    `currency` TEXT NOT NULL,\n    `portfolioId` TEXT NOT NULL,\n    `positionSymbol` TEXT NOT NULL,\n    `investment` TEXT NOT NULL,\n    `lastTransactionDate` INTEGER NOT NULL,\n    `averagePrice` TEXT NOT NULL,\n    PRIMARY KEY(`currency`, `portfolioId`)\n)");
    }
}
