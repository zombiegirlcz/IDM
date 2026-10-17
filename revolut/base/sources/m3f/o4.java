package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class o4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o4 f202465c = new o4();

    private o4() {
        super(91, 92);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("CREATE TABLE IF NOT EXISTS `trading_fiat_instruments` (`fromCurrency` TEXT NOT NULL, `toCurrency` TEXT NOT NULL, `sortOrder` INTEGER NOT NULL, `stateDetails` TEXT NOT NULL, PRIMARY KEY(`fromCurrency`, `toCurrency`))");
    }
}
