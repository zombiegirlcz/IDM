package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3 f302022c = new u3();

    private u3() {
        super(202, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `insurance` ADD COLUMN `subtypesInfo` TEXT NOT NULL DEFAULT '[]'");
    }
}
