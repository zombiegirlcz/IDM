package y8l;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends Migration {
    public f() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `money_requests` ADD COLUMN `attributes_invoice_url` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `money_requests` ADD COLUMN `attributes_invoice_number` TEXT DEFAULT NULL");
    }
}
