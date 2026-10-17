package pfg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f235581c = new d();

    private d() {
        super(13, 14);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "ALTER table `travel_miles_provider` ADD COLUMN `accountLinkType` TEXT", "ALTER table `travel_miles_airlines` ADD COLUMN `provider_accountLinkType` TEXT", "ALTER table `travel_miles_airline_details` ADD COLUMN `provider_accountLinkType` TEXT");
    }
}
