package uxb;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f283964c = new i();

    private i() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "DROP TABLE `rev_points_transaction`", "CREATE TABLE IF NOT EXISTS `rev_points_transaction` (\n            `pointsTransactionId` TEXT NOT NULL, \n            `type` TEXT NOT NULL, \n            `points` REAL NOT NULL, \n            `createdDate` INTEGER NOT NULL, \n            `coreTransactionId` TEXT, \n            `product` TEXT, \n            `state` TEXT NOT NULL,\n            `description` TEXT NOT NULL,\n            `name` TEXT,\n            `iconsUrl` TEXT,\n            `exchangeDetails` TEXT,\n            `exchangedAmount` TEXT,\n            `originId` TEXT,\n            PRIMARY KEY(`pointsTransactionId`)\n            )", "DROP TABLE `rev_points_product_transaction`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `rev_points_product_transaction` (\n            `originId` TEXT NOT NULL, \n            `product` TEXT NOT NULL, \n            `pointsTransactionId` TEXT NOT NULL, \n            `type` TEXT NOT NULL, \n            `points` REAL NOT NULL, \n            `createdDate` INTEGER NOT NULL, \n            `coreTransactionId` TEXT, \n            `state` TEXT NOT NULL,\n            `description` TEXT NOT NULL,\n            `name` TEXT,\n            `iconsUrl` TEXT,\n            `exchangeDetails` TEXT,\n            `exchangedAmount` TEXT,\n            PRIMARY KEY(`originId`, `product`)\n            )");
    }
}
