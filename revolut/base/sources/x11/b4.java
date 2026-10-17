package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b4 f301796c = new b4();

    private b4() {
        super(Constants.TAG_FIRMWARE_VERSION, Constants.TAG_SVPP_CHECKSUM);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `contact` ADD COLUMN `isNewlyJoined` INTEGER NOT NULL DEFAULT 0");
    }
}
