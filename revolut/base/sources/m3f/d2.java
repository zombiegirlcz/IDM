package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2 f202397c = new d2();

    private d2() {
        super(34, 35);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DELETE FROM `portfolios`");
    }
}
