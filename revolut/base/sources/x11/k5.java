package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k5 f301904c = new k5();

    private k5() {
        super(Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, 239);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE IF EXISTS `collections`");
    }
}
