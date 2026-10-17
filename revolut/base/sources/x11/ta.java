package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class ta extends Migration {
    public ta() {
        super(47, 48);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DELETE FROM `trades` WHERE `stock_trade` != NULL", "CREATE TABLE IF NOT EXISTS `consents` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `expiry_date` INTEGER, `permissions` TEXT NOT NULL, `account_numbers` TEXT NOT NULL, `third_party_id` TEXT NOT NULL, `third_party_name` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
