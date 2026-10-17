package pfg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f235585c = new h();

    private h() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "ALTER table `travel_miles_airlines` ADD COLUMN `suggested` INTEGER NOT NULL DEFAULT 0", "ALTER table `travel_miles_airlines` ADD COLUMN `order` INTEGER NOT NULL DEFAULT 0");
    }
}
