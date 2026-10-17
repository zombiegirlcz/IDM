package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f2 f202409c = new f2();

    private f2() {
        super(36, 37);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `slip_transaction` INTEGER NOT NULL DEFAULT 0");
    }
}
