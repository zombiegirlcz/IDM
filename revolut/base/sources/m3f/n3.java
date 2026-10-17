package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class n3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n3 f202458c = new n3();

    private n3() {
        super(67, 68);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n                CREATE TABLE IF NOT EXISTS `instrument_governance` (\n                    `ref` TEXT NOT NULL,\n                    `targetMarket` TEXT NOT NULL,\n                    PRIMARY KEY(`ref`)\n                )\n                ");
    }
}
