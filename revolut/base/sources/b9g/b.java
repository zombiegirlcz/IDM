package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f13749c = new b();

    private b() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `hotels_dropoff_location_search` (`id` INTEGER NOT NULL, `searchTimestamp` INTEGER NOT NULL, `type` TEXT NOT NULL, `checkIn` INTEGER NOT NULL, `checkOut` INTEGER NOT NULL, `roomsOccupancy` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `hotels_dropoff_property_search` (`propertyId` TEXT NOT NULL, `propertyName` TEXT NOT NULL, `propertyImageUrl` TEXT, `searchTimestamp` INTEGER NOT NULL, `dropoffState` TEXT NOT NULL, `checkIn` INTEGER NOT NULL, `checkOut` INTEGER NOT NULL, `roomsOccupancy` TEXT NOT NULL, `roomSelection` TEXT, PRIMARY KEY(`propertyId`))");
    }
}
