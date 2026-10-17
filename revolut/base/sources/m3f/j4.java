package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class j4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j4 f202435c = new j4();

    private j4() {
        super(87, 88);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `trading_trades` ADD `price_adjustment` INTEGER NOT NULL DEFAULT 0");
    }
}
