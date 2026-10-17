package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class nd extends Migration {
    public nd() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT exists `contact`(\n    `id` INTEGER NOT NULL,\n    `point` TEXT NOT NULL,\n    `formattedPoint` TEXT,\n    `displayedName` TEXT NOT NULL,\n    `registeredAs` TEXT NOT NULL,\n    `revolutUserId` TEXT,\n    `isRevolut` INTEGER DEFAULT 0 NOT NULL,\n    `isPremium` INTEGER DEFAULT 0 NOT NULL,\n    `transactionsCount` INTEGER DEFAULT 0 NOT NULL,\n    `pictureUri` TEXT,\n    `type` TEXT NOT NULL,\n    PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `group_payments` (\n    `id` INTEGER,\n    `lastTime` INTEGER NOT NULL,\n    PRIMARY KEY(`id`))", "CREATE TABLE IF NOT exists `contact_group_join` (\n     `groupPaymentId` INTEGER NOT NULL,\n     `contactId` INTEGER NOT NULL,\n     PRIMARY KEY(`groupPaymentId`, `contactId`),\n     FOREIGN KEY(`groupPaymentId`) REFERENCES group_payments(`id`) ON DELETE CASCADE)");
    }
}
