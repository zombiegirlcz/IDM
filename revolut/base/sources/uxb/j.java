package uxb;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f283965c = new j();

    private j() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE `rev_points_product_transaction`", "CREATE TABLE IF NOT EXISTS `rev_points_transaction_metadata` (\n            `metadataKey` TEXT NOT NULL, \n            `metadataValue` INTEGER NOT NULL DEFAULT(0), \n            PRIMARY KEY(`metadataKey`)\n            )");
    }
}
