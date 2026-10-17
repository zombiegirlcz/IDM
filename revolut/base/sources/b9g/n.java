package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f13767c = new n();

    private n() {
        super(22, 23);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DELETE FROM `hotels_price_range`", "DELETE FROM `hotels_inventory_provider`", "DELETE FROM `hotels_booking_details`");
        supportSQLiteDatabase.execSQL("DELETE FROM `hotels_recent_property_searches`");
    }
}
