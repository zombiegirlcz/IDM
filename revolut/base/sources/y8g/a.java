package y8g;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;
import r6.b;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsDatabase_Impl f311656a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TravelHotelsDatabase_Impl travelHotelsDatabase_Impl) {
        super(34, "540aef27fd56d4dc383a25f1d1a30e35", "d480639be736642c8d99fdf5afd60b1b");
        this.f311656a = travelHotelsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hotels_location` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `imageUrl` TEXT, `country` TEXT NOT NULL, `propertyCount` INTEGER, `coordinates` TEXT NOT NULL, `isDistrict` INTEGER NOT NULL, `isPopular` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hotels_booking_details` (`id` TEXT NOT NULL, `status` TEXT NOT NULL, `bookingReference` TEXT NOT NULL, `traveller` TEXT NOT NULL, `dates` TEXT NOT NULL, `property` TEXT NOT NULL, `pricing` TEXT NOT NULL, `checkInInstruction` TEXT, `rooms` TEXT NOT NULL, `payment` TEXT NOT NULL, `cashback` TEXT, `createdDate` TEXT, `transactions` TEXT, `hardAmendmentEligibility` TEXT, `amendment` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hotels_recent_location_searches` (`id` INTEGER NOT NULL, `searchTimestamp` INTEGER NOT NULL, `type` TEXT NOT NULL, `checkIn` INTEGER NOT NULL, `checkOut` INTEGER NOT NULL, `roomsOccupancy` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hotels_recent_property_searches` (`id` TEXT NOT NULL, `searchTimestamp` INTEGER NOT NULL, `name` TEXT NOT NULL, `propertyType` TEXT NOT NULL, `location` TEXT NOT NULL, `checkIn` INTEGER NOT NULL, `checkOut` INTEGER NOT NULL, `roomsOccupancy` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hotels_recent_smart_searches` (`prompt` TEXT NOT NULL, `searchTimestamp` INTEGER NOT NULL, PRIMARY KEY(`prompt`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hotels_campaign` (`id` TEXT NOT NULL, `image` TEXT NOT NULL, `startDate` TEXT NOT NULL, `endDate` TEXT NOT NULL, `name` TEXT NOT NULL, `discount` TEXT NOT NULL, `rank` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hotels_dropoff` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `sessionId` TEXT NOT NULL, `name` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `locationId` TEXT, `locationType` TEXT, `propertyId` TEXT, `roomsInformation` TEXT, `searchParameters` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hotels_property_type_category` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `image` TEXT NOT NULL, `displayOrderRank` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hotels_inventory_provider` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `logos` TEXT, `address` TEXT NOT NULL, `email` TEXT, `phone` TEXT, `termsAndConditionsUrl` TEXT, `disclaimers` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hotels_experiences` (`id` TEXT NOT NULL, `bookingId` TEXT NOT NULL, `name` TEXT NOT NULL, `images` TEXT NOT NULL, `startingPrice` TEXT NOT NULL, `description` TEXT NOT NULL, `cancellationPolicy` TEXT NOT NULL, `currency` TEXT NOT NULL, `destination_id` TEXT NOT NULL, `destination_name` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hotels_promotions` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `start` TEXT NOT NULL, `end` TEXT NOT NULL, `maxDiscountPercentage` REAL NOT NULL, `locationId` TEXT NOT NULL, `isThirdPartyPromoEnabled` INTEGER NOT NULL, `requirements_checkInFrom` TEXT, `requirements_checkOutTo` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`locationId`) REFERENCES `hotels_location`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '540aef27fd56d4dc383a25f1d1a30e35')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hotels_location`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hotels_booking_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hotels_recent_location_searches`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hotels_recent_property_searches`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hotels_recent_smart_searches`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hotels_campaign`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hotels_dropoff`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hotels_property_type_category`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hotels_inventory_provider`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hotels_experiences`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hotels_promotions`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = TravelHotelsDatabase_Impl.f93636t;
        this.f311656a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, 1));
        map.put("country", new TableInfo.Column("country", "TEXT", true, 0, null, 1));
        map.put("propertyCount", new TableInfo.Column("propertyCount", "INTEGER", false, 0, null, 1));
        map.put("coordinates", new TableInfo.Column("coordinates", "TEXT", true, 0, null, 1));
        map.put("isDistrict", new TableInfo.Column("isDistrict", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("hotels_location", map, o.s(map, "isPopular", new TableInfo.Column("isPopular", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "hotels_location");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("hotels_location(com.revolut.feature.travel.hotels.impl.database.entity.HotelsLocationEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(15);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
        map2.put("bookingReference", new TableInfo.Column("bookingReference", "TEXT", true, 0, null, 1));
        map2.put("traveller", new TableInfo.Column("traveller", "TEXT", true, 0, null, 1));
        map2.put("dates", new TableInfo.Column("dates", "TEXT", true, 0, null, 1));
        map2.put("property", new TableInfo.Column("property", "TEXT", true, 0, null, 1));
        map2.put("pricing", new TableInfo.Column("pricing", "TEXT", true, 0, null, 1));
        map2.put("checkInInstruction", new TableInfo.Column("checkInInstruction", "TEXT", false, 0, null, 1));
        map2.put("rooms", new TableInfo.Column("rooms", "TEXT", true, 0, null, 1));
        map2.put("payment", new TableInfo.Column("payment", "TEXT", true, 0, null, 1));
        map2.put("cashback", new TableInfo.Column("cashback", "TEXT", false, 0, null, 1));
        map2.put("createdDate", new TableInfo.Column("createdDate", "TEXT", false, 0, null, 1));
        map2.put("transactions", new TableInfo.Column("transactions", "TEXT", false, 0, null, 1));
        map2.put("hardAmendmentEligibility", new TableInfo.Column("hardAmendmentEligibility", "TEXT", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("hotels_booking_details", map2, o.s(map2, "amendment", new TableInfo.Column("amendment", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "hotels_booking_details");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("hotels_booking_details(com.revolut.feature.travel.hotels.impl.database.entity.HotelsPropertyBookingDetailsEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(6);
        map3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
        map3.put("searchTimestamp", new TableInfo.Column("searchTimestamp", "INTEGER", true, 0, null, 1));
        map3.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map3.put("checkIn", new TableInfo.Column("checkIn", "INTEGER", true, 0, null, 1));
        map3.put("checkOut", new TableInfo.Column("checkOut", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("hotels_recent_location_searches", map3, o.s(map3, "roomsOccupancy", new TableInfo.Column("roomsOccupancy", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "hotels_recent_location_searches");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("hotels_recent_location_searches(com.revolut.feature.travel.hotels.impl.database.entity.HotelsRecentLocationSearchEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(8);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map4.put("searchTimestamp", new TableInfo.Column("searchTimestamp", "INTEGER", true, 0, null, 1));
        map4.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map4.put("propertyType", new TableInfo.Column("propertyType", "TEXT", true, 0, null, 1));
        map4.put("location", new TableInfo.Column("location", "TEXT", true, 0, null, 1));
        map4.put("checkIn", new TableInfo.Column("checkIn", "INTEGER", true, 0, null, 1));
        map4.put("checkOut", new TableInfo.Column("checkOut", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("hotels_recent_property_searches", map4, o.s(map4, "roomsOccupancy", new TableInfo.Column("roomsOccupancy", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "hotels_recent_property_searches");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("hotels_recent_property_searches(com.revolut.feature.travel.hotels.impl.database.entity.HotelsRecentPropertySearchEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(2);
        map5.put("prompt", new TableInfo.Column("prompt", "TEXT", true, 1, null, 1));
        TableInfo tableInfo9 = new TableInfo("hotels_recent_smart_searches", map5, o.s(map5, "searchTimestamp", new TableInfo.Column("searchTimestamp", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "hotels_recent_smart_searches");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("hotels_recent_smart_searches(com.revolut.feature.travel.hotels.impl.database.entity.HotelsRecentSmartSearchEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(7);
        map6.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map6.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, 1));
        map6.put("startDate", new TableInfo.Column("startDate", "TEXT", true, 0, null, 1));
        map6.put("endDate", new TableInfo.Column("endDate", "TEXT", true, 0, null, 1));
        map6.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map6.put("discount", new TableInfo.Column("discount", "TEXT", true, 0, null, 1));
        TableInfo tableInfo11 = new TableInfo("hotels_campaign", map6, o.s(map6, "rank", new TableInfo.Column("rank", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "hotels_campaign");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("hotels_campaign(com.revolut.feature.travel.hotels.impl.database.entity.HotelsCampaignEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(10);
        map7.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map7.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map7.put("sessionId", new TableInfo.Column("sessionId", "TEXT", true, 0, null, 1));
        map7.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map7.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", true, 0, null, 1));
        map7.put("locationId", new TableInfo.Column("locationId", "TEXT", false, 0, null, 1));
        map7.put("locationType", new TableInfo.Column("locationType", "TEXT", false, 0, null, 1));
        map7.put("propertyId", new TableInfo.Column("propertyId", "TEXT", false, 0, null, 1));
        map7.put("roomsInformation", new TableInfo.Column("roomsInformation", "TEXT", false, 0, null, 1));
        TableInfo tableInfo13 = new TableInfo("hotels_dropoff", map7, o.s(map7, "searchParameters", new TableInfo.Column("searchParameters", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "hotels_dropoff");
        if (!tableInfo13.equals(tableInfo14)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("hotels_dropoff(com.revolut.feature.travel.hotels.impl.database.entity.HotelsDropoffEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14));
        }
        HashMap map8 = new HashMap(5);
        map8.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map8.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map8.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map8.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, 1));
        TableInfo tableInfo15 = new TableInfo("hotels_property_type_category", map8, o.s(map8, "displayOrderRank", new TableInfo.Column("displayOrderRank", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo16 = TableInfo.read(sQLiteConnection, "hotels_property_type_category");
        if (!tableInfo15.equals(tableInfo16)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("hotels_property_type_category(com.revolut.feature.travel.hotels.impl.database.entity.HotelsPropertyTypeCategoryEntity).\n Expected:\n", tableInfo15, "\n Found:\n", tableInfo16));
        }
        HashMap map9 = new HashMap(8);
        map9.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map9.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map9.put("logos", new TableInfo.Column("logos", "TEXT", false, 0, null, 1));
        map9.put("address", new TableInfo.Column("address", "TEXT", true, 0, null, 1));
        map9.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, 1));
        map9.put("phone", new TableInfo.Column("phone", "TEXT", false, 0, null, 1));
        map9.put("termsAndConditionsUrl", new TableInfo.Column("termsAndConditionsUrl", "TEXT", false, 0, null, 1));
        TableInfo tableInfo17 = new TableInfo("hotels_inventory_provider", map9, o.s(map9, "disclaimers", new TableInfo.Column("disclaimers", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo18 = TableInfo.read(sQLiteConnection, "hotels_inventory_provider");
        if (!tableInfo17.equals(tableInfo18)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("hotels_inventory_provider(com.revolut.feature.travel.hotels.impl.database.entity.HotelsInventoryProviderEntity).\n Expected:\n", tableInfo17, "\n Found:\n", tableInfo18));
        }
        HashMap map10 = new HashMap(10);
        map10.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map10.put("bookingId", new TableInfo.Column("bookingId", "TEXT", true, 0, null, 1));
        map10.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map10.put("images", new TableInfo.Column("images", "TEXT", true, 0, null, 1));
        map10.put("startingPrice", new TableInfo.Column("startingPrice", "TEXT", true, 0, null, 1));
        map10.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map10.put("cancellationPolicy", new TableInfo.Column("cancellationPolicy", "TEXT", true, 0, null, 1));
        map10.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map10.put("destination_id", new TableInfo.Column("destination_id", "TEXT", true, 0, null, 1));
        TableInfo tableInfo19 = new TableInfo("hotels_experiences", map10, o.s(map10, "destination_name", new TableInfo.Column("destination_name", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo20 = TableInfo.read(sQLiteConnection, "hotels_experiences");
        if (!tableInfo19.equals(tableInfo20)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("hotels_experiences(com.revolut.feature.travel.hotels.impl.database.entity.HotelsExperienceEntity).\n Expected:\n", tableInfo19, "\n Found:\n", tableInfo20));
        }
        HashMap map11 = new HashMap(9);
        map11.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map11.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map11.put("start", new TableInfo.Column("start", "TEXT", true, 0, null, 1));
        map11.put("end", new TableInfo.Column("end", "TEXT", true, 0, null, 1));
        map11.put("maxDiscountPercentage", new TableInfo.Column("maxDiscountPercentage", "REAL", true, 0, null, 1));
        map11.put("locationId", new TableInfo.Column("locationId", "TEXT", true, 0, null, 1));
        map11.put("isThirdPartyPromoEnabled", new TableInfo.Column("isThirdPartyPromoEnabled", "INTEGER", true, 0, null, 1));
        map11.put("requirements_checkInFrom", new TableInfo.Column("requirements_checkInFrom", "TEXT", false, 0, null, 1));
        HashSet hashSetS = o.s(map11, "requirements_checkOutTo", new TableInfo.Column("requirements_checkOutTo", "TEXT", false, 0, null, 1), 1);
        TableInfo tableInfo21 = new TableInfo("hotels_promotions", map11, hashSetS, b.l(hashSetS, new TableInfo.ForeignKey("hotels_location", "CASCADE", "NO ACTION", Arrays.asList("locationId"), Arrays.asList("id")), 0));
        TableInfo tableInfo22 = TableInfo.read(sQLiteConnection, "hotels_promotions");
        return !tableInfo21.equals(tableInfo22) ? new RoomOpenDelegate.ValidationResult(false, o.o("hotels_promotions(com.revolut.feature.travel.hotels.impl.database.entity.HotelsPromotionEntity).\n Expected:\n", tableInfo21, "\n Found:\n", tableInfo22)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
