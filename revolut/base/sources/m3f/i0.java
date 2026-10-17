package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f202425c = new i0();

    private i0() {
        super(ISO781611.CREATION_DATE_AND_TIME_TAG, 132);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `fund_trade` TEXT DEFAULT NULL");
    }
}
