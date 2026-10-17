package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends Migration {
    public e2() {
        super(16, 17);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `merchant_stat` (`uuid` TEXT NOT NULL, `liked` INTEGER, `likes` INTEGER NOT NULL, `dislikes` INTEGER NOT NULL, `dirty` INTEGER, PRIMARY KEY(`uuid`))");
    }
}
