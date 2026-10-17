package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d4 f202399c = new d4();

    private d4() {
        super(81, 82);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `stock_transfer_trade` TEXT DEFAULT NULL");
    }
}
