package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u5 f302024c = new u5();

    private u5() {
        super(246, Constants.TAG_BLE_FIRMWARE_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `beneficiaries` ADD COLUMN `bankLogo` TEXT DEFAULT NULL");
    }
}
