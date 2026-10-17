package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class z1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z1 f202527c = new z1();

    private z1() {
        super(30, 31);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `portfolioSettings` (\n`portfolioId` TEXT NOT NULL,\n`stockBuyBlockState` TEXT NOT NULL,\n`stockBuyBlockDeactivationTime` INTEGER,\nPRIMARY KEY(`portfolioId`),\nFOREIGN KEY(`portfolioId`) REFERENCES `portfolios`(`id`)\nON UPDATE NO ACTION \nON DELETE CASCADE )");
    }
}
