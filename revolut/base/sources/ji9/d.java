package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f174392c = new d();

    private d() {
        super(13, 14);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `limits`", "CREATE TABLE IF NOT EXISTS `limits`(\n                    `facilityId` TEXT NOT NULL,\n                    `pocketId` TEXT NOT NULL,\n                    `fee` TEXT NOT NULL,\n                    `lateInterest` TEXT NOT NULL,\n                    `apr` TEXT NOT NULL,\n                    `countryCode` TEXT NOT NULL,\n                    `availableToSpend` INTEGER NOT NULL,\n                    `currency` TEXT NOT NULL,\n                    `state` TEXT NOT NULL,\n                    `allowCardIssue` INTEGER NOT NULL,\n                    `deactivationReason` TEXT,\n                    `maxPurchaseAmount` INTEGER NOT NULL,\n                    PRIMARY KEY(`facilityId`))");
    }
}
