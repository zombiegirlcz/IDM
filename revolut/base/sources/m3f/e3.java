package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e3 f202404c = new e3();

    private e3() {
        super(59, 60);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n                CREATE TABLE IF NOT EXISTS `instrument_details_recommendations` (\n                    `ref` TEXT NOT NULL,\n                    `recommendations` TEXT NOT NULL,\n                    PRIMARY KEY(`ref`)\n                )\n                ");
    }
}
