package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f3 extends Migration {
    public f3() {
        super(191, 192);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `transaction_links` (`child_id` TEXT NOT NULL, `parentId` TEXT NOT NULL, PRIMARY KEY(`child_id`))");
    }
}
