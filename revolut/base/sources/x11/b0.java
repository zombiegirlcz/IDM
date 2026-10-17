package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f301792c = new b0();

    private b0() {
        super(123, 124);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "\n            CREATE TABLE IF NOT EXISTS `instruments_tmp`(\n                `id` TEXT NOT NULL, \n                `name` TEXT NOT NULL, \n                `symbol` TEXT NOT NULL, \n                `stateDetails` TEXT NOT NULL, \n                `currency` TEXT NOT NULL, \n                `sortOrder` INTEGER NOT NULL, \n                `isin` TEXT NOT NULL, \n                `quantityDecimalPlaces` INTEGER NOT NULL, \n                `allSymbols` TEXT NOT NULL, PRIMARY KEY(`id`)\n            )\n        ", "\n            INSERT INTO `instruments_tmp` \n                    (id, name, symbol, stateDetails, currency, sortOrder, isin, quantityDecimalPlaces, allSymbols)\n                SELECT \n                    id, name, symbol, stateDetails, currency, sortOrder, isin, quantityDecimalPlaces, allSymbols\n                FROM `instruments`\n        ", "DROP TABLE instruments");
        supportSQLiteDatabase.execSQL("ALTER TABLE instruments_tmp RENAME TO instruments");
        supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_instruments_symbol` ON `instruments` (`symbol`)");
    }
}
