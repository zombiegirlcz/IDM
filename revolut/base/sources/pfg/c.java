package pfg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f235580c = new c();

    private c() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "DELETE FROM `travel_miles_provider`", "DELETE FROM `travel_miles_airlines`", "DELETE FROM `travel_miles_airline_details`");
        o.C(supportSQLiteDatabase, "ALTER table `travel_miles_provider` ADD COLUMN `campaign` TEXT", "ALTER table `travel_miles_airlines` ADD COLUMN `provider_campaign` TEXT", "ALTER table `travel_miles_airline_details` ADD COLUMN `provider_campaign` TEXT");
    }
}
