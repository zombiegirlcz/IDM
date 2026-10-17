package g5d;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends Migration {
    public h() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `air_tip_animation_state` ADD COLUMN `last_query_at` INTEGER DEFAULT NULL");
    }
}
