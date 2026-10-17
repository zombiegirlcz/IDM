package pfg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f235579c = new b();

    private b() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "DELETE FROM `travel_miles_provider`", "DELETE FROM `travel_miles_rates`", "ALTER table `travel_miles_rates` ADD COLUMN `display` TEXT NOT NULL");
    }
}
