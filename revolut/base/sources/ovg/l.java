package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f230204c = new l();

    private l() {
        super(20, 21);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_performance_chart` (`time_span` TEXT NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, `last_modified` INTEGER NOT NULL, PRIMARY KEY(`time_span`))", "CREATE TABLE IF NOT EXISTS `complex_analytics_combined_performance_chart_point` (`time_span` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `returns` REAL NOT NULL, `totalReturns` REAL NOT NULL, `benchmark` REAL, `pnl` TEXT NOT NULL, PRIMARY KEY(`time_span`, `timestamp`), FOREIGN KEY(`time_span`) REFERENCES `complex_analytics_combined_performance_chart`(`time_span`) ON UPDATE NO ACTION ON DELETE CASCADE )");
    }
}
