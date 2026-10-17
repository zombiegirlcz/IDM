package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f142530c = new b();

    private b() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `instrument_stats_new` (\n    `ref` TEXT NOT NULL,\n    `price` TEXT NOT NULL,\n    `volume` TEXT NOT NULL,\n    `marketCap` TEXT NOT NULL,\n    `perShare` TEXT NOT NULL,\n    `dividend` TEXT NOT NULL,\n    `valuation` TEXT NOT NULL,\n    `profitability` TEXT NOT NULL,\n    `managementEffectiveness` TEXT NOT NULL,\n    `listingData` TEXT,\n    PRIMARY KEY(`ref`)\n)", "INSERT INTO `instrument_stats_new` (\n    `ref`,\n    `price`,\n    `volume`,\n    `marketCap`,\n    `perShare`,\n    `dividend`,\n    `valuation`,\n    `profitability`,\n    `managementEffectiveness`\n)\nSELECT\n    `ref`,\n    `price`,\n    `volume`,\n    `marketCap`,\n    `perShare`,\n    `dividend`,\n    `valuation`,\n    `profitability`,\n    `managementEffectiveness`\nFROM `instrument_stats`", "DROP TABLE `instrument_stats`");
        supportSQLiteDatabase.execSQL("ALTER TABLE `instrument_stats_new` RENAME TO `instrument_stats`");
    }
}
