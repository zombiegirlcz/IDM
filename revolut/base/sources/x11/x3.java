package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3 f302054c = new x3();

    private x3() {
        super(Constants.TAG_KSN_FORMATS, 206);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `feeBreakdownId` TEXT DEFAULT NULL");
    }
}
