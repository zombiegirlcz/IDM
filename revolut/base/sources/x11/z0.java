package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f302076c = new z0();

    private z0() {
        super(143, SyslogConstants.LOG_LOCAL2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        wp5.y.z(supportSQLiteDatabase, "database", "\n                    CREATE TABLE IF NOT EXISTS `instruments_watchlist_new`\n                    (`symbol` TEXT NOT NULL, \n                    `synced` INTEGER NOT NULL, \n                    PRIMARY KEY(`symbol`))\n                ", "\n                    INSERT INTO `instruments_watchlist_new`\n                    (`symbol`,`synced`)\n                    SELECT \n                    `symbol`, `synced`\n                    FROM `instruments_watchlist`\n                ", "DROP TABLE `instruments_watchlist`");
        wp5.y.y(supportSQLiteDatabase, "ALTER TABLE instruments_watchlist_new RENAME TO instruments_watchlist");
    }
}
