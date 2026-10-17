package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class b1 extends Migration {
    public b1() {
        super(363, 364);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `recipient_individual_type` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transactions` ADD COLUMN `sender_individual_type` TEXT DEFAULT NULL");
    }
}
