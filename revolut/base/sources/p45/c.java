package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f232814c = new c();

    private c() {
        super(15, 16);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `loans`", "CREATE TABLE IF NOT EXISTS `loans` (`id` TEXT NOT NULL,\n                `name` TEXT NOT NULL,\n                `disbursalDate` TEXT NOT NULL,\n                `finalRepaymentDate` TEXT NOT NULL,\n                `currency` TEXT NOT NULL,\n                `countryCode` TEXT NOT NULL,\n                `principal` INTEGER NOT NULL,\n                `totalRepaid` INTEGER NOT NULL,\n                `totalToRepay` INTEGER NOT NULL,\n                `fractionRepaid` REAL NOT NULL,\n                `state` TEXT NOT NULL,\n                `product` TEXT NOT NULL,\n                `repaidCount` INTEGER NOT NULL,\n                `interestRate` TEXT NOT NULL,\n                `nextInstalment` TEXT,\n                `lastPaidRepayment` TEXT,\n                `config` TEXT NOT NULL,\n                PRIMARY KEY(`id`)\n            )");
    }
}
