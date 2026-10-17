package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class xa extends Migration {
    public xa() {
        super(49, 50);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `wallet` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `base_currency` TEXT NOT NULL, `reference` TEXT, `total_topup` INTEGER NOT NULL, `topup_limit` INTEGER, `topup_reset_date` INTEGER, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `pockets` (`id` TEXT NOT NULL, `wallet_id` TEXT NOT NULL, `internal_type` TEXT NOT NULL, `type` TEXT NOT NULL, `state` TEXT NOT NULL, `name` TEXT NOT NULL, `currency` TEXT NOT NULL, `balance` INTEGER NOT NULL, `blocked_amount` INTEGER, `credit_limit` INTEGER, PRIMARY KEY(`id`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE  INDEX `index_pockets_wallet_id` ON `pockets` (`wallet_id`)");
    }
}
