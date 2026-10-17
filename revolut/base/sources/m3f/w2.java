package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class w2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w2 f202511c = new w2();

    private w2() {
        super(51, 52);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `trading_trades` ADD COLUMN `margin_trade` TEXT DEFAULT NULL", "ALTER TABLE `trading_trades` ADD COLUMN `overnight_fee` INTEGER NOT NULL DEFAULT 0");
    }
}
