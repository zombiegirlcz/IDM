package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e5 f301830c = new e5();

    private e5() {
        super(232, Constants.TAG_USB_CAPABILITY);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `instalment_plan_feeRate` REAL DEFAULT NULL");
    }
}
