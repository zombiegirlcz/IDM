package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k2 f301901c = new k2();

    private k2() {
        super(174, 175);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `trading_orders`", "DROP INDEX IF EXISTS `index_trading_orders_symbol`");
    }
}
