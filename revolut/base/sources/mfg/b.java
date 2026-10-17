package mfg;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.travel.miles.impl.database.TravelMilesDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelMilesDatabase_Impl f204997a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TravelMilesDatabase_Impl travelMilesDatabase_Impl) {
        super(14, "1c7067aa431f80ecf47937a136fd1335", "07370e0efaef809fe4bf53ed12d6b35c");
        this.f204997a = travelMilesDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_miles_provider` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `logoUrl` TEXT NOT NULL, `signupUrl` TEXT NOT NULL, `account` TEXT, `rate` TEXT, `unit` TEXT NOT NULL, `campaign` TEXT, `accountLinkType` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_miles_rates` (`accountId` TEXT NOT NULL, `currency` TEXT NOT NULL, `pointsToMilesRate` REAL NOT NULL, `fee` TEXT NOT NULL, `display` TEXT NOT NULL, PRIMARY KEY(`accountId`, `currency`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_miles_accounts` (`id` TEXT NOT NULL, `externalId` TEXT NOT NULL, `primaryAirlines` TEXT, `provider_id` TEXT NOT NULL, `provider_name` TEXT NOT NULL, `provider_logoUrl` TEXT NOT NULL, `provider_unit` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_miles_airlines` (`ref` TEXT NOT NULL, `name` TEXT NOT NULL, `programmeName` TEXT NOT NULL, `description` TEXT NOT NULL, `logoUrl` TEXT NOT NULL, `learnMoreUrl` TEXT NOT NULL, `suggested` INTEGER NOT NULL, `order` INTEGER NOT NULL, `redeemTypes` TEXT NOT NULL, `voucherProductGroupId` TEXT, `provider_id` TEXT NOT NULL, `provider_name` TEXT NOT NULL, `provider_description` TEXT NOT NULL, `provider_logoUrl` TEXT NOT NULL, `provider_signupUrl` TEXT NOT NULL, `provider_account` TEXT, `provider_rate` TEXT, `provider_unit` TEXT NOT NULL, `provider_campaign` TEXT, `provider_accountLinkType` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_miles_topup` (`id` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, `state` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_miles_transactions` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `idType` TEXT, `source` TEXT, `topUpId` TEXT NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`topUpId`) REFERENCES `travel_miles_topup`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_miles_airline_details` (`ref` TEXT NOT NULL, `name` TEXT NOT NULL, `programmeName` TEXT NOT NULL, `description` TEXT NOT NULL, `logoUrl` TEXT NOT NULL, `learnMoreUrl` TEXT NOT NULL, `websiteUrl` TEXT, `suggested` INTEGER NOT NULL, `backgroundUrl` TEXT NOT NULL, `redeemTypes` TEXT NOT NULL, `redeemOptions` TEXT NOT NULL, `extraRedeemOptions` TEXT NOT NULL, `voucherProductGroupId` TEXT, `provider_id` TEXT NOT NULL, `provider_name` TEXT NOT NULL, `provider_description` TEXT NOT NULL, `provider_logoUrl` TEXT NOT NULL, `provider_signupUrl` TEXT NOT NULL, `provider_account` TEXT, `provider_rate` TEXT, `provider_unit` TEXT NOT NULL, `provider_campaign` TEXT, `provider_accountLinkType` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1c7067aa431f80ecf47937a136fd1335')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_miles_provider`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_miles_rates`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_miles_accounts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_miles_airlines`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_miles_topup`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_miles_transactions`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_miles_airline_details`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = TravelMilesDatabase_Impl.f94162m;
        this.f204997a.internalInitInvalidationTracker(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPostMigrate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPreMigrate(SQLiteConnection sQLiteConnection) {
        DBUtil.dropFtsSyncTriggers(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
        HashMap map = new HashMap(10);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map.put("logoUrl", new TableInfo.Column("logoUrl", "TEXT", true, 0, null, 1));
        map.put("signupUrl", new TableInfo.Column("signupUrl", "TEXT", true, 0, null, 1));
        map.put("account", new TableInfo.Column("account", "TEXT", false, 0, null, 1));
        map.put("rate", new TableInfo.Column("rate", "TEXT", false, 0, null, 1));
        map.put("unit", new TableInfo.Column("unit", "TEXT", true, 0, null, 1));
        map.put("campaign", new TableInfo.Column("campaign", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("travel_miles_provider", map, o.s(map, "accountLinkType", new TableInfo.Column("accountLinkType", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "travel_miles_provider");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_miles_provider(com.revolut.feature.travel.miles.impl.database.model.TravelMilesProviderEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(5);
        map2.put("accountId", new TableInfo.Column("accountId", "TEXT", true, 1, null, 1));
        map2.put("currency", new TableInfo.Column("currency", "TEXT", true, 2, null, 1));
        map2.put("pointsToMilesRate", new TableInfo.Column("pointsToMilesRate", "REAL", true, 0, null, 1));
        map2.put("fee", new TableInfo.Column("fee", "TEXT", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("travel_miles_rates", map2, o.s(map2, "display", new TableInfo.Column("display", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "travel_miles_rates");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_miles_rates(com.revolut.feature.travel.miles.impl.database.model.TravelMilesRateEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(7);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map3.put("externalId", new TableInfo.Column("externalId", "TEXT", true, 0, null, 1));
        map3.put("primaryAirlines", new TableInfo.Column("primaryAirlines", "TEXT", false, 0, null, 1));
        map3.put("provider_id", new TableInfo.Column("provider_id", "TEXT", true, 0, null, 1));
        map3.put("provider_name", new TableInfo.Column("provider_name", "TEXT", true, 0, null, 1));
        map3.put("provider_logoUrl", new TableInfo.Column("provider_logoUrl", "TEXT", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("travel_miles_accounts", map3, o.s(map3, "provider_unit", new TableInfo.Column("provider_unit", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "travel_miles_accounts");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_miles_accounts(com.revolut.feature.travel.miles.impl.database.model.TravelMilesAccountV2Entity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(20);
        map4.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map4.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map4.put("programmeName", new TableInfo.Column("programmeName", "TEXT", true, 0, null, 1));
        map4.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map4.put("logoUrl", new TableInfo.Column("logoUrl", "TEXT", true, 0, null, 1));
        map4.put("learnMoreUrl", new TableInfo.Column("learnMoreUrl", "TEXT", true, 0, null, 1));
        map4.put("suggested", new TableInfo.Column("suggested", "INTEGER", true, 0, null, 1));
        map4.put("order", new TableInfo.Column("order", "INTEGER", true, 0, null, 1));
        map4.put("redeemTypes", new TableInfo.Column("redeemTypes", "TEXT", true, 0, null, 1));
        map4.put("voucherProductGroupId", new TableInfo.Column("voucherProductGroupId", "TEXT", false, 0, null, 1));
        map4.put("provider_id", new TableInfo.Column("provider_id", "TEXT", true, 0, null, 1));
        map4.put("provider_name", new TableInfo.Column("provider_name", "TEXT", true, 0, null, 1));
        map4.put("provider_description", new TableInfo.Column("provider_description", "TEXT", true, 0, null, 1));
        map4.put("provider_logoUrl", new TableInfo.Column("provider_logoUrl", "TEXT", true, 0, null, 1));
        map4.put("provider_signupUrl", new TableInfo.Column("provider_signupUrl", "TEXT", true, 0, null, 1));
        map4.put("provider_account", new TableInfo.Column("provider_account", "TEXT", false, 0, null, 1));
        map4.put("provider_rate", new TableInfo.Column("provider_rate", "TEXT", false, 0, null, 1));
        map4.put("provider_unit", new TableInfo.Column("provider_unit", "TEXT", true, 0, null, 1));
        map4.put("provider_campaign", new TableInfo.Column("provider_campaign", "TEXT", false, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("travel_miles_airlines", map4, o.s(map4, "provider_accountLinkType", new TableInfo.Column("provider_accountLinkType", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "travel_miles_airlines");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_miles_airlines(com.revolut.feature.travel.miles.impl.database.model.TravelMilesAirlineEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(4);
        map5.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map5.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map5.put("updatedDate", new TableInfo.Column("updatedDate", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("travel_miles_topup", map5, o.s(map5, "state", new TableInfo.Column("state", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "travel_miles_topup");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_miles_topup(com.revolut.feature.travel.miles.impl.database.model.TravelMilesTopUpEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(5);
        map6.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map6.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map6.put("idType", new TableInfo.Column("idType", "TEXT", false, 0, null, 1));
        map6.put("source", new TableInfo.Column("source", "TEXT", false, 0, null, 1));
        HashSet hashSetS = o.s(map6, "topUpId", new TableInfo.Column("topUpId", "TEXT", true, 0, null, 1), 1);
        TableInfo tableInfo11 = new TableInfo("travel_miles_transactions", map6, hashSetS, r6.b.l(hashSetS, new TableInfo.ForeignKey("travel_miles_topup", "CASCADE", "NO ACTION", Arrays.asList("topUpId"), Arrays.asList("id")), 0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "travel_miles_transactions");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_miles_transactions(com.revolut.feature.travel.miles.impl.database.model.TravelMilesTransactionEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(23);
        map7.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map7.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map7.put("programmeName", new TableInfo.Column("programmeName", "TEXT", true, 0, null, 1));
        map7.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map7.put("logoUrl", new TableInfo.Column("logoUrl", "TEXT", true, 0, null, 1));
        map7.put("learnMoreUrl", new TableInfo.Column("learnMoreUrl", "TEXT", true, 0, null, 1));
        map7.put("websiteUrl", new TableInfo.Column("websiteUrl", "TEXT", false, 0, null, 1));
        map7.put("suggested", new TableInfo.Column("suggested", "INTEGER", true, 0, null, 1));
        map7.put("backgroundUrl", new TableInfo.Column("backgroundUrl", "TEXT", true, 0, null, 1));
        map7.put("redeemTypes", new TableInfo.Column("redeemTypes", "TEXT", true, 0, null, 1));
        map7.put("redeemOptions", new TableInfo.Column("redeemOptions", "TEXT", true, 0, null, 1));
        map7.put("extraRedeemOptions", new TableInfo.Column("extraRedeemOptions", "TEXT", true, 0, null, 1));
        map7.put("voucherProductGroupId", new TableInfo.Column("voucherProductGroupId", "TEXT", false, 0, null, 1));
        map7.put("provider_id", new TableInfo.Column("provider_id", "TEXT", true, 0, null, 1));
        map7.put("provider_name", new TableInfo.Column("provider_name", "TEXT", true, 0, null, 1));
        map7.put("provider_description", new TableInfo.Column("provider_description", "TEXT", true, 0, null, 1));
        map7.put("provider_logoUrl", new TableInfo.Column("provider_logoUrl", "TEXT", true, 0, null, 1));
        map7.put("provider_signupUrl", new TableInfo.Column("provider_signupUrl", "TEXT", true, 0, null, 1));
        map7.put("provider_account", new TableInfo.Column("provider_account", "TEXT", false, 0, null, 1));
        map7.put("provider_rate", new TableInfo.Column("provider_rate", "TEXT", false, 0, null, 1));
        map7.put("provider_unit", new TableInfo.Column("provider_unit", "TEXT", true, 0, null, 1));
        map7.put("provider_campaign", new TableInfo.Column("provider_campaign", "TEXT", false, 0, null, 1));
        TableInfo tableInfo13 = new TableInfo("travel_miles_airline_details", map7, o.s(map7, "provider_accountLinkType", new TableInfo.Column("provider_accountLinkType", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "travel_miles_airline_details");
        return !tableInfo13.equals(tableInfo14) ? new RoomOpenDelegate.ValidationResult(false, o.o("travel_miles_airline_details(com.revolut.feature.travel.miles.impl.database.model.TravelMilesAirlineDetailsEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
