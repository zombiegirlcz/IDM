package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class h4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h4 f202423c = new h4();

    private h4() {
        super(85, 86);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DELETE FROM `trading_trades` WHERE `margin_trade` IS NOT NULL");
    }
}
