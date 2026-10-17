package uxf;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.travel.common.impl.database.TravelDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;
import r6.b;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelDatabase_Impl f284002a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TravelDatabase_Impl travelDatabase_Impl) {
        super(5, "05a3372ae1cfed69d195f9ac4f50069b", "8ba9a5d1a47484aed8e38741e0457ec3");
        this.f284002a = travelDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_booking` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `type` TEXT NOT NULL, `date` TEXT NOT NULL, `state` TEXT, `time` TEXT, `endDate` TEXT, `address_streetLine1` TEXT, `address_streetLine2` TEXT, `address_region` TEXT, `address_city` TEXT, `address_country` TEXT, `address_postcode` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_favorite` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_trip` (`id` TEXT NOT NULL, `currency` TEXT NOT NULL, `startDate` TEXT NOT NULL, `endDate` TEXT, `travellers` INTEGER, `recommendation_properties` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_trip_destination` (`id` TEXT NOT NULL, `tripId` TEXT NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `product` TEXT NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`tripId`) REFERENCES `travel_trip`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_travel_trip_destination_tripId` ON `travel_trip_destination` (`tripId`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_document` (`product` TEXT NOT NULL, `type` TEXT NOT NULL, `uri` TEXT NOT NULL, PRIMARY KEY(`product`, `type`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '05a3372ae1cfed69d195f9ac4f50069b')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_booking`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_favorite`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_trip`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_trip_destination`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_document`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = TravelDatabase_Impl.f92742m;
        this.f284002a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(14);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", false, 0, null, 1));
        map.put("time", new TableInfo.Column("time", "TEXT", false, 0, null, 1));
        map.put("endDate", new TableInfo.Column("endDate", "TEXT", false, 0, null, 1));
        map.put("address_streetLine1", new TableInfo.Column("address_streetLine1", "TEXT", false, 0, null, 1));
        map.put("address_streetLine2", new TableInfo.Column("address_streetLine2", "TEXT", false, 0, null, 1));
        map.put("address_region", new TableInfo.Column("address_region", "TEXT", false, 0, null, 1));
        map.put("address_city", new TableInfo.Column("address_city", "TEXT", false, 0, null, 1));
        map.put("address_country", new TableInfo.Column("address_country", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("travel_booking", map, o.s(map, "address_postcode", new TableInfo.Column("address_postcode", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "travel_booking");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_booking(com.revolut.feature.travel.common.impl.data.model.booking.entity.TravelBookingEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(4);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map2.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("travel_favorite", map2, o.s(map2, "type", new TableInfo.Column("type", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "travel_favorite");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_favorite(com.revolut.feature.travel.common.impl.data.model.booking.entity.TravelFavoriteEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(6);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map3.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map3.put("startDate", new TableInfo.Column("startDate", "TEXT", true, 0, null, 1));
        map3.put("endDate", new TableInfo.Column("endDate", "TEXT", false, 0, null, 1));
        map3.put("travellers", new TableInfo.Column("travellers", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("travel_trip", map3, o.s(map3, "recommendation_properties", new TableInfo.Column("recommendation_properties", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "travel_trip");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_trip(com.revolut.feature.travel.common.impl.data.model.trip.entity.TravelTripEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(5);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map4.put("tripId", new TableInfo.Column("tripId", "TEXT", true, 0, null, 1));
        map4.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map4.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        HashSet hashSetS = o.s(map4, "product", new TableInfo.Column("product", "TEXT", true, 0, null, 1), 1);
        HashSet hashSetL = b.l(hashSetS, new TableInfo.ForeignKey("travel_trip", "CASCADE", "NO ACTION", Arrays.asList("tripId"), Arrays.asList("id")), 1);
        hashSetL.add(new TableInfo.Index("index_travel_trip_destination_tripId", false, Arrays.asList("tripId"), Arrays.asList("ASC")));
        TableInfo tableInfo7 = new TableInfo("travel_trip_destination", map4, hashSetS, hashSetL);
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "travel_trip_destination");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_trip_destination(com.revolut.feature.travel.common.impl.data.model.trip.entity.TravelTripDestinationEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(3);
        map5.put("product", new TableInfo.Column("product", "TEXT", true, 1, null, 1));
        map5.put("type", new TableInfo.Column("type", "TEXT", true, 2, null, 1));
        TableInfo tableInfo9 = new TableInfo("travel_document", map5, o.s(map5, "uri", new TableInfo.Column("uri", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "travel_document");
        return !tableInfo9.equals(tableInfo10) ? new RoomOpenDelegate.ValidationResult(false, o.o("travel_document(com.revolut.feature.travel.common.impl.data.model.document.entity.TravelDocumentInfoEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
