package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z1 f302077c = new z1();

    private z1() {
        super(Constants.TAG_EMVL3_VERSION, Constants.TAG_PAYMENT_APP_CLESS_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "\n                UPDATE `recurring_payments`\n                SET state = \"CONFIRMED\"\n                WHERE state = \"ENABLED\"\n            ", "\n                UPDATE `recurring_payments`\n                SET state = \"DISCONFIRMED\"\n                WHERE state = \"DISABLED\"\n            ");
    }
}
