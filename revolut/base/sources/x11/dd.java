package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class dd extends Migration {
    public dd() {
        super(75, 76);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER table `airport_lounge_pass` ADD COLUMN `isUserHolder` INTEGER NOT NULL DEFAULT 0", "ALTER table `airport_lounge_pass` ADD COLUMN `expiredAt` INTEGER DEFAULT NULL", "ALTER table `airport_lounge_pass` ADD COLUMN `termsInHours` INTEGER DEFAULT NULL");
    }
}
