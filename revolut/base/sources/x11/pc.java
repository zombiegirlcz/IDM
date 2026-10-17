package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class pc extends Migration {
    public pc() {
        super(69, 70);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `split_bill` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `currency` TEXT NOT NULL, `comment` TEXT, `dateTime` INTEGER NOT NULL, `splitted_items` TEXT NOT NULL, `money_requests` TEXT NOT NULL, PRIMARY KEY(`id`))", "ALTER table `money_requests` ADD COLUMN `state` TEXT DEFAULT NULL", "ALTER table `money_requests` ADD COLUMN `split_bill_id` TEXT DEFAULT NULL");
    }
}
