package uxb;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f283959c = new d();

    private d() {
        super(13, 14);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.delete("rev_points_transaction_metadata", null, null);
        db8.execSQL("DROP TABLE `rev_points_transaction`");
        db8.execSQL("CREATE TABLE IF NOT EXISTS `rev_points_transaction` (\n                `pointsTransactionId` TEXT NOT NULL,\n                `type` TEXT NOT NULL,\n                `points` REAL NOT NULL,\n                `createdDate` INTEGER NOT NULL,\n                `coreTransactionId` TEXT,\n                `product` TEXT,\n                `state` TEXT NOT NULL,\n                `description` TEXT NOT NULL,\n                `name` TEXT,\n                `iconsUrl` TEXT,\n                `exchangeDetails` TEXT,\n                `exchangedAmount` TEXT,\n                `originId` TEXT,\n                `originResource` TEXT,\n                `receivedExchangeDetails` TEXT,\n                `earningDetails` TEXT,\n                PRIMARY KEY(`pointsTransactionId`)\n                )");
    }
}
