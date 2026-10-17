package r0g;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.travel.experiences.impl.database.TravelExperiencesDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesDatabase_Impl f250804a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TravelExperiencesDatabase_Impl travelExperiencesDatabase_Impl) {
        super(10, "42712fc4fb3d9e6743cad1b407b5f3f2", "be728d1cab6eb7456afc7a64182f7353");
        this.f250804a = travelExperiencesDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_experiences_booking` (`id` TEXT NOT NULL, `status` TEXT NOT NULL, `createdDate` TEXT NOT NULL, `date` TEXT NOT NULL, `time` TEXT, `experience` TEXT NOT NULL, `visitors` TEXT, `failureReason` TEXT, `ticket` TEXT, `pricing` TEXT NOT NULL, `rewardType` TEXT, `cashback` TEXT NOT NULL, `cancellationToken` TEXT, `cancellationPolicy` TEXT, `cancellationRefund` TEXT, `transactions` TEXT, `pointsReward` TEXT, `pointsOption` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_experiences_recent_search_destination` (`id` TEXT NOT NULL, `searchTimestamp` INTEGER NOT NULL, `name` TEXT NOT NULL, `startDate` INTEGER, `endDate` INTEGER, `locationType` TEXT NOT NULL, `destinationType` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_experiences_recently_viewed_dropoff` (`experienceId` TEXT NOT NULL, `name` TEXT NOT NULL, `subtitle` TEXT, `image` TEXT NOT NULL, `parameters` TEXT NOT NULL, PRIMARY KEY(`experienceId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_experiences_reviews` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `experienceId` TEXT NOT NULL, `publishedDate` TEXT NOT NULL, `userName` TEXT NOT NULL, `rating` INTEGER, `title` TEXT NOT NULL, `text` TEXT NOT NULL, `provider` TEXT NOT NULL, `light` TEXT NOT NULL, `dark` TEXT NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `travel_experiences_reviews_summary` (`experienceId` TEXT NOT NULL, `count` INTEGER NOT NULL, `averageScore` REAL NOT NULL, PRIMARY KEY(`experienceId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '42712fc4fb3d9e6743cad1b407b5f3f2')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_experiences_booking`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_experiences_recent_search_destination`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_experiences_recently_viewed_dropoff`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_experiences_reviews`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `travel_experiences_reviews_summary`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = TravelExperiencesDatabase_Impl.f92934m;
        this.f250804a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(18);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
        map.put("createdDate", new TableInfo.Column("createdDate", "TEXT", true, 0, null, 1));
        map.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
        map.put("time", new TableInfo.Column("time", "TEXT", false, 0, null, 1));
        map.put("experience", new TableInfo.Column("experience", "TEXT", true, 0, null, 1));
        map.put("visitors", new TableInfo.Column("visitors", "TEXT", false, 0, null, 1));
        map.put("failureReason", new TableInfo.Column("failureReason", "TEXT", false, 0, null, 1));
        map.put("ticket", new TableInfo.Column("ticket", "TEXT", false, 0, null, 1));
        map.put("pricing", new TableInfo.Column("pricing", "TEXT", true, 0, null, 1));
        map.put("rewardType", new TableInfo.Column("rewardType", "TEXT", false, 0, null, 1));
        map.put("cashback", new TableInfo.Column("cashback", "TEXT", true, 0, null, 1));
        map.put("cancellationToken", new TableInfo.Column("cancellationToken", "TEXT", false, 0, null, 1));
        map.put("cancellationPolicy", new TableInfo.Column("cancellationPolicy", "TEXT", false, 0, null, 1));
        map.put("cancellationRefund", new TableInfo.Column("cancellationRefund", "TEXT", false, 0, null, 1));
        map.put("transactions", new TableInfo.Column("transactions", "TEXT", false, 0, null, 1));
        map.put("pointsReward", new TableInfo.Column("pointsReward", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("travel_experiences_booking", map, o.s(map, "pointsOption", new TableInfo.Column("pointsOption", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "travel_experiences_booking");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_experiences_booking(com.revolut.feature.travel.experiences.impl.database.entity.TravelExperiencesBookingEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(7);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("searchTimestamp", new TableInfo.Column("searchTimestamp", "INTEGER", true, 0, null, 1));
        map2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map2.put("startDate", new TableInfo.Column("startDate", "INTEGER", false, 0, null, 1));
        map2.put("endDate", new TableInfo.Column("endDate", "INTEGER", false, 0, null, 1));
        map2.put("locationType", new TableInfo.Column("locationType", "TEXT", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("travel_experiences_recent_search_destination", map2, o.s(map2, "destinationType", new TableInfo.Column("destinationType", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "travel_experiences_recent_search_destination");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_experiences_recent_search_destination(com.revolut.feature.travel.experiences.impl.database.entity.TravelRecentSearchDestinationEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(5);
        map3.put("experienceId", new TableInfo.Column("experienceId", "TEXT", true, 1, null, 1));
        map3.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map3.put("subtitle", new TableInfo.Column("subtitle", "TEXT", false, 0, null, 1));
        map3.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("travel_experiences_recently_viewed_dropoff", map3, o.s(map3, "parameters", new TableInfo.Column("parameters", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "travel_experiences_recently_viewed_dropoff");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_experiences_recently_viewed_dropoff(com.revolut.feature.travel.experiences.impl.data.model.experience.dropoff.entity.TravelExperienceRecentlyViewedEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(10);
        map4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
        map4.put("experienceId", new TableInfo.Column("experienceId", "TEXT", true, 0, null, 1));
        map4.put("publishedDate", new TableInfo.Column("publishedDate", "TEXT", true, 0, null, 1));
        map4.put("userName", new TableInfo.Column("userName", "TEXT", true, 0, null, 1));
        map4.put("rating", new TableInfo.Column("rating", "INTEGER", false, 0, null, 1));
        map4.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map4.put("text", new TableInfo.Column("text", "TEXT", true, 0, null, 1));
        map4.put("provider", new TableInfo.Column("provider", "TEXT", true, 0, null, 1));
        map4.put("light", new TableInfo.Column("light", "TEXT", true, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("travel_experiences_reviews", map4, o.s(map4, "dark", new TableInfo.Column("dark", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "travel_experiences_reviews");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("travel_experiences_reviews(com.revolut.feature.travel.experiences.impl.database.entity.TravelExperiencesReviewEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(3);
        map5.put("experienceId", new TableInfo.Column("experienceId", "TEXT", true, 1, null, 1));
        map5.put("count", new TableInfo.Column("count", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("travel_experiences_reviews_summary", map5, o.s(map5, "averageScore", new TableInfo.Column("averageScore", "REAL", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "travel_experiences_reviews_summary");
        return !tableInfo9.equals(tableInfo10) ? new RoomOpenDelegate.ValidationResult(false, o.o("travel_experiences_reviews_summary(com.revolut.feature.travel.experiences.impl.database.entity.TravelExperiencesReviewSummaryEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
