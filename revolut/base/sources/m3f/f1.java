package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes8.dex */
public final class f1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f202408c = new f1();

    private f1() {
        super(SyslogConstants.LOG_LOCAL3, 153);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER TABLE `trading_trades` ADD COLUMN `currency_pair_first` TEXT DEFAULT NULL", "ALTER TABLE `trading_trades` ADD COLUMN `currency_pair_second` TEXT DEFAULT NULL", "ALTER TABLE `trading_trades` ADD COLUMN `awaiting_settlement` INTEGER DEFAULT NULL");
    }
}
