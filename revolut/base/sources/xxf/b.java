package xxf;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f309512c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `travel_trip` (\n    `id` TEXT NOT NULL,\n    `currency` TEXT NOT NULL,\n    `startDate` TEXT NOT NULL,\n    `endDate` TEXT,\n    `travellers` INTEGER,\n    `recommendation_properties` TEXT,\n    PRIMARY KEY(`id`)\n)", "CREATE TABLE IF NOT EXISTS `travel_trip_destination` (\n    `id` TEXT NOT NULL,\n    `tripId` TEXT NOT NULL,\n    `name` TEXT NOT NULL,\n    `type` TEXT NOT NULL,\n    `product` TEXT NOT NULL,\n    PRIMARY KEY(`id`),\n    FOREIGN KEY(`tripId`) REFERENCES `travel_trip`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE\n)", "CREATE INDEX IF NOT EXISTS `index_travel_trip_destination_tripId` \nON `travel_trip_destination` (`tripId`)");
    }
}
