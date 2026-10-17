package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f202431c = new j0();

    private j0() {
        super(132, 133);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DELETE FROM `trading_trades`\n WHERE `merger` IS NOT NULL\n    OR `spin_off` IS NOT NULL\n    OR `stock_split` IS NOT NULL");
    }
}
