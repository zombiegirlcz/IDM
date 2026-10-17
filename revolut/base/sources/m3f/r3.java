package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class r3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r3 f202482c = new r3();

    private r3() {
        super(70, 71);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE INDEX IF NOT EXISTS `index_trading_trades_account_type_completed_at_updated_at_created_at` ON `trading_trades` (`account_type`, `completed_at`, `updated_at`, `created_at`)");
    }
}
