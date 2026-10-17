package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class h3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h3 f202422c = new h3();

    private h3() {
        super(61, 62);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `instrument_tickers` ADD COLUMN `lastDirty` TEXT DEFAULT NULL");
    }
}
