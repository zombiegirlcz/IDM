package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f202449c = new m0();

    private m0() {
        super(135, 136);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DELETE FROM instruments WHERE type = '" + tbl.a.b(nel.z.ETN) + "'");
    }
}
