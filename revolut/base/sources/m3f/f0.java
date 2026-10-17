package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f202407c = new f0();

    private f0() {
        super(129, 130);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `trading_trades` ADD COLUMN `merger` TEXT DEFAULT NULL", "ALTER TABLE `trading_trades` ADD COLUMN `spin_off` TEXT DEFAULT NULL", "ALTER TABLE `trading_trades` ADD COLUMN `stock_split` TEXT DEFAULT NULL");
    }
}
