package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f174396c = new h();

    private h() {
        super(17, 18);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DELETE FROM `plan_updates`", "DROP TABLE IF EXISTS `plans`", "CREATE TABLE IF NOT EXISTS `plans`( \n                    `id` TEXT NOT NULL,\n                    `transactionId` TEXT NOT NULL,\n                    `facilityId` TEXT NOT NULL,\n                    `merchantName` TEXT NOT NULL,\n                    `merchantLogoUrl` TEXT,\n                    `merchantLogoName` TEXT,\n                    `startDateTime` INTEGER NOT NULL,\n                    `updateDateTime` INTEGER NOT NULL,\n                    `amount` INTEGER NOT NULL,\n                    `fee` INTEGER NOT NULL,\n                    `lateInterest` INTEGER NOT NULL,\n                    `currency` TEXT NOT NULL,\n                    `state` TEXT NOT NULL,\n                    `rescheduleVersion` INTEGER,\n                    `withdrawalTransactionId` TEXT,\n                    `cancellationOrigin` TEXT,\n                    `feeType` TEXT NOT NULL,\n                    `origin` TEXT NOT NULL,\n                    PRIMARY KEY(`id`))");
    }
}
