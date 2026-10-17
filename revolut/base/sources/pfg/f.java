package pfg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f235583c = new f();

    private f() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `travel_miles_airlines` (`ref` TEXT NOT NULL, `name` TEXT NOT NULL, `programmeName` TEXT NOT NULL, `description` TEXT NOT NULL, `logoUrl` TEXT NOT NULL, `learnMoreUrl` TEXT NOT NULL, `provider_id` TEXT NOT NULL, `provider_name` TEXT NOT NULL, `provider_description` TEXT NOT NULL, `provider_logoUrl` TEXT NOT NULL, `provider_signupUrl` TEXT NOT NULL, `provider_partner` TEXT NOT NULL, `provider_account` TEXT, `provider_rate` TEXT, PRIMARY KEY(`ref`))", "ALTER table `travel_miles_provider` ADD COLUMN `rate` TEXT");
    }
}
