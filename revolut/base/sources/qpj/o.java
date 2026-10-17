package qpj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends Migration {
    public o() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `income_sorters` ADD COLUMN `sortMethod` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `income_sorters` ADD COLUMN `remainingBalanceDestinationId` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `income_sorter_executions` ADD COLUMN `remainderDestination` TEXT DEFAULT NULL");
    }
}
