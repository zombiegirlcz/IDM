package m45;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends Migration {
    public c() {
        super(14, 15);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `loan_repayments` (`loanId` TEXT NOT NULL, `id` TEXT NOT NULL, `transactionId` TEXT NOT NULL, `repaymentDateTime` TEXT NOT NULL, `currency` TEXT NOT NULL, `amount` INTEGER NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`id`, `loanId`))");
    }
}
