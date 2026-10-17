package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Migration {
    public e0() {
        super(337, 338);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `crypto_deposit_counterparty_address` TEXT DEFAULT NULL");
    }
}
