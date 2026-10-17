package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class j1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j1 f202432c = new j1();

    private j1() {
        super(16, 17);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `instrument_details` ADD COLUMN `type` TEXT NOT NULL DEFAULT ''");
    }
}
