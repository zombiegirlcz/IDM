package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i3 f202428c = new i3();

    private i3() {
        super(62, 63);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `instrument_tickers` ADD COLUMN `type` TEXT NOT NULL DEFAULT 'UNSPECIFIED'");
    }
}
