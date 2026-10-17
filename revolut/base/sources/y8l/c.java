package y8l;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends Migration {
    public c() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `money_requests` ADD COLUMN `payer_customer_type` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `money_requests` ADD COLUMN `creator_customer_type` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `money_requests` ADD COLUMN `requester_customer_type` TEXT DEFAULT NULL");
    }
}
