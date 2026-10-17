package pfg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f235587c = new j();

    private j() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `travel_miles_airline_details` (`ref` TEXT NOT NULL, `name` TEXT NOT NULL, `programmeName` TEXT NOT NULL, `description` TEXT NOT NULL, `logoUrl` TEXT NOT NULL, `learnMoreUrl` TEXT NOT NULL, `suggested` INTEGER NOT NULL, `backgroundUrl` TEXT NOT NULL, `redeemOptions` TEXT NOT NULL, `extraRedeemOptions` TEXT NOT NULL, `provider_id` TEXT NOT NULL, `provider_name` TEXT NOT NULL, `provider_description` TEXT NOT NULL, `provider_logoUrl` TEXT NOT NULL, `provider_signupUrl` TEXT NOT NULL, `provider_partner` TEXT NOT NULL, `provider_account` TEXT, `provider_rate` TEXT, PRIMARY KEY(`ref`))");
    }
}
