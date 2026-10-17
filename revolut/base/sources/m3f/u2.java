package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class u2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u2 f202499c = new u2();

    private u2() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n            CREATE TABLE IF NOT EXISTS `instrument_details` (\n                `symbol` TEXT NOT NULL, \n                `sector` TEXT NOT NULL,\n                `description` TEXT, \n                `stats` TEXT, \n                `analystsSummary` TEXT,\n                PRIMARY KEY(`symbol`)\n            )\n        ");
    }
}
