package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class fc extends Migration {
    public fc() {
        super(64, 65);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE `holding_performance_points`", "DROP TABLE `portfolio_performance_points`", "CREATE TABLE IF NOT EXISTS `instruments` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `ticker` TEXT NOT NULL, `currency` TEXT NOT NULL, `icon` TEXT NOT NULL, `isin` TEXT NOT NULL, `quantityDecimalPlaces` INTEGER NOT NULL, `tradeable` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
