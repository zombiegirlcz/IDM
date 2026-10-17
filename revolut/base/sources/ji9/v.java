package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f174410c = new v();

    private v() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `repayment_parts` (\n            `transactionId` TEXT NOT NULL,\n            `planId` TEXT NOT NULL,\n            `instalmentIndex` INTEGER NOT NULL,\n            `amount` INTEGER NOT NULL,\n            `fee` INTEGER NOT NULL,\n            `lateInterest` INTEGER NOT NULL,\n            PRIMARY KEY(`transactionId`, `planId`, `instalmentIndex`))");
    }
}
