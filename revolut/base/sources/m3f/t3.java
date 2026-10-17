package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class t3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t3 f202494c = new t3();

    private t3() {
        super(72, 73);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `portfolio_trades`", "DELETE FROM `trading_trades` WHERE account_type NOT IN ('GIA','ROBO','MARGIN','COMMODITIES')");
    }
}
