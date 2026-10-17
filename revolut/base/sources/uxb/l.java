package uxb;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f283967c = new l();

    private l() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "DROP TABLE `rev_points_transaction`", "DROP TABLE `rev_points_transaction_metadata`", "CREATE TABLE IF NOT EXISTS `rev_points_transaction` (\n                `pointsTransactionId` TEXT NOT NULL,\n                `type` TEXT NOT NULL,\n                `points` REAL NOT NULL,\n                `createdDate` INTEGER NOT NULL,\n                `coreTransactionId` TEXT,\n                `product` TEXT,\n                `state` TEXT NOT NULL,\n                `description` TEXT NOT NULL,\n                `name` TEXT,\n                `iconsUrl` TEXT,\n                `exchangeDetails` TEXT,\n                `exchangedAmount` TEXT,\n                `originId` TEXT,\n                `originResource` TEXT,\n                `originResourceType` TEXT,\n                `receivedExchangeDetails` TEXT,\n                PRIMARY KEY(`pointsTransactionId`)\n                )");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `rev_points_transaction_metadata` (\n                `metadataKey` TEXT NOT NULL,\n                `metadataValue` INTEGER NOT NULL,\n                PRIMARY KEY(`metadataKey`)\n                )");
    }
}
