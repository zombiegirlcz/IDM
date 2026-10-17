package qpj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends Migration {
    public b() {
        super(10, 11);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `transaction_links` (`linked_transaction_id` TEXT NOT NULL, `original_transaction_id` TEXT NOT NULL, PRIMARY KEY(`linked_transaction_id`))");
    }
}
