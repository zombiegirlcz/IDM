package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f142544c = new p();

    private p() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `reports` (\n    `portfolioId` TEXT NOT NULL,\n    `fromEpochDay` INTEGER NOT NULL,\n    `toEpochDay` INTEGER NOT NULL,\n    PRIMARY KEY(`portfolioId`, `fromEpochDay`, `toEpochDay`)\n)", "CREATE TABLE IF NOT EXISTS `us_reports` (\n    `portfolioId` TEXT NOT NULL,\n    `fromEpochDay` INTEGER NOT NULL,\n    `toEpochDay` INTEGER NOT NULL,\n    PRIMARY KEY(`portfolioId`, `fromEpochDay`, `toEpochDay`)\n)");
    }
}
