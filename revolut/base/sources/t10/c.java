package t10;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends Migration {
    public c() {
        super(53, 54);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "db", "ALTER TABLE `agents` ADD COLUMN `presenceStateValue` TEXT", "ALTER TABLE `agents` ADD COLUMN `presenceStateAvailableAt` TEXT");
    }
}
