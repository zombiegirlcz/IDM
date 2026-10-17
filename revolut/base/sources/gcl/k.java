package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f142539c = new k();

    private k() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("CREATE TABLE IF NOT EXISTS `portfolioSettings` (\n    `portfolioId` TEXT NOT NULL,\n    `stockBuyBlockState` TEXT NOT NULL,\n    `stockBuyBlockDeactivationTime` INTEGER,\n    PRIMARY KEY(`portfolioId`)\n)");
    }
}
