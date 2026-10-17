package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f13756c = new e0();

    private e0() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "DELETE FROM hotels_location", "CREATE TABLE IF NOT EXISTS `hotels_recent_property_searches` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `searchTimestamp` INTEGER NOT NULL, `checkIn` INTEGER NOT NULL, `checkOut` INTEGER NOT NULL, `roomsOccupancy` TEXT NOT NULL, `propertyType` TEXT NOT NULL, `location` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
