package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class u3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3 f202500c = new u3();

    private u3() {
        super(73, 74);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        try {
            database.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `bond_coupon` TEXT DEFAULT NULL");
            database.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `bond_redemption` TEXT DEFAULT NULL");
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }
}
