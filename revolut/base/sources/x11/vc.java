package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class vc extends Migration {
    public vc() {
        super(71, 72);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE `money_boxes`", "CREATE TABLE IF NOT EXISTS `vaults` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `goal` INTEGER NOT NULL, `banner` TEXT, `icon` TEXT, `underlyingId` TEXT NOT NULL, `pocketInfo` TEXT, `depositInfo` TEXT, `members` TEXT, `estimate` INTEGER, PRIMARY KEY(`id`))", "ALTER TABLE `transactions` ADD COLUMN `vault_id` TEXT");
        supportSQLiteDatabase.execSQL("ALTER TABLE `recurring_payments` ADD COLUMN `receiverInfoVault` TEXT");
    }
}
