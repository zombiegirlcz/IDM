package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x8 extends Migration {
    public x8() {
        super(31, 32);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `insurance` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `state` TEXT NOT NULL, `reason` TEXT, `relatedToPlan` TEXT, `pricing` TEXT NOT NULL, `period` TEXT NOT NULL, `createdAt` INTEGER, `startedAt` INTEGER, `expiredAt` INTEGER, `cancelledAt` INTEGER, `certificate` TEXT, `certificateSerial` TEXT, `price` TEXT NOT NULL, `excess` TEXT NOT NULL, `company` TEXT NOT NULL, `deviceInsuranceInfo` TEXT, `travelInsuranceInfo` TEXT, PRIMARY KEY(`id`))");
    }
}
