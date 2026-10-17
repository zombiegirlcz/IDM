package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f142545c = new q();

    private q() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `portfolios` (\n    `id` TEXT NOT NULL,\n    `state` TEXT NOT NULL,\n    `asset_types` TEXT NOT NULL,\n    `balance` TEXT,\n    `kyc` TEXT NOT NULL,\n    `disclosures` TEXT NOT NULL,\n    `info` TEXT NOT NULL,\n    `onboardedDate` INTEGER,\n    `offboardedDate` INTEGER,\n    PRIMARY KEY(`id`)\n)", "CREATE TABLE IF NOT EXISTS `holdings` (\n    `id` TEXT NOT NULL,\n    `portfolio_id` TEXT NOT NULL,\n    `creation_date` INTEGER,\n    `holding_state` TEXT NOT NULL,\n    `name` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `cash_holding` TEXT,\n    `stock_holding` TEXT,\n    PRIMARY KEY(`id`, `portfolio_id`)\n)");
    }
}
