package m45;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends Migration {
    public b() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `loan_refinanced_credits_v2` (`refinancingIdentifier` TEXT NOT NULL, `refinancingState` TEXT NOT NULL, `loanId` TEXT NOT NULL, `id` TEXT NOT NULL, `mode` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `type` TEXT NOT NULL, `state` TEXT NOT NULL, `receiptAvailable` INTEGER NOT NULL, `bankName` TEXT, `fallbackDateTime` TEXT, `fallbackTransactionId` TEXT, PRIMARY KEY(`loanId`, `id`, `refinancingIdentifier`))");
    }
}
