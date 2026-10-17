package lbj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends Migration {
    public h() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `crypto_action_required_deposits` ADD COLUMN `counterparty_updatedDate` INTEGER DEFAULT NULL");
    }
}
