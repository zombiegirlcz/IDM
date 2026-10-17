package lrl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f199560c = new k();

    private k() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `trading_orders` ADD COLUMN `expectedSettlementDate` INTEGER");
    }
}
