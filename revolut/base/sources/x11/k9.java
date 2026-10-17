package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class k9 extends Migration {
    public k9() {
        super(34, 35);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `robo_holdings`", "CREATE TABLE IF NOT EXISTS `robo_holdings` (`id` TEXT NOT NULL, `creation_date` INTEGER, `holding_state` TEXT NOT NULL, `account_type` TEXT NOT NULL, `name` TEXT NOT NULL, `currency` TEXT NOT NULL, `details` TEXT NOT NULL, PRIMARY KEY(`id`))", "DROP TABLE IF EXISTS `robo_portfolios`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `robo_portfolios` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `kyc` TEXT NOT NULL, `info` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
