package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i1 f202426c = new i1();

    private i1() {
        super(15, 16);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `reports` (\n`portfolioId` TEXT NOT NULL,\n`from` INTEGER NOT NULL,\n`to` INTEGER NOT NULL,\nPRIMARY KEY(`portfolioId`, `from`, `to`),\nFOREIGN KEY(`portfolioId`) REFERENCES `portfolios`(`id`)\nON UPDATE NO ACTION \nON DELETE CASCADE )");
    }
}
