package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c6 f301807c = new c6();

    private c6() {
        super(Constants.TAG_FC_SPEED_MODE, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `statement_template_info` ADD COLUMN `accountId` TEXT DEFAULT NULL");
    }
}
