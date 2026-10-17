package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class o5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o5 f301952c = new o5();

    private o5() {
        super(240, Constants.TAG_TRANSACTION_DATA);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `transactions` ADD COLUMN `card_pro` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `card_credit` INTEGER DEFAULT NULL");
    }
}
