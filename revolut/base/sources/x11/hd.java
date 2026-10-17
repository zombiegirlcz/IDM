package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class hd extends Migration {
    public hd() {
        super(77, 78);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `airport_lounge_pass`", "CREATE TABLE IF NOT EXISTS `airport_lounge_registration` (`id` TEXT NOT NULL, `rawPass` TEXT, `passReference` TEXT, `holderName` TEXT NOT NULL, `isUserHolder` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `expiredAt` INTEGER, `termsInHours` INTEGER, `type` TEXT NOT NULL, `flight` TEXT, PRIMARY KEY(`id`))");
    }
}
