package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class w extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f232834c = new w();

    private w() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `loans`", "CREATE TABLE IF NOT EXISTS `loans`(\n               `id` TEXT NOT NULL,\n               `name` TEXT NOT NULL,\n               `disbursalDate` TEXT NOT NULL,\n               `finalRepaymentDate` TEXT NOT NULL,\n               `currency` TEXT NOT NULL,\n               `countryCode` TEXT NOT NULL,\n               `principal` INTEGER NOT NULL,\n               `totalRepaid` INTEGER NOT NULL,\n               `totalToRepay` INTEGER NOT NULL,\n               `percentageRepaid` INTEGER NOT NULL,\n               `isRefinancing` INTEGER NOT NULL,\n               `state` TEXT NOT NULL,\n               `config_backupCardEnabled` INTEGER NOT NULL,\n               `config_autoPayEnabled` INTEGER NOT NULL,\n               `config_statementType` TEXT NOT NULL,\n               `config_repaymentDayChangeEnabled` INTEGER NOT NULL,\n               `config_financialDifficultiesEnabled` INTEGER NOT NULL,\n               PRIMARY KEY (`id`)\n           )");
    }
}
