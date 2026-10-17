package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s0 f202485c = new s0();

    private s0() {
        super(140, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `etf_details_new` (\n    `ref` TEXT NOT NULL, \n    `symbol` TEXT NOT NULL, \n    `description` TEXT, \n    `stockExchangeCode` TEXT NOT NULL, \n    `stats` TEXT, \n    `exposure` TEXT, \n    `prospectusUrl` TEXT, \n    `kidUrl` TEXT, \n    `stateReason` TEXT, \n    `delistDate` INTEGER, \n    `tags` TEXT, \n    PRIMARY KEY(`ref`)\n)", "CREATE TABLE IF NOT EXISTS `instrument_details_new` (\n    `ref` TEXT NOT NULL, \n    `symbol` TEXT NOT NULL, \n    `description` TEXT, \n    `stockExchangeCode` TEXT NOT NULL, \n    `stats` TEXT, \n    `sector` TEXT NOT NULL, \n    `type` TEXT NOT NULL, \n    `analystsSummary` TEXT, \n    `stateReason` TEXT, \n    `delistDate` INTEGER, \n    `tags` TEXT, \n    PRIMARY KEY(`ref`)\n)", "INSERT INTO etf_details_new (`ref`, `symbol`, `description`, `stockExchangeCode`, `stats`, `exposure`, `prospectusUrl`, `kidUrl`, `stateReason`, `delistDate`, `tags`)\nSELECT `ref`, `symbol`, `description`, `stockExchangeCode`, `stats`, `exposure`, `prospectusUrl`, `kidUrl`, `stateReason`, `delistDate`, `tags`\nFROM `etf_details`");
        prk.o.D(supportSQLiteDatabase, "INSERT INTO instrument_details_new (`ref`, `symbol`, `description`, `stockExchangeCode`, `stats`, `sector`, `type`, `analystsSummary`, `stateReason`, `delistDate`, `tags`)\nSELECT `ref`, `symbol`, `description`, `stockExchangeCode`, `stats`, `sector`, `type`, `analystsSummary`, `stateReason`, `delistDate`, `tags`\nFROM `instrument_details`", "DROP TABLE `etf_details`", "DROP TABLE `instrument_details`", "ALTER TABLE `etf_details_new` RENAME TO `etf_details`");
        supportSQLiteDatabase.execSQL("ALTER TABLE `instrument_details_new` RENAME TO `instrument_details`");
    }
}
