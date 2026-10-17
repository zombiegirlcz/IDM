package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y3 f302066c = new y3();

    private y3() {
        super(206, Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `instrument_tickers_summary` ADD COLUMN `highlyVolatile` INTEGER");
    }
}
