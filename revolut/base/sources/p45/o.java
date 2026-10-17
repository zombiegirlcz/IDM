package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class o extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f232826c = new o();

    private o() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `loan_refinanced_credits` (\n                `loanId` TEXT NOT NULL, \n                `id` TEXT NOT NULL, \n                `refinancingMode` TEXT NOT NULL, \n                `amount` INTEGER NOT NULL, \n                `currency` TEXT NOT NULL, \n                `presentationState` TEXT NOT NULL, \n                `receiptAvailable` INTEGER NOT NULL, \n                `representation` TEXT NOT NULL, \n                `bankName` TEXT, \n                PRIMARY KEY(`loanId`, `id`))");
    }
}
