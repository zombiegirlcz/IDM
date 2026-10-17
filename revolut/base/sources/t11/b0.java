package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends Migration {
    public b0() {
        super(334, 335);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `charges_taxes_taxes_breakdown` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `charges_taxes_total_amount` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `charges_taxes_total_currency` TEXT DEFAULT NULL");
    }
}
