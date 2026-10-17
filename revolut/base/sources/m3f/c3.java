package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c3 f202392c = new c3();

    private c3() {
        super(57, 58);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n                CREATE TABLE IF NOT EXISTS `bond_details` (\n                    `ref` TEXT NOT NULL,\n                    `symbol` TEXT NOT NULL, \n                    `stock_exchange_code` TEXT NOT NULL,\n                    `issue` TEXT NOT NULL,\n                    `issuer` TEXT NOT NULL,\n                    `coupon` TEXT NOT NULL,\n                    `primary_stats` TEXT NOT NULL,\n                    PRIMARY KEY(`ref`)\n                )\n            ");
    }
}
