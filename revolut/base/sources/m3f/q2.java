package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class q2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q2 f202475c = new q2();

    private q2() {
        super(46, 47);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `etf_stats` ADD COLUMN `charges` TEXT");
    }
}
