package ka6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f182437c = new d();

    private d() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `charity_campaigns` (`charityId` TEXT NOT NULL, `id` TEXT NOT NULL, `type` TEXT NOT NULL, `cardDesignCode` TEXT NOT NULL, `cardDesignUrl` TEXT NOT NULL, `status` TEXT NOT NULL, `minDonationsToUnlock` TEXT NOT NULL, PRIMARY KEY(`charityId`, `id`))");
    }
}
