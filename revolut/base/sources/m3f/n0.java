package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n0 f202455c = new n0();

    private n0() {
        super(136, 137);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DELETE FROM `holdings`\nWHERE `stock_holding` IS NOT NULL");
    }
}
