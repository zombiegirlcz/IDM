package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d6 f301822c = new d6();

    private d6() {
        super(Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION, 254);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `charity_request_id` TEXT DEFAULT NULL");
    }
}
