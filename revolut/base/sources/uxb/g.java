package uxb;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f283962c = new g();

    private g() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "DROP TABLE `rev_points_transaction`", "CREATE TABLE IF NOT EXISTS `rev_points_transaction` (`pointsTransactionId` TEXT NOT NULL, `type` TEXT NOT NULL, `points` REAL NOT NULL, `createdDate` INTEGER NOT NULL, `coreTransactionId` TEXT, `product` TEXT, `state` TEXT NOT NULL, PRIMARY KEY(`pointsTransactionId`))", "DROP TABLE `rev_points_product_transaction`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `rev_points_product_transaction` (`originId` TEXT NOT NULL, `product` TEXT NOT NULL, `pointsTransactionId` TEXT NOT NULL, `type` TEXT NOT NULL, `points` REAL NOT NULL, `createdDate` INTEGER NOT NULL, `coreTransactionId` TEXT, `state` TEXT NOT NULL, PRIMARY KEY(`originId`, `product`))");
    }
}
