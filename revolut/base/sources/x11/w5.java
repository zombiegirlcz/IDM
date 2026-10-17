package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w5 f302044c = new w5();

    private w5() {
        super(Constants.TAG_FULL_SVPP_IDENTIFICATION, Constants.TAG_RESOURCE_FILE_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `note` TEXT DEFAULT NULL");
    }
}
