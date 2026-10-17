package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f13762c = new i();

    private i() {
        super(18, 19);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `hotels_experiences` (`id` TEXT NOT NULL, `bookingId` TEXT NOT NULL, `name` TEXT NOT NULL, `images` TEXT NOT NULL, `startingPrice` TEXT NOT NULL, `description` TEXT NOT NULL, `cancellationPolicy` TEXT NOT NULL, `destination_id` TEXT NOT NULL, `destination_name` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
