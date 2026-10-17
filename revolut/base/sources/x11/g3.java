package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class g3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g3 f301854c = new g3();

    private g3() {
        super(192, Constants.TAG_ATMEL_SERIAL);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `crypto_withdraw_display_rate` REAL DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `crypto_withdraw_display_currency` TEXT DEFAULT NULL");
    }
}
