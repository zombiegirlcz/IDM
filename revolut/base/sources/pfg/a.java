package pfg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f235578c = new a();

    private a() {
        super(10, 11);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "DROP TABLE `travel_miles_accounts`", "CREATE TABLE IF NOT EXISTS `travel_miles_accounts` (`id` TEXT NOT NULL, `externalId` TEXT NOT NULL, `primaryAirlines` TEXT, `provider_id` TEXT NOT NULL, `provider_name` TEXT NOT NULL, `provider_logoUrl` TEXT NOT NULL, `provider_unit` TEXT NOT NULL, PRIMARY KEY(`id`))", "DELETE FROM `travel_miles_provider`");
    }
}
