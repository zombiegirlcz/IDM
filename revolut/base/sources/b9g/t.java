package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f13773c = new t();

    private t() {
        super(28, 29);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `hotels_booking_details` ADD COLUMN `hardAmendmentEligibility` TEXT");
    }
}
