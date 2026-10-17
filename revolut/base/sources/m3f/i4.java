package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i4 f202429c = new i4();

    private i4() {
        super(86, 87);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DELETE FROM `trading_trades` WHERE `margin_trade` IS NOT NULL");
    }
}
