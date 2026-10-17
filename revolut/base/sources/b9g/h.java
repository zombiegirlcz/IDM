package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f13761c = new h();

    private h() {
        super(17, 18);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER table `hotels_booking_details` ADD COLUMN `createdDate` TEXT");
    }
}
