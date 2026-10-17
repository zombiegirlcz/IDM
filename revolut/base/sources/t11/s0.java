package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class s0 extends Migration {
    public s0() {
        super(353, 354);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `recurring_payments` ADD COLUMN `receiverPaymentCounterpartyInfo` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `recurring_payments` ADD COLUMN `availableActions` TEXT DEFAULT NULL");
    }
}
