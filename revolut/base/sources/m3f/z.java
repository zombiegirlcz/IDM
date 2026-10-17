package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f202525c = new z();

    private z() {
        super(123, 124);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DELETE FROM `trading_trades` WHERE `overnight_fee` IS NOT NULL");
    }
}
