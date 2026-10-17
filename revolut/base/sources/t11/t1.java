package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class t1 extends Migration {
    public t1() {
        super(381, 382);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `beneficiaries` ADD COLUMN `looksLikeSelfBeneficiary` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `beneficiaries` ADD COLUMN `createdDate` INTEGER DEFAULT NULL");
    }
}
