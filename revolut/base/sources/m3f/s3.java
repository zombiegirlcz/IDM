package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class s3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s3 f202488c = new s3();

    private s3() {
        super(71, 72);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `commodity_trade` TEXT DEFAULT NULL");
    }
}
