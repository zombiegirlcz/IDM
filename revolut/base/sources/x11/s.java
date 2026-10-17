package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
public final class s extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f301996c = new s();

    private s() {
        super(116, LDSFile.EF_DG2_TAG);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "DROP TABLE instruments", " CREATE TABLE IF NOT EXISTS `instruments` (\n                `id` TEXT NOT NULL, \n                `name` TEXT NOT NULL, \n                `symbol` TEXT NOT NULL, \n                `stateDetails` TEXT NOT NULL, \n                `currency` TEXT NOT NULL, \n                `icon` TEXT NOT NULL, \n                `sortOrder` INTEGER NOT NULL, \n                `isin` TEXT NOT NULL, \n                `quantityDecimalPlaces` INTEGER NOT NULL, \n                `allSymbols` TEXT NOT NULL,\n                 PRIMARY KEY(`id`)\n                 )\n             ", "\n             CREATE UNIQUE INDEX IF NOT EXISTS `index_instruments_symbol` ON `instruments` (`symbol`)\n            ");
    }
}
