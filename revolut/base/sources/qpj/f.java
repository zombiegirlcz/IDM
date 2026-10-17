package qpj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends Migration {
    public f() {
        super(14, 15);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `custom_assets` ADD COLUMN `smart_estimation_rejected` INTEGER NOT NULL DEFAULT 0");
    }
}
