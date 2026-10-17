package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f13750c = new b0();

    private b0() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("CREATE TABLE IF NOT EXISTS `hotels_booking_details` (`id` TEXT NOT NULL, `status` TEXT NOT NULL, `bookingReference` TEXT NOT NULL, `traveller` TEXT NOT NULL, `dates` TEXT NOT NULL, `property` TEXT NOT NULL, `pricing` TEXT NOT NULL, `rooms` TEXT NOT NULL, `payment` TEXT NOT NULL, PRIMARY KEY(`id`))");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
