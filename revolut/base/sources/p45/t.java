package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class t extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f232831c = new t();

    private t() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `loans` \n                (`id` TEXT NOT NULL, \n                `name` TEXT NOT NULL, \n                `disbursalDate` TEXT NOT NULL, \n                `finalRepaymentDate` TEXT NOT NULL, \n                `currency` TEXT NOT NULL, \n                `countryCode` TEXT NOT NULL, \n                `principal` INTEGER NOT NULL, \n                `totalRepaid` INTEGER NOT NULL, \n                `totalToRepay` INTEGER NOT NULL, \n                `percentageRepaid` INTEGER NOT NULL, \n                `isRefinancing` INTEGER NOT NULL, \n                `state` TEXT NOT NULL, \n                PRIMARY KEY(`id`))");
    }
}
