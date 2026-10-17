package pfg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f235590c = new m();

    private m() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "DROP TABLE `travel_miles_airlines`", "CREATE TABLE IF NOT EXISTS `travel_miles_airlines` (\n    `ref` TEXT NOT NULL, \n    `name` TEXT NOT NULL, \n    `programmeName` TEXT NOT NULL, \n    `description` TEXT NOT NULL, \n    `logoUrl` TEXT NOT NULL, \n    `learnMoreUrl` TEXT NOT NULL, \n    `suggested` INTEGER NOT NULL, \n    `order` INTEGER NOT NULL, \n    `redeemTypes` TEXT NOT NULL DEFAULT '[]',\n    `voucherProductGroupId` TEXT,\n    `provider_id` TEXT NOT NULL, \n    `provider_name` TEXT NOT NULL, \n    `provider_description` TEXT NOT NULL, \n    `provider_logoUrl` TEXT NOT NULL, \n    `provider_signupUrl` TEXT NOT NULL,  \n    `provider_account` TEXT, \n    `provider_rate` TEXT, \n    `provider_unit` TEXT NOT NULL,\n    PRIMARY KEY(`ref`)\n)", "DROP TABLE `travel_miles_airline_details`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `travel_miles_airline_details` (\n    `ref` TEXT NOT NULL, \n    `name` TEXT NOT NULL, \n    `programmeName` TEXT NOT NULL, \n    `description` TEXT NOT NULL, \n    `logoUrl` TEXT NOT NULL, \n    `learnMoreUrl` TEXT NOT NULL,\n    `websiteUrl` TEXT,\n    `suggested` INTEGER NOT NULL, \n    `backgroundUrl` TEXT NOT NULL, \n    `redeemTypes` TEXT NOT NULL DEFAULT '[]',\n    `redeemOptions` TEXT NOT NULL, \n    `extraRedeemOptions` TEXT NOT NULL,\n    `voucherProductGroupId` TEXT,\n    `provider_id` TEXT NOT NULL, \n    `provider_name` TEXT NOT NULL, \n    `provider_description` TEXT NOT NULL, \n    `provider_logoUrl` TEXT NOT NULL, \n    `provider_signupUrl` TEXT NOT NULL,  \n    `provider_account` TEXT, \n    `provider_rate` TEXT,\n    `provider_unit` TEXT NOT NULL, \n    PRIMARY KEY(`ref`)\n)");
    }
}
