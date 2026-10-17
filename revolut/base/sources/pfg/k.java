package pfg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f235588c = new k();

    private k() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "DROP TABLE `travel_miles_provider`", "CREATE TABLE IF NOT EXISTS `travel_miles_provider` (\n    `id` TEXT NOT NULL, \n    `name` TEXT NOT NULL, \n    `description` TEXT NOT NULL, \n    `logoUrl` TEXT NOT NULL, \n    `signupUrl` TEXT NOT NULL,\n    `partner` TEXT NOT NULL, \n    `account` TEXT, \n    `rate` TEXT, \n    `unit` TEXT NOT NULL, \n    PRIMARY KEY(`id`)\n)", "DROP TABLE `travel_miles_accounts`");
        o.D(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `travel_miles_accounts` (\n    `id` TEXT NOT NULL, \n    `externalId` TEXT NOT NULL, \n    `provider_id` TEXT NOT NULL, \n    `provider_name` TEXT NOT NULL, \n    `provider_logoUrl` TEXT NOT NULL,\n    `provider_unit` TEXT NOT NULL,\n    PRIMARY KEY(`id`)\n)", "DROP TABLE `travel_miles_airlines`", "CREATE TABLE IF NOT EXISTS `travel_miles_airlines` (\n    `ref` TEXT NOT NULL, \n    `name` TEXT NOT NULL, \n    `programmeName` TEXT NOT NULL, \n    `description` TEXT NOT NULL, \n    `logoUrl` TEXT NOT NULL, \n    `learnMoreUrl` TEXT NOT NULL, \n    `suggested` INTEGER NOT NULL, \n    `order` INTEGER NOT NULL, \n    `provider_id` TEXT NOT NULL, \n    `provider_name` TEXT NOT NULL, \n    `provider_description` TEXT NOT NULL, \n    `provider_logoUrl` TEXT NOT NULL, \n    `provider_signupUrl` TEXT NOT NULL, \n    `provider_partner` TEXT NOT NULL, \n    `provider_account` TEXT, \n    `provider_rate` TEXT, \n    `provider_unit` TEXT NOT NULL,\n    PRIMARY KEY(`ref`)\n)", "DROP TABLE `travel_miles_airline_details`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `travel_miles_airline_details` (\n    `ref` TEXT NOT NULL, \n    `name` TEXT NOT NULL, \n    `programmeName` TEXT NOT NULL, \n    `description` TEXT NOT NULL, \n    `logoUrl` TEXT NOT NULL, \n    `learnMoreUrl` TEXT NOT NULL, \n    `suggested` INTEGER NOT NULL, \n    `backgroundUrl` TEXT NOT NULL, \n    `redeemOptions` TEXT NOT NULL, \n    `extraRedeemOptions` TEXT NOT NULL, \n    `provider_id` TEXT NOT NULL, \n    `provider_name` TEXT NOT NULL, \n    `provider_description` TEXT NOT NULL, \n    `provider_logoUrl` TEXT NOT NULL, \n    `provider_signupUrl` TEXT NOT NULL, \n    `provider_partner` TEXT NOT NULL, \n    `provider_account` TEXT, \n    `provider_rate` TEXT,\n    `provider_unit` TEXT NOT NULL, \n    PRIMARY KEY(`ref`)\n)");
    }
}
