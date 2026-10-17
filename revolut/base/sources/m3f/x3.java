package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class x3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3 f202518c = new x3();

    private x3() {
        super(76, 77);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        try {
            database.execSQL("ALTER TABLE `instrument_tickers` ADD COLUMN `tickerType` TEXT");
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }
}
