package uxb;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f283960c = new e();

    private e() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `rev_points_product_transaction` (`originId` TEXT NOT NULL, `product` TEXT NOT NULL, `pointsTransactionId` TEXT NOT NULL, `type` TEXT NOT NULL, `points` REAL NOT NULL, `createdDate` INTEGER NOT NULL, `coreTransactionId` TEXT, PRIMARY KEY(`originId`, `product`))");
    }
}
