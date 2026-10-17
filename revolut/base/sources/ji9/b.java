package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f174390c = new b();

    private b() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        f174390c.getClass();
        database.execSQL("CREATE TABLE  limits_tmp (\n            facilityId TEXT NOT NULL, \n            pocketId TEXT NOT NULL,\n            fee TEXT NOT NULL,\n            lateInterest TEXT NOT NULL,\n            apr TEXT NOT NULL,\n            countryCode TEXT NOT NULL,\n            availableToSpend INTEGER NOT NULL,\n            currency TEXT NOT NULL,\n            state TEXT NOT NULL,\n            deactivationReason TEXT,\n            PRIMARY KEY(`facilityId`)\n            )");
        database.execSQL("INSERT INTO limits_tmp \n            SELECT facilityId, \n            pocketId, \n            CAST(fee as TEXT),\n            CAST(lateInterest as TEXT),\n            CAST(apr as TEXT),\n            countryCode,\n            availableToSpend, \n            currency,\n            state,\n            deactivationReason\n            FROM limits");
        database.execSQL("DROP TABLE limits");
        database.execSQL("ALTER TABLE `limits_tmp` RENAME TO `limits`");
    }
}
