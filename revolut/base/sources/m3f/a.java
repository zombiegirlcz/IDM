package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f202376c = new a();

    private a() {
        super(100, 101);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER TABLE instruments RENAME TO temp_instruments", "CREATE TABLE IF NOT EXISTS `instruments` (\n    `id` TEXT NOT NULL,\n    `ref` TEXT NOT NULL,\n    `type` TEXT NOT NULL,\n    `name` TEXT NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `stateDetails` TEXT NOT NULL,\n    `requiredProducts` TEXT,\n    `typeSpecificProperties` TEXT,\n    `currency` TEXT NOT NULL,\n    `sortOrder` INTEGER,\n    `isin` TEXT,\n    `exchange` TEXT NOT NULL,\n    `shortOverview` TEXT,\n    `quantityDecimalPlaces` INTEGER NOT NULL,\n    `allSymbols` TEXT NOT NULL,\n    `underlying_currency` TEXT,\n    `promotion_campaigns` TEXT,\n    PRIMARY KEY(`id`)\n)", "INSERT INTO instruments (id, ref, type, name, symbol, stateDetails, requiredProducts, typeSpecificProperties, currency, sortOrder, isin, exchange, shortOverview, quantityDecimalPlaces, allSymbols, underlying_currency, promotion_campaigns)\nSELECT id, ref, type, name, symbol, stateDetails, requiredProducts, typeSpecificProperties, currency, sortOrder, isin, exchange, shortOverview, quantityDecimalPlaces, allSymbols, underlying_currency, promotion_campaigns FROM temp_instruments");
        supportSQLiteDatabase.execSQL("DROP TABLE temp_instruments");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_instruments_symbol` ON `instruments` (`symbol`)");
    }
}
