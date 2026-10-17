package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f13760c = new g0();

    private g0() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        wp5.y.z(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `hotels_location_temp` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `country` TEXT NOT NULL, `propertyCount` INTEGER, `coordinates` TEXT NOT NULL, `isDistrict` INTEGER NOT NULL, PRIMARY KEY(`id`))", "INSERT INTO hotels_location_temp(id, type, name, description, country, propertyCount, coordinates, isDistrict) SELECT id, type, name, description, country, propertyCount, coordinates, isDistrict FROM hotels_location", "DROP TABLE `hotels_location`");
        wp5.y.y(supportSQLiteDatabase, "ALTER TABLE hotels_location_temp RENAME TO hotels_location");
    }
}
