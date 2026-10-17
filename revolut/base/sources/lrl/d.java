package lrl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f199553c = new d();

    private d() {
        super(13, 14);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DROP INDEX IF EXISTS `index_trading_orders_symbol`", "DROP TABLE IF EXISTS `trading_orders`");
    }
}
