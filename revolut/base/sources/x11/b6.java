package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b6 f301798c = new b6();

    private b6() {
        super(Constants.TAG_FB_CHARGING_STATUS, Constants.TAG_FC_SPEED_MODE);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `cashbackType` TEXT DEFAULT NULL");
    }
}
