package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f13775c = new v();

    private v() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "DROP TABLE `hotels_location`", "CREATE TABLE IF NOT EXISTS `hotels_location` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `name` TEXT NOT NULL, `fullName` TEXT NOT NULL, `country` TEXT NOT NULL, `propertyCount` INTEGER, `coordinates` TEXT NOT NULL, `isDistrict` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
