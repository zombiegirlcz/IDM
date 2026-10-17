package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n3 f301941c = new n3();

    private n3() {
        super(199, 200);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `hotelBookingId` TEXT DEFAULT NULL");
    }
}
