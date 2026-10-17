package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class s4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s4 f202489c = new s4();

    private s4() {
        super(95, 96);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `trading_trades` ADD COLUMN `base_instrument_currency` TEXT DEFAULT NULL", "ALTER TABLE `trading_trades` ADD COLUMN `counter_instrument_currency` TEXT DEFAULT NULL");
    }
}
