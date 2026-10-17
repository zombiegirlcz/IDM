package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class de extends Migration {
    public de() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `pricing_plan`", "CREATE TABLE IF NOT EXISTS `pricing_plan` (`id` TEXT NOT NULL, `code` TEXT NOT NULL, `currencyCode` TEXT NOT NULL, `min_period` TEXT, `billing` TEXT NOT NULL, `features` TEXT NOT NULL, `card_designs` TEXT NOT NULL, `products` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `current_product` (`generatedId` INTEGER PRIMARY KEY AUTOINCREMENT, `id` TEXT, `type` TEXT NOT NULL, `code` TEXT NOT NULL, `name` TEXT NOT NULL, `currency` TEXT, `price` INTEGER, `limit` INTEGER, `feePc` REAL, `free` INTEGER, `usage` INTEGER)");
    }
}
