package fz8;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Migration {
    public a() {
        super(10, 11);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `courses` ADD COLUMN `hasLessonsWithAbuseRewardStatus` INTEGER DEFAULT NULL");
    }
}
