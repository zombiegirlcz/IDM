package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k3 f301902c = new k3();

    private k3() {
        super(196, Constants.TAG_BATTERY_STATE);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `cardOwnerId` TEXT DEFAULT NULL");
    }
}
