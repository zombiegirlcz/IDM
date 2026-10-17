package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class y3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y3 f202524c = new y3();

    private y3() {
        super(77, 78);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `exchange_trade` TEXT DEFAULT NULL");
    }
}
