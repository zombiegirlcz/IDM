package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class x4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x4 f202519c = new x4();

    private x4() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n                CREATE TABLE IF NOT EXISTS `instrument_stats` (\n                `symbol` TEXT NOT NULL, \n                `price` TEXT NOT NULL,\n                `volume` TEXT NOT NULL,\n                `marketCap` TEXT NOT NULL,\n                `perShare` TEXT NOT NULL,\n                `dividend` TEXT NOT NULL,\n                `valuation` TEXT NOT NULL,\n                `profitability` TEXT NOT NULL,\n                `managementEffectiveness` TEXT NOT NULL,\n                PRIMARY KEY(`symbol`)\n            )\n            ");
    }
}
