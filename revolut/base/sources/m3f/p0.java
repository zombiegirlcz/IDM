package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p0 f202467c = new p0();

    private p0() {
        super(138, 139);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `trading_trades` ADD `stock_promotion_clawback` INTEGER NOT NULL DEFAULT 0");
    }
}
