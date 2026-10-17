package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class y2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y2 f202523c = new y2();

    private y2() {
        super(53, 54);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `instruments_temp` (\n`id` TEXT NOT NULL, \n`ref` TEXT NOT NULL, \n`type` TEXT NOT NULL, \n`name` TEXT NOT NULL, \n`symbol` TEXT NOT NULL, \n`stateDetails` TEXT NOT NULL, \n`currency` TEXT NOT NULL, \n`sortOrder` INTEGER NOT NULL, \n`isin` TEXT, \n`exchange` TEXT NOT NULL, \n`shortOverview` TEXT, \n`quantityDecimalPlaces` INTEGER NOT NULL, \n`allSymbols` TEXT NOT NULL, \nPRIMARY KEY(`id`))", "INSERT INTO `instruments_temp`\nSELECT *\nFROM `instruments`", "DROP TABLE `instruments`");
        supportSQLiteDatabase.execSQL("ALTER TABLE `instruments_temp`\nRENAME TO `instruments`");
        supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_instruments_symbol` ON `instruments` (`symbol`)");
    }
}
