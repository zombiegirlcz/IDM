package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f202400c = new e();

    private e() {
        super(104, 105);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER TABLE instruments RENAME TO temp_instruments", "CREATE TABLE IF NOT EXISTS `instruments` (\n    `id` TEXT NOT NULL,\n    `ref` TEXT NOT NULL,\n    `type` TEXT NOT NULL,\n    `name` TEXT NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `stateDetails` TEXT NOT NULL,\n    `requiredProducts` TEXT,\n    `currency` TEXT NOT NULL,\n    `sortOrder` INTEGER,\n    `isin` TEXT,\n    `exchange` TEXT NOT NULL,\n    `shortOverview` TEXT,\n    `quantityDecimalPlaces` INTEGER NOT NULL,\n    `allSymbols` TEXT NOT NULL,\n    `underlying_currency` TEXT,\n    `promotion_campaigns` TEXT,\n    PRIMARY KEY(`id`)\n)", "INSERT INTO instruments (\n    id,\n    ref,\n    type,\n    name,\n    symbol,\n    stateDetails,\n    requiredProducts,\n    currency,\n    sortOrder,\n    isin,\n    exchange,\n    shortOverview,\n    quantityDecimalPlaces,\n    allSymbols,\n    underlying_currency,\n    promotion_campaigns\n)\nSELECT id, ref, type, name, symbol, stateDetails, requiredProducts, currency, sortOrder, isin, exchange, shortOverview, quantityDecimalPlaces, allSymbols, underlying_currency, promotion_campaigns\nFROM temp_instruments");
        prk.o.C(supportSQLiteDatabase, "DROP INDEX IF EXISTS `index_instruments_symbol`", "DROP TABLE temp_instruments", "CREATE INDEX IF NOT EXISTS `index_instruments_symbol` ON `instruments` (`symbol`)");
    }
}
