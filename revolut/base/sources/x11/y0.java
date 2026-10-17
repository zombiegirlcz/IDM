package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y0 f302062c = new y0();

    private y0() {
        super(142, 143);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL(kotlin.text.d0.F0("\n                CREATE TABLE IF NOT EXISTS `candles_cryptocommodities_chart` \n                (\n                    `graph_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                    `symbol` TEXT NOT NULL, `duration` TEXT NOT NULL,\n                    `from` INTEGER NOT NULL,\n                    `to` INTEGER NOT NULL\n                )\n        ").toString());
        database.execSQL(kotlin.text.d0.F0("CREATE UNIQUE INDEX IF NOT EXISTS \n`index_candles_cryptocommodities_chart_symbol_duration` \nON `candles_cryptocommodities_chart` (`symbol`, `duration`)").toString());
        database.execSQL(kotlin.text.d0.F0("CREATE TABLE IF NOT EXISTS `candles_cryptocommodities_point`\n(\n    `timestamp` INTEGER NOT NULL,\n    `open` TEXT NOT NULL,\n    `close` TEXT NOT NULL,\n    `high` TEXT NOT NULL,\n    `low` TEXT NOT NULL,\n    `graph_id` INTEGER NOT NULL,\n    PRIMARY KEY(`timestamp`),\n    FOREIGN KEY(`graph_id`) REFERENCES `candles_cryptocommodities_chart`(`graph_id`) ON UPDATE NO ACTION ON DELETE CASCADE \n)").toString());
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
