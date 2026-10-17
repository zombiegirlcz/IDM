package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class v3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v3 f202506c = new v3();

    private v3() {
        super(74, 75);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS\n`portfolios_temp` (\n    `id` TEXT NOT NULL,\n    `state` TEXT NOT NULL,\n    `asset_types` TEXT NOT NULL,\n    `balance` TEXT,`kyc` TEXT NOT NULL,\n    `disclosures` TEXT NOT NULL,\n    `info` TEXT NOT NULL,\n    `onboardedDate` INTEGER,\n    `offboardedDate` INTEGER,\n    PRIMARY KEY(`id`)\n)", "INSERT INTO `portfolios_temp` (\n`id`, `state`, `asset_types`, `balance`, `kyc`, `disclosures`, `info`, `onboardedDate`, `offboardedDate`)\nSELECT\n`id`, `state`, `asset_types`, `balance`, `kyc`, `disclosures`, `info`, `onboardedDate`, `offboardedDate`\nFROM `portfolios`", "DROP TABLE `portfolios`");
        supportSQLiteDatabase.execSQL("ALTER TABLE `portfolios_temp` RENAME TO `portfolios`");
    }
}
