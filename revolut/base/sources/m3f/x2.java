package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class x2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x2 f202517c = new x2();

    private x2() {
        super(52, 53);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DELETE FROM `portfolios`\nWHERE legacy = 1", "CREATE TABLE IF NOT EXISTS `portfolios_tmp` (\n`id` TEXT NOT NULL, \n`state` TEXT NOT NULL, \n`asset_types` TEXT NOT NULL, \n`balance` TEXT, \n`kyc` TEXT NOT NULL, \n`disclosures` TEXT NOT NULL, \n`info` TEXT NOT NULL, \n`onboardedDate` INTEGER, \n`offboardedDate` INTEGER, \nPRIMARY KEY(`id`))", "INSERT INTO `portfolios_tmp`\nSELECT `id`, `state`, `asset_types`, `balance`, `kyc`, `disclosures`, `info`, `onboardedDate`, `offboardedDate`\nFROM `portfolios`");
        supportSQLiteDatabase.execSQL("DROP TABLE `portfolios`");
        supportSQLiteDatabase.execSQL("ALTER TABLE `portfolios_tmp`\nRENAME TO `portfolios`");
    }
}
