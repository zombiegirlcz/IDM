package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class z3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z3 f302079c = new z3();

    private z3() {
        super(Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION, 208);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `virtual_contacts` (`point` TEXT NOT NULL, `type` TEXT NOT NULL, `transactionsCount` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`point`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_virtual_contacts_point` ON `virtual_contacts` (`point`)");
    }
}
