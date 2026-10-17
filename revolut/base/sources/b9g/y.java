package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f13778c = new y();

    private y() {
        super(32, 33);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `hotels_booking_details` ADD COLUMN `transactions` TEXT");
    }
}
