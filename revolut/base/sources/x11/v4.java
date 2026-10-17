package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v4 f302035c = new v4();

    private v4() {
        super(Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE IF EXISTS `entities_adt`");
    }
}
