package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h4 f301869c = new h4();

    private h4() {
        super(Constants.TAG_EMV_L1_VERSION, Constants.TAG_EMV_L1_CHECKSUM);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `cardVerification` INTEGER NOT NULL DEFAULT 0");
    }
}
