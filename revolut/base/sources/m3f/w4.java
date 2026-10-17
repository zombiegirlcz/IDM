package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class w4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w4 f202513c = new w4();

    private w4() {
        super(99, 100);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `fee_trade` TEXT DEFAULT NULL");
    }
}
