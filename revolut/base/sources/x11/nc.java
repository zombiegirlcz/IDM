package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class nc extends Migration {
    public nc() {
        super(68, 69);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `robo_holdings`", "DROP TABLE IF EXISTS `robo_holding_performance_points`", "DROP TABLE IF EXISTS `robo_portfolios`");
        supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `robo_trades`");
    }
}
