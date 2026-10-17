package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class q3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q3 f202476c = new q3();

    private q3() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("UPDATE `instrument_details` SET `analystsSummary` = NULL");
    }
}
