package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b3 f202386c = new b3();

    private b3() {
        super(56, 57);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n                CREATE TABLE IF NOT EXISTS `bond_stats` (\n                    `symbol` TEXT NOT NULL, \n                    `price` TEXT NOT NULL,\n                    `primaryStats` TEXT NOT NULL,\n                    `yieldStats` TEXT NOT NULL,\n                    `riskStats` TEXT NOT NULL,\n                    PRIMARY KEY(`symbol`)\n                )\n            ");
    }
}
