package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f202384c = new b1();

    private b1() {
        super(149, 150);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `initiated_by` TEXT DEFAULT null");
    }
}
