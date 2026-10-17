package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f13754c = new d0();

    private d0() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("CREATE TABLE IF NOT EXISTS `hotels_recent_location_searches` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `searchTimestamp` INTEGER NOT NULL, `checkIn` INTEGER NOT NULL, `checkOut` INTEGER NOT NULL, `roomsOccupancy` TEXT NOT NULL, PRIMARY KEY(`id`))");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
