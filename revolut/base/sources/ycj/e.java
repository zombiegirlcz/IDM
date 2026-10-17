package ycj;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f312628c = new e();

    private e() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `commodity_price_targets_info`", "CREATE TABLE IF NOT EXISTS `commodity_price_targets_info` (`fromCcy` TEXT NOT NULL, `toCcy` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `priceTargets` TEXT NOT NULL, PRIMARY KEY(`fromCcy`, `toCcy`))");
    }
}
