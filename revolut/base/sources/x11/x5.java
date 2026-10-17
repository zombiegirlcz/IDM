package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x5 f302056c = new x5();

    private x5() {
        super(Constants.TAG_RESOURCE_FILE_VERSION, Constants.TAG_SUPPORTED_LOCALE_LIST);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `institutions` ADD COLUMN `mandateInitiation` INTEGER NOT NULL DEFAULT 0");
    }
}
