package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class q1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f202474c = new q1();

    private q1() {
        super(22, 23);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE etf_details ADD COLUMN 'prospectusUrl' TEXT DEFAULT NULL");
    }
}
