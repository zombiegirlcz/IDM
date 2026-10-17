package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class o3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o3 f202464c = new o3();

    private o3() {
        super(68, 69);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        try {
            database.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `portfolio_id` TEXT DEFAULT NULL");
            database.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `account_type` TEXT NOT NULL DEFAULT 'UNSPECIFIED'");
            database.execSQL("ALTER TABLE `portfolio_trades` ADD COLUMN `account_type` TEXT NOT NULL DEFAULT 'UNSPECIFIED'");
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }
}
