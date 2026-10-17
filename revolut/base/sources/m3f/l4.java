package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class l4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l4 f202447c = new l4();

    private l4() {
        super(89, 90);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DROP table IF EXISTS `collections`");
    }
}
