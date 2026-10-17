package is6;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends Migration {
    public n() {
        super(31, 32);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `acquiring_payments` ADD COLUMN `net_amount_amount` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `acquiring_payments` ADD COLUMN `net_amount_currency` TEXT DEFAULT NULL");
    }
}
