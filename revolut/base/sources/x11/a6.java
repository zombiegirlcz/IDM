package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a6 f301783c = new a6();

    private a6() {
        super(Constants.TAG_SUPPORTED_LOCALE_LIST, Constants.TAG_FB_CHARGING_STATUS);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `userOfferId` TEXT DEFAULT NULL");
    }
}
