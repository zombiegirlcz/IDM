package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class z2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z2 f202528c = new z2();

    private z2() {
        super(54, 55);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `portfolio_trades` ADD COLUMN `margin_trade` TEXT DEFAULT NULL", "ALTER TABLE `portfolio_trades` ADD COLUMN `overnight_fee` INTEGER NOT NULL DEFAULT 0");
    }
}
