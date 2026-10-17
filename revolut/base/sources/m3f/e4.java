package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e4 f202405c = new e4();

    private e4() {
        super(82, 83);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `refund` INTEGER NOT NULL DEFAULT 0");
    }
}
