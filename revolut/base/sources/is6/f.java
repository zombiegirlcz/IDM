package is6;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Migration {
    public f() {
        super(23, 24);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `invoices` ADD COLUMN `recurringInvoiceId` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `invoices` ADD COLUMN `recurringSchedule` TEXT DEFAULT NULL");
    }
}
