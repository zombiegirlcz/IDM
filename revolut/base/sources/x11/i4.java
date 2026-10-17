package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i4 f301880c = new i4();

    private i4() {
        super(Constants.TAG_EMV_L1_CHECKSUM, Constants.TAG_EMV_L2_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `topupMethod` TEXT DEFAULT NULL");
    }
}
