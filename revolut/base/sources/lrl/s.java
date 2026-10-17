package lrl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f199568c = new s();

    private s() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `trading_orders`", "CREATE TABLE IF NOT EXISTS `trading_orders` (`id` TEXT NOT NULL, `compoundId` TEXT, `symbol` TEXT NOT NULL, `state` TEXT NOT NULL, `value` TEXT NOT NULL, `declineReason` TEXT, `createdAt` INTEGER NOT NULL, `completedAt` INTEGER, `side` TEXT NOT NULL, `targetPrice` TEXT, `estimatedPrice` TEXT, `executedPrice` TEXT, `estimatedQuantity` TEXT, `executedQuantity` TEXT, `estimatedTotal` TEXT, `gross` TEXT, `net` TEXT, `estimatedNet` TEXT, `orderType` TEXT NOT NULL, `externalId` TEXT, `fees` TEXT NOT NULL, `commission` TEXT, `timeInForce` TEXT NOT NULL, `expectedSettlementDate` INTEGER, `expirationDate` INTEGER, `declineCode` TEXT, `startDate` INTEGER, `period` TEXT, `scheduledExecutionDate` INTEGER, `autoTopUp` TEXT, PRIMARY KEY(`id`))", "CREATE INDEX IF NOT EXISTS `index_trading_orders_symbol` ON `trading_orders` (`symbol`)");
    }
}
