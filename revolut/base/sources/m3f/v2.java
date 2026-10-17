package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class v2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v2 f202505c = new v2();

    private v2() {
        super(50, 51);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS account_closure_progress", "CREATE TABLE IF NOT EXISTS `account_closure_progress` (\n    `id` TEXT NOT NULL,\n    `state` TEXT NOT NULL,\n    `portfolioId` TEXT NOT NULL,\n    `createdDate` INTEGER NOT NULL,\n    `updatedDate` INTEGER NOT NULL,\n    `source` TEXT NOT NULL,\n    `tradingLegalEntityId` TEXT NOT NULL,\n    `reason` TEXT,\n    `currentStep` TEXT NOT NULL,\n    `pendingSteps` TEXT NOT NULL,\n    `completedSteps` TEXT NOT NULL,\n    `blocked` INTEGER NOT NULL DEFAULT(0),\n    `estimatedCompletionDate` TEXT NOT NULL,\n    PRIMARY KEY(`id`),\n    FOREIGN KEY(`portfolioId`) REFERENCES `portfolios`(`id`)\n    ON UPDATE NO ACTION\n    ON DELETE CASCADE \n)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_account_closure_progress_portfolioId` \nON `account_closure_progress` (`portfolioId`)");
    }
}
