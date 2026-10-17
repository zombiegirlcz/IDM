package m45;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends Migration {
    public f() {
        super(25, 26);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `loan_details_shard` ADD COLUMN `autoPayRepaymentSource` TEXT DEFAULT NULL");
    }
}
