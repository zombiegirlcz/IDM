package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g2 f202415c = new g2();

    private g2() {
        super(37, 38);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `trading_banners` ADD COLUMN `view_type` TEXT DEFAULT null");
    }
}
