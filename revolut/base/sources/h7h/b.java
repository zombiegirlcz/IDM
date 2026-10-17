package h7h;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f149880c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `recurring_orders` (\n    `orderId` TEXT NOT NULL,\n    `portfolioId` TEXT NOT NULL,\n    `state` TEXT NOT NULL,\n    `period` TEXT NOT NULL,\n    `startDate` TEXT NOT NULL,\n    `updatedDate` INTEGER NOT NULL,\n    `nextDate` TEXT NOT NULL,\n    `orderAmount_amount` INTEGER NOT NULL,\n    `orderAmount_currency` TEXT NOT NULL,\n    PRIMARY KEY(`orderId`)\n)", "CREATE INDEX IF NOT EXISTS `index_recurring_orders_portfolioId`\nON `recurring_orders` (`portfolioId`)");
    }
}
