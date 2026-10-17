package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f13771c = new r();

    private r() {
        super(26, 27);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `hotels_dropoff_property_search`", "DROP TABLE IF EXISTS `hotels_dropoff_location_search`");
    }
}
