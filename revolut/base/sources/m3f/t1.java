package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class t1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1 f202492c = new t1();

    private t1() {
        super(25, 26);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n                CREATE TABLE IF NOT EXISTS `us_reports` (\n                    `portfolioId` TEXT NOT NULL,\n                    `from` INTEGER NOT NULL,\n                    `to` INTEGER NOT NULL,\n                    PRIMARY KEY(`portfolioId`, `from`, `to`),\n                    FOREIGN KEY(`portfolioId`) REFERENCES `portfolios`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE \n                )\n                ");
    }
}
