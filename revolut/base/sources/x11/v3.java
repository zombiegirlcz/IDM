package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v3 f302034c = new v3();

    private v3() {
        super(Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `beneficiary_feeExpected` INTEGER DEFAULT NULL");
    }
}
