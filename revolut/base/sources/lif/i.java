package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends Migration {
    public i() {
        super(18, 19);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `loans` ADD COLUMN `loan_regularRescheduledPrincipalAmount` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `loans` ADD COLUMN `loan_outstandingRescheduledPrincipalAmount` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `loans` ADD COLUMN `loan_overdueRescheduledPrincipalAmount` INTEGER DEFAULT NULL");
    }
}
