package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class g9 extends Migration {
    public g9() {
        super(33, 34);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "UPDATE `robo_portfolios` SET `info` = '{}';", "DROP TABLE IF EXISTS `robo_portfolio_performance_points`");
    }
}
