package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n4 f301942c = new n4();

    private n4() {
        super(Constants.TAG_KSL_ID, 220);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `instruments` ADD COLUMN `type` TEXT NOT NULL DEFAULT ''");
    }
}
