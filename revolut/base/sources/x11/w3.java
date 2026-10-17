package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w3 f302042c = new w3();

    private w3() {
        super(Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2, Constants.TAG_KSN_FORMATS);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE IF EXISTS `pricing_plan`");
    }
}
