package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w4 f302043c = new w4();

    private w4() {
        super(Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION, Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE IF EXISTS `trading_trades`");
    }
}
