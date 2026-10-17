package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class pe extends Migration {
    public pe() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `price_alert` (`id` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `currencyFrom` TEXT NOT NULL, `currencyTo` TEXT NOT NULL, `rate` REAL NOT NULL, `trigger` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `auto_exchange` (`id` TEXT NOT NULL, `currencyFrom` TEXT NOT NULL, `currencyTo` TEXT NOT NULL, `amount` INTEGER NOT NULL, `amountCurrency` TEXT NOT NULL, `rate` REAL NOT NULL, `rateCurrency` TEXT NOT NULL, `state` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `updatedDate` INTEGER, `transactionId` TEXT, PRIMARY KEY(`id`))");
    }
}
