package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class u4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u4 f202501c = new u4();

    private u4() {
        super(97, 98);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DROP TABLE IF EXISTS `index_details`");
    }
}
