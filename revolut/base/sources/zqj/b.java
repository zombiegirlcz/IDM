package zqj;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f324498c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE `budget_entity`", "CREATE TABLE IF NOT EXISTS `budget_entity` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `amount` INTEGER NOT NULL, `pocketId` TEXT NOT NULL, `currency` TEXT NOT NULL, `startDate` TEXT NOT NULL, `endDate` TEXT NOT NULL, `budgetCyclePeriod` TEXT NOT NULL, `budgetCycleStartDay` INTEGER NOT NULL, `categoryTag` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
